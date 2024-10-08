package com.selftechlearner.patient_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PatientController {

    @Value("${common.msg}")
    private String commonMsg;
    @Value("${my.name}")
    private String myName;
    @Value("${test.msg}")
    private String testMsg;

    @GetMapping("/name")
    public String getName() {
        return String.format("""
                {
                    "commonMsg": "%s",
                    "myName": "%s",
                    "testMsg": "%s"
                }
                """, commonMsg, myName, testMsg);
    }
}
