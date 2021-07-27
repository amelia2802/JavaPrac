/**write a program to create a studet class and run the program.
 * @author Amelia
 */

package oop.src;
import java.util.Scanner;

class Student{
    public String name;
    public int age;
    public String gender;
    public int year;
    public String course;
    public String uni;

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter gender:");
        gender=sc.nextLine();
        System.out.println("Enter year:");
        year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter course:");
        course =  sc.nextLine();
        System.out.println("Enter university:");
        uni =  sc.nextLine();
        sc.close();
    }
}

public class studentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name+":"+s1.age+":"+s1.gender+":"+s1.course+":"+s1.year+":"+s1.uni);
    }
}


