/*
 * Copyright 2017 Ivan Krizsan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.experts.core.biller.statemachine.api.spintegrations.messagechannels.subscribable;

import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.SpringIntegrationBillerConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.ExecutorChannel;
import org.springframework.integration.dispatcher.LoadBalancingStrategy;
import org.springframework.integration.dispatcher.RoundRobinLoadBalancingStrategy;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;


/**
 * Exercises demonstrating use of Spring Integration executor message channels.
 * Executor message channels behave the same as direct channels in most aspects,
 * except for when dispatching messages from the message channel.
 * In the case of executor message channels, depending on which executor is configured,
 * messages are usually dispatched by another thread and not the client thread that
 * sent the message.
 *
 * @author Ivan Krizsan
 * @see ExecutorChannel
 * @see DirectChannel
 */
public class ExecutorChannelBillerCore implements SpringIntegrationBillerConstants {
    /* Constant(s): */
    protected static final Log LOGGER = LogFactory.getLog(ExecutorChannelBillerCore.class);

    public void singleSubscriberAndSendReceiveThreadTest() throws Exception {
        final ThreadPoolTaskExecutor theExecutorChannelExecutor;
        final ExecutorChannel theExecutorChannel;
        final Message<String> theInputMessage;
        final List<Message> theSubscriberReceivedMessages =
            new CopyOnWriteArrayList<>();
        final AtomicLong theSubscriberThreadId = new AtomicLong(0);
        final long theSenderThreadId;

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /*
         * Create and initialize the executor that the executor channel will
         * use for message dispatching.
         */
        theExecutorChannelExecutor = new ThreadPoolTaskExecutor();
        theExecutorChannelExecutor.initialize();

        theExecutorChannel = new ExecutorChannel(theExecutorChannelExecutor);
        theExecutorChannel.setComponentName(EXECUTOR_CHANNEL_NAME);

        /*
         * Create a subscriber (message handler) that adds each received message
         * to a list. Register the subscriber with the subscribable message channel.
         */
        final MessageHandler theSubscriber = inMessage -> {
            theSubscriberThreadId.set(Thread.currentThread().getId());
            theSubscriberReceivedMessages.add(inMessage);
        };
        theExecutorChannel.subscribe(theSubscriber);

        theSenderThreadId = Thread.currentThread().getId();
        theExecutorChannel.send(theInputMessage);
        // </editor-fold>
        /*await().atMost(2, TimeUnit.SECONDS).until(() -> theSubscriberReceivedMessages.size() > 0);*/

        /*
         * The sender and the subscriber should have been executed by different
         * threads and thus does not support transactions spanning sender and
         * receiver.
         */
        /*Assert.assertNotEquals(
            "Sender and subscriber should be executed by different threads",
            theSenderThreadId, theSubscriberThreadId.get());

        Assert.assertTrue("A single message should have been received",
            theSubscriberReceivedMessages.size() == 1);

        final Message<?> theOutputMessage = theSubscriberReceivedMessages.get(0);
        final Object theOutputPayload = theOutputMessage.getPayload();
        Assert.assertEquals("Input and output payloads should be the same",
            GREETING_STRING,
            theOutputPayload);*/
    }


