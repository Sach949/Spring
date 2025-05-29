package com.xworkz.ecommercefacility.service;

import com.xworkz.ecommercefacility.dto.*;

public interface EcommerceSrvice {

    String saveAdminData(AdminLoginDto adminLoginDto);

    String saveSubscriptionData(SubscriptionDto subscriptionDto);

    String saveCardData(CartDto cartDto);

    String saveLoginData(LoginDto loginDto);

    String saveOrderData(OrderDto orderDto);

    String savePaymentData(PaymentDto paymentDto);

    String saveProductData(ProductDto productDto);

    String saveSellerData(SellerDto sellerDto);
}
