package GodwinE.entities;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.UUID;

public class LocationDAO {
    private final EntityManager entityManagerFactory;

    public LocationDAO(EntityManager entityManager)
    {
        this.entityManagerFactory = entityManager;
    }

    public void save(Location location)
    {
        EntityTransaction transaction = entityManagerFactory.getTransaction();
        transaction.begin();

        entityManagerFactory.persist(location);
        transaction.commit();
        System.out.println("New event saved created successfully");
    }

    public Event getById(UUID id)
    {
        return entityManagerFactory.find(Event.class, id);
    }

    public void delete(UUID id)
    {
        Event found = entityManagerFactory.find(Event.class, id);

        if(found != null){
            EntityTransaction transaction = entityManagerFactory.getTransaction();

            transaction.begin();
            entityManagerFactory.remove(found);

            transaction.commit();
            System.out.println("The event was deleted successfully");
        }else{
            System.out.println(id + " not found");
        }
    }

}
