package com.xworkz.ecommercefacility.repo;

import com.xworkz.ecommercefacility.entity.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@Repository
public class EcommerceRepoImpl implements EcommerceRepo{

    @Override
    public boolean saveAdminData(AdminEntity adminEntity) {

        boolean isSaved = false;
        if(adminEntity != null){
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(adminEntity);
            em.getTransaction().commit();
            isSaved = true;
        }else{
            System.out.println("Entity is null");
        }
        return isSaved;
    }

    @Override
    public boolean saveSubscriptionData(SubscriptionEntity subscriptionEntity) {

        boolean isSaved = false;
        if(subscriptionEntity != null){
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(subscriptionEntity);
            em.getTransaction().commit();
            isSaved = true;
        }else {
            System.out.println("Entity is null");
        }
        return isSaved;
    }

    @Override
    public boolean saveCardData(CartEntity cartEntity) {
        boolean isSaved = false;
        if(cartEntity != null){
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(cartEntity);
            em.getTransaction().commit();
            isSaved = true;
        }else {
            System.out.println("Entity is null");
        }
        return isSaved;
    }

    @Override
    public boolean saveLoginData(LoginEntity loginEntity) {
        boolean isSaved = false;
        if(loginEntity != null){
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(loginEntity);
            em.getTransaction().commit();
            isSaved = true;
        }else {
            System.out.println("Entity is null");
        }
        return isSaved;
    }

    @Override
    public boolean saveOrderData(OrderEntity orderEntity) {
        boolean isSaved = false;
        if(orderEntity != null){
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(orderEntity);
            em.getTransaction().commit();
            isSaved = true;
        }else {
            System.out.println("Entity is null");
        }
        return isSaved;
    }

    @Override
    public boolean savePaymentData(PaymentEntity paymentEntity) {
        boolean isSaved = false;
        if(paymentEntity != null){
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(paymentEntity);
            em.getTransaction().commit();
            isSaved = true;
        }else {
            System.out.println("Entity is null");
        }
        return isSaved;
    }

    @Override
    public boolean saveProductData(ProductEntity productEntity) {
        boolean isSaved = false;
        if(productEntity != null){
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(productEntity);
            em.getTransaction().commit();
            isSaved = true;
        }else {
            System.out.println("Entity is null");
        }
        return isSaved;
    }

    @Override
    public boolean saveSellerData(SellerEntity sellerEntity) {
        boolean isSaved = false;
        if(sellerEntity != null){
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(sellerEntity);
            em.getTransaction().commit();
            isSaved = true;
        }else {
            System.out.println("Entity is null");
        }
        return isSaved;
    }
}
