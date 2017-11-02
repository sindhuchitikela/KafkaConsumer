package com.tgt.omt.offer.consume.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * Listens to the test Kafka Topic to receive messages.
 *
 */
@EnableBinding(Sink.class)
@Service
public class OfferChangeConsumerService {

  private static final Logger LOGGER = LoggerFactory.getLogger(OfferChangeConsumerService.class);

  @StreamListener(Sink.INPUT)
  public void processOfferChangeEvent(Message<String> message) throws Exception {
    LOGGER.info("Message received from kafka stream: {}", message);
  }
}
