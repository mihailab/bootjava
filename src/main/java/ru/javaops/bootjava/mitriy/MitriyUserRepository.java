package ru.javaops.bootjava.mitriy;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.javaops.bootjava.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class MitriyUserRepository {

    @PersistenceContext
    private EntityManager entityManager;
    private JdbcTemplate jdbcTemplate;

    public User findUserById(Integer id) {
        return entityManager.find(User.class, id);
    }

    public Map<String, Object> findById(Integer id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForMap(sql, id);
    }

    public List<Map<String, Object>> findAll() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.queryForList(sql);
    }
}
