package ru.javaops.bootjava.mitriy;

import org.springframework.stereotype.Repository;
import ru.javaops.bootjava.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MitriyUserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public User findUserById(Integer id) {
        return entityManager.find(User.class, id);
    }
}
