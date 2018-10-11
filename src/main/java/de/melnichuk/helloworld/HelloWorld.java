package de.melnichuk.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorld {
    public static void main(String... args) {
        SpringApplication.run(HelloWorld.class);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
