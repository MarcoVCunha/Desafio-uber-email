package com.kipper.emailService.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
