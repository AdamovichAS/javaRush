package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University  {

    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        Student student = null;
        for (Student student1 : students) {
            if(student1.getAverageGrade() == averageGrade){
                student = student1;
                break;
            }
        }
        return student;
    }

    public Student getStudentWithMaxAverageGrade() {
        double max = -1;
        Student student1 = null;
        for (Student student : students) {
            if(student.getAverageGrade()>max){
                max = student.getAverageGrade();
                student1 = student;
            }
        }
        return student1;
    }

    public Student getStudentWithMinAverageGrade(){
        Student student = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if(students.get(i).getAverageGrade() < student.getAverageGrade()){
                student = students.get(i);
            }
        }
        return student;
    }

    public void expel(Student student){
        students.remove(student);
    }
}