package com.xworkz.passport.repo;

import com.xworkz.passport.entity.PassportEntity;

import java.util.List;

public interface PassportRepo {

    String saveData(PassportEntity entity);

    List<PassportEntity> getAll();

    PassportEntity getApplicantById(int id);
}
