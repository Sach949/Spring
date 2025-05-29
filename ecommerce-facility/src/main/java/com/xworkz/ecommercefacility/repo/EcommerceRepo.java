package com.xworkz.ecommercefacility.repo;

import com.xworkz.ecommercefacility.entity.*;

public interface EcommerceRepo {

    boolean saveAdminData(AdminEntity adminEntity);

    boolean saveSubscriptionData(SubscriptionEntity subscriptionEntity);

    boolean saveCardData(CartEntity cartEntity);

    boolean saveLoginData(LoginEntity loginEntity);

    boolean saveOrderData(OrderEntity orderEntity);

    boolean savePaymentData(PaymentEntity paymentEntity);

    boolean saveProductData(ProductEntity productEntity);

    boolean saveSellerData(SellerEntity sellerEntity);

}
