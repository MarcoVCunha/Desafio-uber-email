package com.kipper.emailService.core;

public record EmailRequest(String to, String subject, String body) {
}
