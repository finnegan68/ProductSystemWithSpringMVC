package ua.com.train.myapp.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ua.com.train.myapp.dao.GeneralDao;

import java.io.Serializable;
import java.util.List;

public abstract class GeneralDaoImpl<K extends Serializable, V> implements GeneralDao<K, V> {

    private SessionFactory sessionFactory;

    public GeneralDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public V getById(Class<? extends V> entityClass, K id) {
        return getSession().get(entityClass, id);
    }

    @SuppressWarnings("unchecked")
    public List<V> getAll(Class<? extends V> entityClass) {
        return (List<V>) getSession().createCriteria(entityClass).list();
    }

    public void save(V entity) {
        getSession().save(entity);
    }

    public void update(V entity) {
        getSession().update(entity);
    }

    public void remove(V entity) {
        getSession().delete(entity);
    }
}