package com.xworkz.ecommercefacility.repo;

import com.xworkz.ecommercefacility.entity.AddressEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@Repository
public class AddressRepoImpl implements AddressRepo{


    @Override
    public boolean saveAddress(AddressEntity addressEntity) {
        boolean isSaved = false;
        if (addressEntity != null) {
            EntityManager em = Persistence.createEntityManagerFactory("myname").createEntityManager();
            em.getTransaction().begin();
            em.persist(addressEntity);
            em.getTransaction().commit();
            isSaved=true;
        }
        return isSaved;
    }
}
