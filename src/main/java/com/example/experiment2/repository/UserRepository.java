package com.example.experiment2.repository;

import com.example.experiment2.entity.Address;
import com.example.experiment2.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;


    public User addUser(User user) {
        em.persist(user);
        return user;
    }


    public Address addAddress(Address address, int uid) {
        return null;
    }


    public User updateUser(int uid, String newName) {
        return null;
    }


    public Address updateAddress(int aid, int uid) {
        return null;
    }

    public List<Address> listAddresses(int uid) {
        return List.of();
    }

    public void removeAddress(int aid) {

    }


    public void remaveUser(int uid) {

    }
}