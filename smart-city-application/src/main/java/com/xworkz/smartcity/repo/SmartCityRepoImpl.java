package com.xworkz.smartcity.repo;

import com.xworkz.smartcity.entity.SmartCityEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

@Repository
public class SmartCityRepoImpl implements SmartCityRepo{

    @Override
    public String saveCityDetails(SmartCityEntity entity) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("myname")
                .createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        System.out.println("Data is saved");
        System.out.println("Details are: "+entityManager);
        entityManager.getTransaction().commit();
        return "Details are saved";
    }

    @Override
    public List<SmartCityEntity> getAllCityDetails() {
        return Persistence.createEntityManagerFactory("myname")
                .createEntityManager().createNamedQuery("getAll").getResultList();
    }

    @Override
    public SmartCityEntity getCityById(int id) {
        return (SmartCityEntity) Persistence.createEntityManagerFactory("myname")
                .createEntityManager().createNamedQuery("findById").setParameter("cid",id)
                .getSingleResult();
    }
}
