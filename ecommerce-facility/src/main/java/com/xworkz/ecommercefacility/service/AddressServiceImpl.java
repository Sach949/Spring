package com.xworkz.ecommercefacility.service;

import com.xworkz.ecommercefacility.dto.AddressDto;
import com.xworkz.ecommercefacility.entity.AddressEntity;
import com.xworkz.ecommercefacility.repo.AddressRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    AddressRepo repo;

    @Override
    public String saveAddressData(AddressDto addressDto) {

        String isSaved = null;
        if(addressDto != null){
            AddressEntity entity = new AddressEntity();
            BeanUtils.copyProperties(addressDto, entity);
            boolean isCheck = repo.saveAddress(entity);
            if(isCheck){
                isSaved="Data is saved";
            }else{
                isSaved="data is not saved";
            }
        }else{
            System.out.println("dto is null");
        }
        return isSaved;
    }
}
