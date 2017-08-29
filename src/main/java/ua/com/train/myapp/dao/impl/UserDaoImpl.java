package ua.com.train.myapp.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.train.myapp.dao.UserDao;
import ua.com.train.myapp.model.User;

import javax.transaction.Transactional;


@Repository(value = "userDaoImpl")
public class UserDaoImpl extends GeneralDaoImpl<Integer, User> implements UserDao {

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}