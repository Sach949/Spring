package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repo.PassportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            passportEntity.setApplicantName(dto.getApplicantName());
            passportEntity.setFatherName(dto.getFatherName());
            passportEntity.setMotherName(dto.getMotherName());
            passportEntity.setDob(dto.getDob());
            passportEntity.setContactNo(dto.getContactNo());
            passportEntity.setEmail(dto.getEmail());
            passportEntity.setAddress(dto.getAddress());
            passportEntity.setSelectOfficeForVerification(dto.getSelectOfficeForVerification());
            passportEntity.setBodyMark(dto.getBodyMark());
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
        entityList.forEach(a->{
            System.out.println("List of passport entity: "+a.toString());
        });
        return Collections.emptyList();
    }
}
