package site.fajar_project.notification;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import site.fajar_project.amqp.RabbitMQMessageProducer;

@SpringBootApplication(
        scanBasePackages = {
                "site.fajar_project.notification",
                "site.fajar_project.amqp",
        }
)
@PropertySources({
        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
})
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);

//        @Bean
//        CommandLineRunner commandLineRunner (
//                RabbitMQMessageProducer producer,
//                NotificationConfig notificationConfig
//            ){
//            return args -> {
//                producer.publish(
//                        new Person("Ali", 18),
//                        notificationConfig.getInternalExchange(),
//                        notificationConfig.getInternalNotificationRoutingKey());
//            };
//        }
//
//        record Person(String name, int age) {
//        }

    }
}
