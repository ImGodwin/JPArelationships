package GodwinE;

import GodwinE.entities.Event;
import GodwinE.entities.EventDAO;
import GodwinE.entities.EventType;
import GodwinE.entities.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.time.LocalDate;
import java.util.UUID;

import static GodwinE.entities.JpaUtil.getEntitiManagerFactory;

public class Application {


    public static void main(String[] args)
    {
        EntityManager em = getEntitiManagerFactory().createEntityManager();

        try {
            EventDAO ev = new EventDAO(em);
            System.out.println("confirm");

            Event musicEvent = new Event("Pop Event", LocalDate.now(), "amazing pop event", EventType.PUBLIC,
                    300);

            ev.save(musicEvent);

            Event bigEvent = ev.getById(UUID.fromString("2f330782-d504-44bf-8ecc-aea92f844fc2"));
            if (musicEvent != null)
            {
                musicEvent.setTitle("Dance Event");
                System.out.println("before refresh");
                em.refresh(musicEvent);
                System.out.println("Refreshed");
            }



        }catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
