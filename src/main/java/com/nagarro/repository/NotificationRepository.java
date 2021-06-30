package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
