package org.example;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.logging.*;



class Studenttest
{
    public static void main(String[] args)
    {
        Logger l = Logger.getLogger("kawin");
        Student object1 = new Student("kawin", 18, 7);
        Student object2 = new Student("kumar", 19, 20);
        Student object3 = new Student("mohan", 20, 9);
        Student object4 = new Student("ragul", 20, 25);

        ArrayList <Student> list = new ArrayList<>();
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);



        for(int i=0;i<list.size();i++)
        {
            l.info(list.get(i).getname()+" "+list.get(i).getage()+" "+list.get(i).getgpa());

        }
        l.info("after sorting");
        Collections.sort(list, new Comparator<Student>() {

            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getgpa(),o1.getgpa());
            }
        });



        for(int i=0;i<list.size();i++)
        {
            l.info(list.get(i).getname()+" "+list.get(i).getage()+" "+list.get(i).getgpa());
        }
    }
}

