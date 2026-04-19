package com.example.jobportal.company.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @GetMapping(version = "1.0")
    public ResponseEntity<String> getAllCompanies() {
        return ResponseEntity.ok("Companies List");
    }

    @GetMapping(version = "2.0")
    public ResponseEntity<String> getAllCompaniesV2() {
        return ResponseEntity.ok("Companies List 2.0");
    }
}
