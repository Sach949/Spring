package com.xworkz.ecommercefacility.repo;

import com.xworkz.ecommercefacility.entity.RegisterEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@Repository
public class RegisterRepoImpl implements RegisterRepo{

    @Override
    public String saveRegisterData(RegisterEntity registerEntity) {

        EntityManager entityManager = Persistence.createEntityManagerFactory("myname").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(registerEntity);
        System.out.println("Data is saved");
        System.out.println("date is: "+entityManager);
        entityManager.getTransaction().commit();
        return "saved";
    }
}
