package com.xworkz.passport.repo;

import com.xworkz.passport.entity.PassportEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@Repository
public class PassportRepoImpl implements PassportRepo{
    @Override
    public String saveData(PassportEntity entity) {
        EntityManager manager = Persistence.createEntityManagerFactory("myname").createEntityManager();
        manager.getTransaction().begin();
        manager.persist(entity);
        System.out.println("Data is saved");
        System.out.println("Data is: "+manager);
        manager.getTransaction().commit();
        return "not Saved";
    }
}
