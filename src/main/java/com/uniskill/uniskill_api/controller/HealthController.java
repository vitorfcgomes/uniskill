package com.uniskill.uniskill_api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "UniSkill API online!";
    }

    @GetMapping("/test")
    public String test() {
        return "Rota protegida acessada com sucesso!";
    }
}