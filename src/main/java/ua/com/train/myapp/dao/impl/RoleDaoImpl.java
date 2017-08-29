package ua.com.train.myapp.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.train.myapp.dao.RoleDao;
import ua.com.train.myapp.model.Role;


@Repository(value = "roleDaoImpl")
public class RoleDaoImpl extends GeneralDaoImpl<Integer, Role> implements RoleDao {

    @Autowired
    public RoleDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
