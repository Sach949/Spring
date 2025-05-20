package com.xworkz.passport.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Data
public class PassportDto {

    private int regID;
    private String applicantName;
    private String fatherName;
    private String motherName;
    private String dob;
    private long contactNo;
    private String email;
    private String address;
    private String selectOfficeForVerification;
    private String bodyMark;

}
