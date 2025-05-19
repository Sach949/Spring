package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repo.PassportRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PassportServiceImpl implements PassportService{

    @Autowired
    PassportRepo repo;

    @Override
    public String saveDataDto(PassportDto dto) {
        System.out.println("Service method is invoked");
        if(dto != null){

            PassportEntity passportEntity = new PassportEntity();
            //passportEntity.setRegID(dto.getRegID()); as we are auto generating so not required.
//            passportEntity.setApplicantName(dto.getApplicantName());
//            passportEntity.setFatherName(dto.getFatherName());
//            passportEntity.setMotherName(dto.getMotherName());
//            passportEntity.setDob(dto.getDob());
//            passportEntity.setContactNo(dto.getContactNo());
//            passportEntity.setEmail(dto.getEmail());
//            passportEntity.setAddress(dto.getAddress());
//            passportEntity.setSelectOfficeForVerification(dto.getSelectOfficeForVerification());
//            passportEntity.setBodyMark(dto.getBodyMark());
            BeanUtils.copyProperties(dto,passportEntity);
            System.out.println("Entity data is : "+dto);
            repo.saveData(passportEntity);

        }else{
            System.out.println("Dto is null");
        }

        return "saved";
    }

    @Override
    public List<PassportDto> getAll() {
        List<PassportEntity> entityList = repo.getAll();
        List<PassportDto> dtoList = new ArrayList<>();
//        entityList.forEach(a->{
//            System.out.println("List of passport entity: "+a.toString());
//        });
        entityList.stream().forEach(dto->{
            PassportDto passportDto = new PassportDto();
            passportDto.setRegID(dto.getRegID());
            passportDto.setApplicantName(dto.getApplicantName());
            passportDto.setFatherName(dto.getFatherName());
            passportDto.setMotherName(dto.getMotherName());
            passportDto.setDob(dto.getDob());
            passportDto.setContactNo(dto.getContactNo());
            passportDto.setEmail(dto.getEmail());
            passportDto.setAddress(dto.getAddress());
            passportDto.setSelectOfficeForVerification(dto.getSelectOfficeForVerification());
            passportDto.setBodyMark(dto.getBodyMark());

            dtoList.add(passportDto);
        });
        return dtoList;
    }

    @Override
    public PassportDto getApplicantById(int requestedIdFromFrontEnd) {
        PassportDto passportDto = new PassportDto();
        if(requestedIdFromFrontEnd != 0){
           PassportEntity passportEntity = repo.getApplicantById(requestedIdFromFrontEnd);
            BeanUtils.copyProperties(passportEntity,passportDto);

        }
        System.out.println("Service :"+passportDto);
        return passportDto;
    }

    @Override
    public Boolean updateApplicationById(int regID, String applicantName, String fatherName, String motherName, String dob, long contactNo, String email, String address, String selectOfficeForVerification, String bodyMark) {
        return repo.updateApplicationById(regID,applicantName,fatherName,motherName,dob,contactNo,email,address,selectOfficeForVerification,bodyMark);
    }


}
