package shop.zubiri.videoclub.persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

import shop.zubiri.videoclub.dominio.Inventario;

@org.springframework.context.annotation.Configuration
public class PersistenciaConf {

    @Bean
    public IPersistencia<Inventario> inventarioPersistencia()
    {
        return new Persistencia<Inventario>(getSession(), Inventario.class);
    }

    public Session getSession()
    {
        Configuration conf = new Configuration();

        SessionFactory sessionFactory = conf.configure().addAnnotatedClass(Inventario.class)
                                                        .buildSessionFactory();

        Session session = sessionFactory.openSession();

        return session;
    }
    
}
