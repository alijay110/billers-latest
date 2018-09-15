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

package com.experts.core.biller.statemachine.api.spintegrations.messagechannels.pollable;

import com.experts.core.biller.statemachine.api.spintegrations.gateway.LoggingAndCountingChannelInterceptor;
import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.SpringIntegrationBillerConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.config.EnableIntegrationManagement;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


@EnableIntegration
@Configuration
@EnableIntegrationManagement
@Component
public class QueueChannelBiller implements SpringIntegrationBillerConstants {
    /* Constant(s): */
    protected static final Log LOGGER = LogFactory.getLog(QueueChannelBiller.class);


    public void successfullyPollingMessageTest() throws Exception {
        final QueueChannel theQueueChannel;
        final Message<String> theInputMessage;
        final Message<?> theOutputMessage;

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        theQueueChannel = new QueueChannel();
        /* Set the name of the channel which will be included in exceptions and log messages. */
        theQueueChannel.setComponentName(QUEUE_CHANNEL_NAME);

        theQueueChannel.send(theInputMessage);

        theOutputMessage =
            theQueueChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        final Object theOutputMessagePayload = theOutputMessage.getPayload();
        // </editor-fold>

        /*Assert.assertEquals("Input and output payloads should be the same",
            GREETING_STRING,
            theOutputMessagePayload);*/
    }


    public void withInterceptorTest() throws Exception {
        final QueueChannel theQueueChannel;
        final Message<String> theInputMessage;
        final Message<?> theOutputMessage;
        final LoggingAndCountingChannelInterceptor theLoggingAndCountingChannelInterceptor;

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        theQueueChannel = new QueueChannel();
        theQueueChannel.setComponentName(DIRECT_CHANNEL_NAME);

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        theLoggingAndCountingChannelInterceptor = new LoggingAndCountingChannelInterceptor();
        theQueueChannel.addInterceptor(theLoggingAndCountingChannelInterceptor);

        theQueueChannel.send(theInputMessage);

        theOutputMessage =
            theQueueChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        final Object theOutputMessagePayload = theOutputMessage.getPayload();
        // </editor-fold>

        /*Assert.assertEquals("Input and output payloads should be the same",
            GREETING_STRING,
            theOutputMessagePayload);*/

        /*
         * Sending message should have been intercepted at three occasions.
         * Receiving message should have been intercepted at three occasions.
         */
        /*Assert.assertEquals(
            "Sending should have been intercepted before the message being sent",
            1,
            theLoggingAndCountingChannelInterceptor.getPreSendMessageCount());
        Assert.assertEquals(
            "Sending should have been intercepted after the message having been sent",
            1,
            theLoggingAndCountingChannelInterceptor.getPostSendMessageCount());
        Assert.assertEquals("Message sending should have completed", 1,
            theLoggingAndCountingChannelInterceptor.getAfterSendCompletionMessageCount());

        Assert.assertEquals(
            "Receiving should have been intercepted before the message was received",
            1,
            theLoggingAndCountingChannelInterceptor.getPreReceiveMessageCount());
        Assert.assertEquals(
            "Receiving should have been intercepted after the message having been sent",
            1,
            theLoggingAndCountingChannelInterceptor.getPostReceiveMessageCount());
        Assert.assertEquals("Message receiving should have completed", 1,
            theLoggingAndCountingChannelInterceptor.getAfterReceiveCompletionMessageCount());*/
    }


    public void sendingCapacityLimitReachedTest() throws Exception {
        final QueueChannel theQueueChannel;
        final Message<String> theInputMessage1;
        final Message<String> theInputMessage2;
        final boolean theSendSuccessFlag1;
        final boolean theSendSuccessFlag2;

        theInputMessage1 = MessageBuilder.withPayload("1").build();
        theInputMessage2 = MessageBuilder.withPayload("2").build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        theQueueChannel = new QueueChannel(1);
        /* Set the name of the channel which will be included in exceptions and log messages. */
        theQueueChannel.setComponentName(QUEUE_CHANNEL_NAME);

        /*
         * If a timeout is used when sending messages to a QueueChannel, then the send operation
         * will timeout if the QueueChannel has reached its capacity and the message will not
         * be placed on the queue.
         */
        theSendSuccessFlag1 =
            theQueueChannel.send(theInputMessage1, SEND_TIMEOUT_500_MILLISECONDS);
        theSendSuccessFlag2 =
            theQueueChannel.send(theInputMessage2, SEND_TIMEOUT_500_MILLISECONDS);
        // </editor-fold>

        /*Assert.assertTrue("Sending first message should succeed",
            theSendSuccessFlag1);
        Assert.assertFalse("Sending second message should fail",
            theSendSuccessFlag2);
        Assert.assertEquals("One single message should be in the queue channel",
            1,
            theQueueChannel.getQueueSize());*/
    }


    public void pollingMessageEmptyQueueChannelWithTimeout() throws Exception {
        final QueueChannel theQueueChannel;
        final Message<?> theOutputMessage;

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        theQueueChannel = new QueueChannel();
        /* Set the name of the channel which will be included in exceptions and log messages. */
        theQueueChannel.setComponentName(QUEUE_CHANNEL_NAME);

        theOutputMessage =
            theQueueChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        // </editor-fold>

        /*Assert.assertNull(
            "Null should be the result when a receive from an empty queue channel timed out",
            theOutputMessage);*/
    }
}
