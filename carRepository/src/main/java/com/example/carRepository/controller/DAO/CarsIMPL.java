package com.example.carRepository.controller.DAO;

import com.example.carRepository.entity.Cars;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CarsIMPL implements CarsDAO{
    private final EntityManager entityManager;

    @Autowired
    public CarsIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public List<Cars> getAll() {
        Session currSess = entityManager.unwrap(Session.class);
        Query<Cars> myQuery = currSess.createQuery("from Cars");
        return myQuery.getResultList();
    }

    @Transactional
    @Override
    public Object getById(int id) {
        Session currSess = entityManager.unwrap(Session.class);
        Cars car = currSess.get(Cars.class, id);
        return car;
    }

    @Transactional
    @Override
    public void saveOrUpdate(Cars car) {
        Session currSess = entityManager.unwrap(Session.class);
        currSess.saveOrUpdate(car);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        Session currSess = entityManager.unwrap(Session.class);
        Cars car = currSess.get(Cars.class, theId);
        currSess.delete(car);
    }
}
