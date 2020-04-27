package com.github.shibadog.sample.jackson;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.Data;


@SpringBootApplication
@RestController
public class JacksonApplication {

    public static void main(String[] args) {
        SpringApplication.run(JacksonApplication.class, args);
    }

    @PostMapping(value="/")
    public Map<String, Object> postMethodName(@RequestBody SampleBody entity) {
        return Map.of("result", "OK", "entity", entity);
    }

    @Data
    public static class SampleBody {
        private String nakami;
    }
}
