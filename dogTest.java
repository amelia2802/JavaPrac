/**write a program to create a dog class and run the program.
 * @author Amelia
 */

package oop.src;
import java.util.Scanner;

class Dog{
    //Declare properties
    public String name;
    public int age;
    public String breed;
    public String color;

    //declare methods
    public void bark(){
        System.out.println(name+" is barking.");
    }

    public void eat(){
        System.out.println(name+" is eating.");
    }

    public void wagTail(){
        System.out.println(name+" is wagging tail.");
    }
}

public class dogTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog doggy = new Dog();
        System.out.println("Enter the name");
        doggy.name = sc.nextLine();
        System.out.println("Enter age:");
        doggy.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter breed");
        doggy.breed = sc.nextLine();
        System.out.println("Enter color");
        doggy.color = sc.nextLine();
        sc.close();

        System.out.println(doggy.name+" : "+doggy.age+doggy.breed+doggy.color);
        doggy.bark();
        doggy.eat();
        doggy.wagTail();
    }
}