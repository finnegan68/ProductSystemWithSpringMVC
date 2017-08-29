package ua.com.train.myapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.train.myapp.dao.RoleDao;
import ua.com.train.myapp.model.Role;

import java.util.List;


@Service
public class RoleService {

    private RoleDao roleDao;

    @Autowired
    public RoleService(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Transactional(readOnly = true)
    public Role getById(Integer id) {
        return roleDao.getById(Role.class, id);
    }

    @Transactional(readOnly = true)
    public List<Role> getAll() {
        return roleDao.getAll(Role.class);
    }

    @Transactional
    public void save(Role entity) {
        roleDao.save(entity);
    }

    @Transactional
    public void update(Role entity) {
        roleDao.update(entity);
    }

    @Transactional
    public void remove(Role entity) {
        roleDao.remove(entity);
    }
}
