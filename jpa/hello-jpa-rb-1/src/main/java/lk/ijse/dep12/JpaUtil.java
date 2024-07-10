package lk.ijse.dep12;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.IOException;
import java.util.Properties;

public class JpaUtil {

    private static final EntityManagerFactory emf = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {
        Properties properties = new Properties();
        try {
            /*read resource bundle and load its properties*/
            properties.load(JpaUtil.class.getResourceAsStream("/application.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /* give the name of persistence unit name and the properties */
        return Persistence.createEntityManagerFactory("dep-12", properties);
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
