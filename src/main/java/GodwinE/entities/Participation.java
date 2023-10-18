package GodwinE.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "participation")
public class Participation {
    @Id
    @GeneratedValue
    private UUID id;
    private Person participant;
    private State currentState;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Event event;

    public Participation(Person participant, Event event, State currentState) {
        this.participant = participant;
        this.event = event;
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "Participation{" +
                "id=" + id +
                ", participant=" + participant +
                ", event=" + event +
                ", currentState=" + currentState +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public Person getParticipant() {
        return participant;
    }

    public void setParticipant(Person participant) {
        this.participant = participant;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
