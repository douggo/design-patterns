package br.com.douggo.prototype.animation;

import br.com.douggo.prototype.animation.model.Person;
import br.com.douggo.prototype.animation.model.PersonSamples;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private final static List<Person> frames = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        PersonSamples samples = new PersonSamples();
        Person person = samples.getPersonSample("fatMan");
        createMovie(person);
    }

    private static void createMovie(Person person) throws CloneNotSupportedException, InterruptedException {
        frames.add(person);
        person = walkLeft(person);
        person = walkLeft(person);
        person = walkLeft(person);
        person = walkRight(person);
        person = walkRight(person);
        person = walkLeft(person);
        person = walkLeft(person);
        person = walkRight(person);
        person = walkRight(person);
        person = walkRight(person);
        person = walkRight(person);
        person = walkRight(person);
        person = walkRight(person);
        person = walkRight(person);
        walkRight(person);
        animate();
    }

    private static Person walkLeft(Person person) throws CloneNotSupportedException {
        Person clone = (Person) person.clone();
        clone.walkLeft();
        frames.add(clone);
        return clone;
    }

    private static Person walkRight(Person person) throws CloneNotSupportedException {
        Person clone = (Person) person.clone();
        clone.walkRight();
        frames.add(clone);
        return clone;
    }

    private static void animate() throws InterruptedException {
        System.out.println("*********************************");
        System.out.println("* ");
        System.out.println("* Adjust your screen's height!");
        System.out.println("* ");
        System.out.print("*********************************");
        Thread.sleep(3000);
        for(Person frame: frames) {
            frame.draw();
            Thread.sleep(500);
        }
        System.out.println("**********************");
        System.out.println("* ");
        System.out.println("* The End!");
        System.out.println("* ");
        System.out.print("**********************");
    }

}
