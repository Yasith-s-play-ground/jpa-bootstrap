package lk.ijse.dep12;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class HelloJpa {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory()) {
            EntityManager em = emf.createEntityManager();

            System.out.println("EntityManagerFactory is " + emf);
            System.out.println("EntityManager is " + em);
        }
    }
}
