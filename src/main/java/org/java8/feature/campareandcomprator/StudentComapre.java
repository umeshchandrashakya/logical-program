package org.java8.feature.campareandcomprator;

public class StudentComapre implements Comparable<StudentComapre> {
    private int id;
    private String name;

    public StudentComapre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String  getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentComapre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String  name) {
        this.name = name;
    }

    @Override
    public int compareTo(StudentComapre o) {
        if (this.id==o.id){
            return 0;
        }else if (this.id > o.id){
            return 1;
        }else {
            return -1;
        }
    }
}
