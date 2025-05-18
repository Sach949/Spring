package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDto;

import java.util.List;

public interface PassportService {

    String saveDataDto(PassportDto dto);

    List<PassportDto> getAll();

    PassportDto getApplicantById(int requestedIdFromFrontEnd);
}
