package com.argocd.sampleapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/healthcheck")
    ResponseEntity<?> healthcheck() {
        Map<String, String> resp = new HashMap<>();
        resp.put("health", "ok");
        return ResponseEntity.ok(resp);
    }

    @GetMapping("/api/test")
    ResponseEntity<?> test() {
        Map<String, String> resp = new HashMap<>();
        resp.put("test", "ok");
        return ResponseEntity.ok(resp);
    }

}
