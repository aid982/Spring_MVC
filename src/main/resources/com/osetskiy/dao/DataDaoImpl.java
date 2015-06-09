/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.dao;

import com.osetskiy.model.Merchandise;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Osetskiy
 */
public class DataDaoImpl implements DataDao {
     @Autowired
     SessionFactory sessionFactory;

     public List<Merchandise> getList() {
          Session session = sessionFactory.openSession();
          List<Merchandise> merchandises = session.createQuery("from Merchandise").list();
          session.close();
          return merchandises;
          
     }

     public Merchandise getMerchandiseById(String id) {
          Session session = sessionFactory.openSession();
          session.beginTransaction();
          Merchandise merchandise = (Merchandise)session.get(Merchandise.class, id);
          session.getTransaction().commit();
          session.close();
          return merchandise;
     }

     public byte[] getImage(String id) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     

    

}
