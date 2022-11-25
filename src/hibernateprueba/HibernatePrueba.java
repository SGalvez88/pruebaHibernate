/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateprueba;

import classes.Cliente;
import dataBaseConnect.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author IFC
 */
public class HibernatePrueba {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Cliente cliente = new Cliente(0, "Sergio", "Galvez");
        
        try{
            
            session.save(cliente);
            
            transaction.commit();
//            Query query = session.createQuery("SELECT p FROM CicloFormativo p");
//            List<CicloFormativo> ciclosFormativos = query.list();
//            for (CicloFormativo cicloFormativo : ciclosFormativos) {
//                System.out.println(cicloFormativo.toString());
//            }
        }catch(Exception exception){
            
        }
        session.close();
        sessionFactory.close();
    }
    
}
