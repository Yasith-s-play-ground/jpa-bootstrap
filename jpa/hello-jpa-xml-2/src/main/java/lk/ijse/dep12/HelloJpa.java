package lk.ijse.dep12;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class HelloJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();

        System.out.println("Entity manager factory : "+emf);
        System.out.println("Entity manager : "+em);
    }
}
