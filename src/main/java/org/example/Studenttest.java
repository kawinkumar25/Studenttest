package org.example;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


class Student {
    private String name;
    private int age;
    private double gpa;

    Student(String name,int age,double gpa)
    {
        set(name,age,gpa);
    }

    void set(String name,int age,double gpa)
    {
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    String getname() {
        return name;
    }
    int getage()
    {
        return age;
    }
    double getgpa()
    {
        return gpa;
    }
}
class StudentTest
{
    public static void main(String[] args)
    {
        Student ob1 = new Student("kawin", 18, 7);
        Student ob2 = new Student("kumar", 19, 20);
        Student ob3 = new Student("kawin", 20, 9);
        Student ob4 = new Student("kawin", 20, 25);

        ArrayList <Student> list = new ArrayList<>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getname());
            System.out.println(list.get(i).getage());
            System.out.println(list.get(i).getgpa());
        }

        List <Double> list1 = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            list1.add(list.get(i).getgpa());
        }
        Collections.sort(list1);
        Collections.reverse(list1);


        for(int i=0;i<list1.size();i++)
        {
            for(int m=i;m<list.size();m++)
            {
                if(list1.get(i) == list.get(m).getgpa())
                {
                    Collections.swap(list, i, m);
                }
            }
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getname());
            System.out.println(list.get(i).getage());
            System.out.println(list.get(i).getgpa());
        }
    }
}

