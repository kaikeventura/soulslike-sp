package com.kaikeventura.soulslike_sp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/blog"})
public class HelloWorldController {

    private final String x;

    public HelloWorldController(String x) {
        this.x = x;
    }

    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @GetMapping(value = {""})
    public String test() {
        return x;
    }
}