    public void multipleSubscribersTest() throws Exception {
        final ThreadPoolTaskExecutor theExecutorChannelExecutor;
        final ExecutorChannel theExecutorChannel;
        final Message<String> theInputMessage;
        final List<Message> theFirstSubscriberReceivedMessages =
            new CopyOnWriteArrayList<>();
        final List<Message> theSecondSubscriberReceivedMessages =
            new CopyOnWriteArrayList<>();

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /*
         * Create and initialize the executor that the executor channel will
         * use for message dispatching.
         */
        theExecutorChannelExecutor = new ThreadPoolTaskExecutor();
        theExecutorChannelExecutor.initialize();

        theExecutorChannel = new ExecutorChannel(theExecutorChannelExecutor);
        theExecutorChannel.setComponentName(EXECUTOR_CHANNEL_NAME);

        /*
         * Create two subscribers (message handler) that adds each received
         * message to a list.
         */
        final MessageHandler theFirstSubscriber =
            theFirstSubscriberReceivedMessages::add;
        final MessageHandler theSecondSubscriber =
            theSecondSubscriberReceivedMessages::add;

        /* Register the subscribers with the subscribable message channel. */
        final boolean theFirstSubscribedFlag =
            theExecutorChannel.subscribe(theFirstSubscriber);
        final boolean theSecondSubscribedFlag =
            theExecutorChannel.subscribe(theSecondSubscriber);

        /*Assert.assertTrue(theFirstSubscribedFlag);
        Assert.assertTrue(theSecondSubscribedFlag);*/

        theExecutorChannel.send(theInputMessage);
        // </editor-fold>
        /*await().atMost(2, TimeUnit.SECONDS).until(() ->
            theFirstSubscriberReceivedMessages.size() > 0);*/

        /*Assert.assertTrue(
            "A single message should have been received by first subscriber",
            theFirstSubscriberReceivedMessages.size() == 1);
        Assert.assertTrue("No message should have been received by second subscriber",
            theSecondSubscriberReceivedMessages.size() == 0);*/
    }


    public void loadBalancingTest() throws Exception {
        final ThreadPoolTaskExecutor theExecutorChannelExecutor;
        final ExecutorChannel theExecutorChannel;
        final Message<String> theInputMessage1;
        final Message<String> theInputMessage2;
        final List<Message> theFirstSubscriberReceivedMessages =
            new CopyOnWriteArrayList<>();
        final List<Message> theSecondSubscriberReceivedMessages =
            new CopyOnWriteArrayList<>();

        theInputMessage1 = MessageBuilder.withPayload("1").build();
        theInputMessage2 = MessageBuilder.withPayload("2").build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">

        final LoadBalancingStrategy theLoadBalancingStrategy =
            new RoundRobinLoadBalancingStrategy();
        /*
         * Create and initialize the executor that the executor channel will
         * use for message dispatching.
         */
        theExecutorChannelExecutor = new ThreadPoolTaskExecutor();
        theExecutorChannelExecutor.initialize();

        /*
         * Explicitly set the round-robin load balancing strategy thought it is
         * not necessary since it is the default load balancing strategy used by
         * the executor message channel. Thus this would have sufficed:
         * theExecutorChannel = new ExecutorChannel(theExecutorChannelExecutor);
         */
        theExecutorChannel = new ExecutorChannel(theExecutorChannelExecutor,
            theLoadBalancingStrategy);
        theExecutorChannel.setComponentName(EXECUTOR_CHANNEL_NAME);

        /*
         * Create two subscribers (message handler) that adds each received
         * message to a list.
         */
        final MessageHandler theFirstSubscriber =
            theFirstSubscriberReceivedMessages::add;
        final MessageHandler theSecondSubscriber =
            theSecondSubscriberReceivedMessages::add;

        /* Register the subscribers with the message channel. */
        final boolean theFirstSubscribedFlag =
            theExecutorChannel.subscribe(theFirstSubscriber);
        final boolean theSecondSubscribedFlag =
            theExecutorChannel.subscribe(theSecondSubscriber);

       /* Assert.assertTrue(theFirstSubscribedFlag);
        Assert.assertTrue(theSecondSubscribedFlag);
*/
        theExecutorChannel.send(theInputMessage1);
        theExecutorChannel.send(theInputMessage2);
        // </editor-fold>
        /*await().atMost(2, TimeUnit.SECONDS).until(() ->
            theFirstSubscriberReceivedMessages.size() > 0);*/

        /*Assert.assertTrue(
            "A single message should have been received by first subscriber",
            theFirstSubscriberReceivedMessages.size() == 1);
        Assert.assertEquals("The first subscriber should receive the first message",
            "1",
            theFirstSubscriberReceivedMessages.get(0).getPayload());
        Assert.assertTrue(
            "A single message should have been received by second subscriber",
            theSecondSubscriberReceivedMessages.size() == 1);
        Assert.assertEquals("The second subscriber should receive the second message",
            "2",
            theSecondSubscriberReceivedMessages.get(0).getPayload());*/
    }
}
