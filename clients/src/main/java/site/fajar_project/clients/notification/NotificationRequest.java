package site.fajar_project.clients.notification;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message) {
}
