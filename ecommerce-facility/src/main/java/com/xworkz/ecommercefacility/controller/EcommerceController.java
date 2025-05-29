package com.xworkz.ecommercefacility.controller;

import com.xworkz.ecommercefacility.dto.*;
import com.xworkz.ecommercefacility.entity.RegisterEntity;
import com.xworkz.ecommercefacility.repo.RegisterRepo;
import com.xworkz.ecommercefacility.service.AddressService;
import com.xworkz.ecommercefacility.service.EcommerceSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EcommerceController {

    @Autowired
    AddressService service;

    @Autowired
    EcommerceSrvice ecommerceSrvice;

    @GetMapping("redirectToRegister")
    public String getRegisterPage(){
        return "register.jsp";
    }

    @PostMapping("/register")
    public String getData(RegisterEntity entity) {
//        repo.saveRegisterData(entity);
        System.out.println(entity);
//        System.out.println(name+" "+email+" "+mobile);
//        model.addAttribute("name", name);
//        model.addAttribute("email", email);
//        model.addAttribute("mobile", mobile);
        return "success.jsp";
    }


    @GetMapping("redirectToLogin")
    public String gotoLoginPage(){
        return "login.jsp";
    }

    @PostMapping("/login")
    public String login(LoginDto dto, Model model){
        System.out.println(dto.getUsername()+" "+ dto.getPassword());
        String message = ecommerceSrvice.saveLoginData(dto);
        model.addAttribute("msg",message);
        return "loginSuccess.jsp";
    }

    @GetMapping("redirectToAdmin")
    public String loginAsAnAdmin(){
        return "admin.jsp";
    }

    @PostMapping("/adminLogin")
    public String getAdminLogin(AdminLoginDto dto, Model model){
        System.out.println(dto.getAdminId()+" "+dto.getUsername()+" "+ dto.getPassword());
        String message = ecommerceSrvice.saveAdminData(dto);
        model.addAttribute("msg",message);
        return "adminSuccess.jsp";
    }


    @GetMapping("redirectToCart")
    public String getCartPage(){
        return "cart.jsp";
    }

    @PostMapping("/cart")
    public String getCart(CartDto dto, Model model){
        System.out.println(dto.getProductName()+" "+dto.getTotalNo()+" "+dto.getTotalPrice());
        String message = ecommerceSrvice.saveCardData(dto);
        model.addAttribute("msg",message);
        return "cartSuccess.jsp";
    }

    @GetMapping("redirectToAddress")
    public String getAddressPage(){
        return "address.jsp";
    }

    @PostMapping("/address")
    public String getAddress(AddressDto dto, Model model){
        System.out.println("Address is: "+dto);
        String message = service.saveAddressData(dto);
        model.addAttribute("msg", message);
//        System.out.println(address+" "+addressType+" "+mobile);
//        model.addAttribute("address",address);
//        model.addAttribute("addressType", addressType);
//        model.addAttribute("mobile", mobile);
        return "addressSuccess.jsp";
    }

    @GetMapping("redirectToOrder")
    public String getOrderPage(){
        return "order.jsp";
    }

    @PostMapping("/order")
    public String getOrder(OrderDto dto, Model model){
        System.out.println(dto.getProductName()+" "+dto.getPrice()+" "+dto.getDateOfPurchase());
        String message = ecommerceSrvice.saveOrderData(dto);
        model.addAttribute("msg", message);
        return "orderSuccess.jsp";
    }

    @GetMapping("redirectToPayment")
    public String getPaymentPage(){
        return "payment.jsp";
    }

    @PostMapping("/payment")
    public String getPayment(PaymentDto dto, Model model){
        System.out.println(dto.getPaymentMode()+" "+dto.getAmount()+" "+dto.getStatus());
        String message = ecommerceSrvice.savePaymentData(dto);
        model.addAttribute("msg", message);
        return "paymentSuccess.jsp";
    }

    @GetMapping("redirectToProduct")
    public String getProductPage(){
        return "productDetails.jsp";
    }

    @PostMapping("/product")
    public String getProduct(ProductDto dto, Model model){
        System.out.println(dto.getProductName()+" "+dto.getPrice()+" "+dto.getRating());
        String message = ecommerceSrvice.saveProductData(dto);
        model.addAttribute("msg", message);
        return "productDetailsSuccess.jsp";
    }

    @GetMapping("redirectToSubscription")
    public String getSubscriptionPage(){
        return "subscription.jsp";
    }

    @PostMapping("/subscription")
    public String getSubscription(SubscriptionDto dto, Model model){
        System.out.println(dto.getValidity()+" "+dto.getPrice()+" "+dto.getTypeOfSubscription());
        String message = ecommerceSrvice.saveSubscriptionData(dto);
        model.addAttribute("msg",message);
        return "subscriptionSuccess.jsp";
    }

    @GetMapping("redirectToSellerPage")
    public String getSellerPage(){
        return "sellerAccount.jsp";
    }

    @PostMapping("/seller")
    public String getSubscription(SellerDto dto, Model model){
        System.out.println(dto.getSellerName()+" "+dto.getTypeOfGoodsSelling()+" "+dto.getRegisteredDate());
        String message = ecommerceSrvice.saveSellerData(dto);
        model.addAttribute("msg", message);
        return "sellerSuccess.jsp";
    }

    @GetMapping("redirectToIndexPage")
    public String getIndexPage(){
        return "index.jsp";
    }
}
