package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FormData;
import com.example.demo.repository.FormDataRepository;

@Service
public class FormDataService {
    private final FormDataRepository formDataRepository;

    @Autowired
    public FormDataService(FormDataRepository formDataRepository) {
        this.formDataRepository = formDataRepository;
    }

    public void saveFormData(FormData formData) {
        formDataRepository.save(formData);
    }
}
