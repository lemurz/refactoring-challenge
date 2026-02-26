package edu.iutcs.cr.persons.input;

import edu.iutcs.cr.persons.Person;
import edu.iutcs.cr.util.InputManager;

public class PersonInputBuilder {
    protected final InputManager inputManager;

    public PersonInputBuilder() {
        this.inputManager = InputManager.getInstance();
    }

    public Person buildPerson() {
        String name = readName();
        String id = readId();
        String email = readEmail();

        Person person = new Person(id);
        person.setName(name);
        person.setEmail(email);
        
        return person;
    }

    protected String readName() {
        String name = null;
        while (name == null || name.isBlank()) {
            System.out.print("Enter name: ");
            name = inputManager.readLine();
            if (name == null || name.isBlank()) {
                System.out.println("Name is mandatory!");
            }
        }
        return name;
    }

    protected String readId() {
        String id = null;
        while (id == null || id.isBlank()) {
            System.out.print("Enter id: ");
            id = inputManager.readLine();
            if (id == null || id.isBlank()) {
                System.out.println("Id is mandatory!");
            }
        }
        return id;
    }

    protected String readEmail() {
        String email = null;
        while (email == null || email.isBlank()) {
            System.out.print("Enter email: ");
            email = inputManager.readLine();
            if (email == null || email.isBlank()) {
                System.out.println("Email is mandatory!");
            }
        }
        return email;
    }
}
