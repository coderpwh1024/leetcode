package com.coderpwh.leetcode;

public class ObjectTest {

    public static void main(String[] args) {

        Student student = null;

        test(student);

        Integer age = student.getAge();

        System.out.println(age);

    }

    public static void test(Student student) {
        student = new Student();
        student.setAge(11);

    }


}
