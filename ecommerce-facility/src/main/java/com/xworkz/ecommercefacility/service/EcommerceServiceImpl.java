package com.xworkz.ecommercefacility.service;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.xworkz.ecommercefacility.dto.*;
import com.xworkz.ecommercefacility.entity.*;
import com.xworkz.ecommercefacility.repo.EcommerceRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EcommerceServiceImpl implements EcommerceSrvice {

    @Autowired
    EcommerceRepo repo;

    @Override
    public String saveAdminData(AdminLoginDto adminLoginDto) {
        String isSaved = null;
        if(adminLoginDto != null){
            AdminEntity entity = new AdminEntity();
            BeanUtils.copyProperties(adminLoginDto, entity);
            boolean isCheck = repo.saveAdminData(entity);
            if(isCheck){
                isSaved = "Data is saved";
            }else{
                isSaved = "Data is not saved";
            }
        }else{
            System.out.println("Dto is null");
        }
        return isSaved;
    }

    @Override
    public String saveSubscriptionData(SubscriptionDto subscriptionDto) {

        String isSaved = null;
        if(subscriptionDto != null){
            SubscriptionEntity entity = new SubscriptionEntity();
            BeanUtils.copyProperties(subscriptionDto, entity);
            boolean isCheck = repo.saveSubscriptionData(entity);
            if(isCheck){
                isSaved = "Data is saved";
            }else{
                isSaved = "Data is not saved";
            }
        }else{
            System.out.println("Dto is null");
        }
        return isSaved;
    }

    @Override
    public String saveCardData(CartDto cartDto) {
        String isSaved = null;
        if(cartDto != null){
            CartEntity entity = new CartEntity();
            BeanUtils.copyProperties(cartDto, entity);
            boolean isCheck = repo.saveCardData(entity);
            if(isCheck){
                isSaved = "Data is saved";
            }else{
                isSaved = "Data is not saved";
            }
        }else{
            System.out.println("Dto is null");
        }
        return isSaved;
    }

    @Override
    public String saveLoginData(LoginDto loginDto) {

        String isSaved = null;
        if(loginDto != null){
            LoginEntity entity = new LoginEntity();
            BeanUtils.copyProperties(loginDto, entity);
            boolean isCheck = repo.saveLoginData(entity);
            if(isCheck){
                isSaved = "Data is saved";
            }else{
                isSaved = "Data is not saved";
            }
        }else{
            System.out.println("Dto is null");
        }
        return isSaved;
    }

    @Override
    public String saveOrderData(OrderDto orderDto) {
        String isSaved = null;
        if(orderDto != null){
            OrderEntity entity = new OrderEntity();
            BeanUtils.copyProperties(orderDto, entity);
            boolean isCheck = repo.saveOrderData(entity);
            if(isCheck){
                isSaved = "Data is saved";
            }else{
                isSaved = "Data is not saved";
            }
        }else{
            System.out.println("Dto is null");
        }
        return isSaved;
    }

    @Override
    public String savePaymentData(PaymentDto paymentDto) {
        String isSaved = null;
        if(paymentDto != null){
            PaymentEntity entity = new PaymentEntity();
            BeanUtils.copyProperties(paymentDto, entity);
            boolean isCheck = repo.savePaymentData(entity);
            if(isCheck){
                isSaved = "Data is saved";
            }else{
                isSaved = "Data is not saved";
            }
        }else{
            System.out.println("Dto is null");
        }
        return isSaved;
    }

    @Override
    public String saveProductData(ProductDto productDto) {
        String isSaved = null;
        if(productDto != null){
            ProductEntity entity = new ProductEntity();
            BeanUtils.copyProperties(productDto, entity);
            boolean isCheck = repo.saveProductData(entity);
            if(isCheck){
                isSaved = "Data is saved";
            }else{
                isSaved = "Data is not saved";
            }
        }else{
            System.out.println("Dto is null");
        }
        return isSaved;
    }

    @Override
    public String saveSellerData(SellerDto sellerDto) {
        String isSaved = null;
        if(sellerDto != null){
            SellerEntity entity = new SellerEntity();
            BeanUtils.copyProperties(sellerDto, entity);
            boolean isCheck = repo.saveSellerData(entity);
            if(isCheck){
                isSaved = "Data is saved";
            }else{
                isSaved = "Data is not saved";
            }
        }else{
            System.out.println("Dto is null");
        }
        return isSaved;
    }


}
