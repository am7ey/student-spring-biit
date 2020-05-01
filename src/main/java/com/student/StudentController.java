package com.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping("/")
    public String getPortalHeader() {
        return "Student Portal";
    }
}
