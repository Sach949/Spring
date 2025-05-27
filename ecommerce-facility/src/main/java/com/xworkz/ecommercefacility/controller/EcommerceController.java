package com.xworkz.ecommercefacility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EcommerceController {

    @GetMapping("redirectToRegister")
    public String getRegisterPage(){
        return "register.jsp";
    }

    @GetMapping("redirectToLogin")
    public String gotoLoginPage(){
        return "login.jsp";
    }

    @GetMapping("redirectToAdmin")
    public String loginAsAnAdmin(){
        return "admin.jsp";
    }

    @GetMapping("redirectToCart")
    public String getCartPage(){
        return "cart.jsp";
    }

    @GetMapping("redirectToAddress")
    public String getAddressPage(){
        return "address.jsp";
    }

    @GetMapping("redirectToOrder")
    public String getOrderPage(){
        return "order.jsp";
    }

    @GetMapping("redirectToPayment")
    public String getPaymentPage(){
        return "payment.jsp";
    }

    @GetMapping("redirectToProduct")
    public String getProductPage(){
        return "productDetails.jsp";
    }

    @GetMapping("redirectToSubscription")
    public String getSubscriptionPage(){
        return "subscription.jsp";
    }

    @GetMapping("redirectToSellerPage")
    public String getSellerPage(){
        return "sellerAccount.jsp";
    }

}
