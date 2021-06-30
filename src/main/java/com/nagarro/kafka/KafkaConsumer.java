package com.nagarro.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nagarro.model.Notification;
import com.nagarro.repository.NotificationRepository;

@Component
public class KafkaConsumer {
	@Autowired
	private NotificationRepository notificationRepository;

	@KafkaListener(topics = "UserEvents")
	public void processMessage(String message) {
		System.out.println(message);
		Notification notification = Notification.builder().message(message).build();
		notificationRepository.save(notification);

	}

}
