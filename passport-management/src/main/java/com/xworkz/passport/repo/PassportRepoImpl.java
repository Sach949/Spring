package com.xworkz.passport.repo;

import com.xworkz.passport.entity.PassportEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

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

    @Override
    public List<PassportEntity> getAll() {
        return Persistence.createEntityManagerFactory("myname")
                .createEntityManager().createNamedQuery("getAll").getResultList();
    }

    @Override
    public PassportEntity getApplicantById(int requestedIdFromFrontEnd) {
        return (PassportEntity) Persistence.createEntityManagerFactory("myname")
                .createEntityManager().createNamedQuery("findApplicantById").setParameter("id",requestedIdFromFrontEnd)
                .getSingleResult();
    }

    @Override
    public Boolean updateApplicationById(int regID, String applicantName, String fatherName, String motherName, String dob, long contactNo, String email, String address, String selectOfficeForVerification, String bodyMark) {

        EntityManager entityManager = Persistence.createEntityManagerFactory("myname")
                .createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updateById");
        query.setParameter("name",applicantName);
        query.setParameter("father",fatherName);
        query.setParameter("mother",motherName);
        query.setParameter("dob",dob);
        query.setParameter("contact",contactNo);
        query.setParameter("email",email);
        query.setParameter("addr",address);
        query.setParameter("office",selectOfficeForVerification);
        query.setParameter("mark",bodyMark);
        query.setParameter("regId",regID);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        return true;
    }

}
