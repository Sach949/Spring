package com.xworkz.passport.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "passport_info")
@NamedQuery(name ="getAll", query = "select p from PassportEntity p")
@NamedQuery(name ="findApplicantById", query = "select p from PassportEntity p where p.regID =:id")
@NamedQuery(name = "updateById", query = "update PassportEntity p set p.applicantName =:name," +
        "p.fatherName=:father, p.motherName=:mother,p.dob=:dob, p.contactNo=:contact," +
        "p.email=:email, p.address=:addr, p.selectOfficeForVerification=:office," +
        "p.bodyMark=:mark where p.regID=:regId")
@Data
public class PassportEntity {

    @Id
    @Column(name = "RegId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regID;

    @Column(name = "Applicant_Name")
    private String applicantName;

    @Column(name = "Father_Name")
    private String fatherName;

    @Column(name = "Mother_Name")
    private String motherName;

    @Column(name = "Date_Of_Birth")
    private String dob;

    @Column(name = "Contact_Number")
    private long contactNo;

    @Column(name = "Email")
    private String email;

    @Column(name = "Address")
    private String address;

    @Column(name = "Select_Office_Verification")
    private String selectOfficeForVerification;

    @Column(name = "Mark_on_Body")
    private String bodyMark;

}
