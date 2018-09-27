package com.tugcankoparan.mail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements ApplicationRunner {
    private static Logger log = LoggerFactory.getLogger(Application.class);
    @Autowired
    private EmailService emailService;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("Spring Mail - Sending Simple Email with JavaMailSender Example");
        Mail mail = new Mail();
        mail.setFrom("xxxxxxxxx-PC");
        mail.setTo("xxxxxxxxxxxx@gmail.com");
        mail.setSubject("xxxxxxx");
        mail.setContent("xxxxxxxxx");
        emailService.sendSimpleMessage(mail);
    }
}
