package GodwinE.entities;

import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String dateOfbirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Person(String name, String surname, String email, String dateOfbirth, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfbirth = dateOfbirth;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfbirth='" + dateOfbirth + '\'' +
                ", gender=" + gender +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
