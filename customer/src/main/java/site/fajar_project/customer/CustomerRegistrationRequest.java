package site.fajar_project.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
