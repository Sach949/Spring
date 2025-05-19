package com.xworkz.passport.repo;

import com.xworkz.passport.entity.PassportEntity;

import java.util.List;

public interface PassportRepo {

    String saveData(PassportEntity entity);

    List<PassportEntity> getAll();

    PassportEntity getApplicantById(int id);

    Boolean updateApplicationById(int regID,String applicantName,String fatherName,String motherName,String dob,long contactNo
   ,String email,String address,String selectOfficeForVerification,String bodyMark);
}
