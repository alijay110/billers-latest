package com.experts.core.biller.statemachine.api.spintegrations.gateway.shared;

public interface SpringIntegrationBillerConstants {
    String GREETING_STRING = "Hello Integrated World!";
    String RESPONSE_MESSAGE_PAYLOAD = "This is a response!";
    String NUMBER_STRING = "1234567";
    Long NUMBER_VALUE = 1234567L;
    long RECEIVE_TIMEOUT_5000_MILLISECONDS = 5000L;
    long RECEIVE_TIMEOUT_500_MILLISECONDS = 500L;
    long SEND_TIMEOUT_500_MILLISECONDS = 500L;
    long DELAY_TIMEOUT_2000_MILLISECONDS = 2000L;
    String METADATA_KEY = "ivanHdrTest";
    String METADATA_VALUE = "test-data";
    String PUBSUB_CHANNEL_NAME = "MyPubSubChannel";
    String FLUX_CHANNEL_NAME = "MyFluxChannel";
    String DIRECT_CHANNEL_NAME = "MyDirectChannel";
    String NULL_CHANNEL_NAME = "MyNullChannel";
    String EXECUTOR_CHANNEL_NAME = "MyExecutorChannel";
    String QUEUE_CHANNEL_NAME = "MyQueueChannel";
    String WIRETAP_QUEUE_CHANNEL_NAME = "MyWiretapQueueChannel";
    String RENDEZVOUS_CHANNEL_NAME = "MyRendezvousChannel";
    String RENDEZVOUS_REPLY_CHANNEL_NAME = "MyRendezvousReplyChannel";
    String PRIORITY_CHANNEL_NAME = "MyPriorityChannel";
    String ERROR_CHANNEL_NAME = "mySpecialErrorChannel";
    String CUSTOM_PRIORITY_HEADER = "myCustomPriorityHeader";
    int METRICSTEST_MESSAGE_COUNT = 40;
    long METRICSTEST_MAX_DELAY = 100;
    String MESSAGE_HEADER_NAME = "myMessageHeaderName";
    String MESSAGE_HEADER_VALUE = "myMessageHeaderValue";
}
