
package implementation;

import entity.OrderCode;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.NewHibernateUtil;


public class dyeingImp{
   
    public void save(OrderCode orderCode) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.save(orderCode);
        tr.commit();
    }


    public List<OrderCode> getOrderCodes() {
        List<OrderCode> list = new ArrayList<>();
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        list = sn.createCriteria(OrderCode.class).list();
        tr.commit();

        return list;
    }


    public void update(OrderCode orderCode) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.saveOrUpdate(orderCode);
        tr.commit();
    }


    public void delete(OrderCode orderCode) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.delete(orderCode);
        tr.commit();
    }
}
