package ua.com.train.myapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.train.myapp.dao.UserDao;
import ua.com.train.myapp.model.User;

import java.util.List;


@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    public User getById(Integer id) {
        return userDao.getById(User.class, id);
    }

    @Transactional(readOnly = true)
    public List<User> getAll() {
        return userDao.getAll(User.class);
    }

    @Transactional
    public void save(User entity) {
        userDao.save(entity);
    }

    @Transactional
    public void update(User entity) {
        userDao.update(entity);
    }

    @Transactional
    public void remove(User entity) {
        userDao.remove(entity);
    }
}