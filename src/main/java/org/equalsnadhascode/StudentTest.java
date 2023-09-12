package org.equalsnadhascode;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("umesh",1);
        Student student1 = new Student("umesh",1);
        System.out.println(student1.equals(student));
        System.out.println(student1.hashCode()==student.hashCode());
    }
}
