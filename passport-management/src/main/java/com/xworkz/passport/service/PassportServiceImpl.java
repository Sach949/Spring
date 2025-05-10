package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repo.PassportRepo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService{

    private static final Log log = LogFactory.getLog(PassportServiceImpl.class);
    @Autowired
    PassportRepo repo;

    @Override
    public String saveDataDto(PassportDto dto) {
        System.out.println("Service method is invoked");
        if(dto != null){

            PassportEntity passportEntity = new PassportEntity();
            passportEntity.setRegID(dto.getRegID());
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
}
