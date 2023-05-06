package com.java.basic.features.collection.arraylist.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ArrayList Sort
 * @version 1.0
 * @user lianxinzhong
 * @date 2021/6/30
 */
public class CrmService {


    // 1. Collections.sort() 进行排序
    public static void main(String[] args) {
        List<String> list1 = new ArrayList();

        list1.add("aa");
        list1.add("ab");
        list1.add("dd");
        list1.add("ea");
        list1.add("123");
        list1.add("562");
        list1.add("323");
        Collections.sort(list1);

        System.out.println(list1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(88));
        studentList.add(new Student(90));
        studentList.add(new Student(63));
        studentList.add(new Student(100));
        studentList.add(new Student(44));

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() - o2.getScore();
            }
        });

        Collections.sort(studentList, (stu1,stu2) -> stu1.getScore() - stu2.getScore());
        System.out.println(studentList);

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("aaa"));
        studentList2.add(new Student("ddd"));
        studentList2.add(new Student("zzz"));
        studentList2.add(new Student("nnn"));
        studentList2.add(new Student("ttt"));
//        Collections.sort(studentList2, (stu1, stu2) -> stu1.getName().compareTo(stu2.getName()));
        Collections.sort(studentList2, (stu1, stu2) -> (stu2.getName().compareTo(stu1.getName())));
        System.out.println(studentList2);


    }

    public static void sortAsc() {

    }

    public static void sortComparator() {

    }
}

class Student {

    private String name;
    private int score;

    public Student (String name) {
        this.name = name;
    }

    public Student(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}