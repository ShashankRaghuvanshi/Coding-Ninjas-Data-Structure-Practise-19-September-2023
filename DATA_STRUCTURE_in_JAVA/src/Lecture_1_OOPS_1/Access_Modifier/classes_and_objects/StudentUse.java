package Lecture_1_OOPS_1.Access_Modifier.classes_and_objects;

import java.util.Scanner;

public class StudentUse 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = "Ankush";
        s1.setRollNumber(123);

        Student s2 = new Student();
        System.out.println(s1);
        s2.name = "Manisha";
        s2.setRollNumber(130); 

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.getRollNumber());
        System.out.println(s2.getRollNumber());


        sc.close();

    }
}
