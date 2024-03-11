package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FormData;
import com.example.demo.service.FormDataService;

@RestController
@RequestMapping("/api")
public class FormController {
    private final FormDataService formDataService;

    @Autowired
    public FormController(FormDataService formDataService) {
        this.formDataService = formDataService;
    }

    @PostMapping("/submitForm")
    public ResponseEntity<String> submitForm(@RequestBody FormData formData) {
        formDataService.saveFormData(formData);
        return ResponseEntity.ok("Form submitted successfully");
    }
}
