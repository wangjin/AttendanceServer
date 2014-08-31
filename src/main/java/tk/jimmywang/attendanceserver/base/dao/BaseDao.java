package tk.jimmywang.attendanceserver.base.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <i>Created by WangJin on 2014-08-30 23:26.
 *
 * @author WangJin
 * @version 1.0
 */
@SuppressWarnings("unchecked")
public class BaseDao {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public <T> T getObjectById(Class<T> entity, String id) {
        return (T) this.getSession().get(entity, id);
    }

    public void saveObject(Object object){
        this.getSession().save(object);
    }
}
