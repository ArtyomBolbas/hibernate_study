package by.bolbas.study;

import by.bolbas.study.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class Runner {
    /*
    1. config
    2. mapping (xml; annotation)
    3. transaction
    4. ORM
    5. query (sql; hql; criteria)
     */
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    }

}
