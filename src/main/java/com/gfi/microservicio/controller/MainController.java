package com.gfi.microservicio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gfi.microservicio.models.Saludos;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MainController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Saludos greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Saludos(counter.incrementAndGet(),
                String.format(template, name));
    }


}
