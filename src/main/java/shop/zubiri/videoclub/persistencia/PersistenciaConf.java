package shop.zubiri.videoclub.persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import shop.zubiri.videoclub.dominio.Inventario;

@org.springframework.context.annotation.Configuration
public class PersistenciaConf {

    public Session getSession()
    {
        /* StandardServiceRegistry registry =
				new StandardServiceRegistryBuilder()
                        .configure()
						.build();

        SessionFactory sessionFactory = new MetadataSources(registry)
							.addAnnotatedClass(Pelicula.class)
							.buildMetadata()
							.buildSessionFactory(); */

        Configuration conf = new Configuration();

        SessionFactory sessionFactory = conf.configure().addAnnotatedClass(Inventario.class)
                                                        .buildSessionFactory();

        Session session = sessionFactory.openSession();

        return session;
    }
    
}
