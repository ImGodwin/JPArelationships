package GodwinE;

import GodwinE.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

import static GodwinE.entities.JpaUtil.getEntitiManagerFactory;

public class Application {


    public static void main(String[] args)
    {
        EntityManager em = getEntitiManagerFactory().createEntityManager();

        try {
            EventDAO ev = new EventDAO(em);
            LocationDAO ld = new LocationDAO(em);
            ParticipationDAO partDAO = new ParticipationDAO(em);
            PersonDAO personDAO = new PersonDAO(em);

            Person person = new Person("Kade", "Will", "e-mail", "birthyear", Gender.M);
            Location location = new Location("Libertà", "Bari");

            Event newEv = new Event("Dance Event", LocalDate.now(), "Dance Event", EventType.PUBLIC,
                    300);









        }catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
