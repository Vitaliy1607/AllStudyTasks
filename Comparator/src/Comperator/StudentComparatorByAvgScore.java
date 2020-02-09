package Comperator;

import entity.Student;

import java.util.Comparator;

public class StudentComparatorByAvgScore implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int res = Double.compare(o1.getAvgScore(), o2.getAvgScore());
        if (res == 0){
            res = o1.getLastname().compareTo(o2.getLastname());
        }if (res == 0){
            res = o1.getLastname().compareTo(o2.getName());
        }

         return res;
    }
}
