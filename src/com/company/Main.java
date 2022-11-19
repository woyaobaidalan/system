package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎来到学生信息管理系统,请确定你要进行的操作:");
        System.out.println("---添加学生信息回复: 1 ---");
        System.out.println("---删除学生信息回复: 2 ---");
        System.out.println("---修改学生信息回复: 3 ---");
        System.out.println("---查看所有学生信息回复 : 4 ---");
        System.out.println("---输入学号，查看个人信息回复: 5 ---");
        System.out.println("---查看手册回复: 6 ---");

        String s = "  ";


        while(!"QUIT".equals(s)){

            System.out.println("请输入:");
            int i = sc.nextInt();

            switch(i){
                case 1:
                    System.out.println("请输入你要添加的人数:");
                    int num = sc.nextInt();
                    for(; num > 0; num--){
                        addArrayList(students);
                    }
                    break;
                case 2:
                    System.out.println("请输入删除的人数:");
                    int num1 = sc.nextInt();
                    for(; num1 > 0; num1--){
                        deleteStudent(students);
                    }
                    break;
                case 3:
                    System.out.println("请输入你要修改的人数:");
                    int num2 = sc.nextInt();
                    for(; num2 > 0; num2--){
                        reviseStudent(students);
                    }
                    break;
                case 4:
                    cheek_All_Student(students);
                    break;
                case 5:
                    System.out.println("请输入你要查看的人数:");
                    int num3 = sc.nextInt();
                    for(; num3 > 0; num3--){
                        cheek_one_student(students);
                    }
                    break;
                case 6:
                    order();
            }

            System.out.println("您是否还要继续，若要退出请输入  QUIT  ,继续输入 YES ");
            s = sc.next();

        }


    }

//添加学生信息
    public static void addArrayList(List<Student> students){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入班级:");
        String classes = sc.nextLine();
        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学号:");
        String ID = sc.nextLine();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();


        System.out.println("添加学生信息成功");

        Student student = new Student(classes,name, age,ID);

        students.add(student);
    }
//删除学生信息
    public static void deleteStudent(List<Student> students){
        System.out.println("请输入你要删除学生的学号:");
        Scanner sc = new Scanner(System.in);
        String ID = sc.nextLine();
        for(int i = 0; i < students.size(); i++){
            Student student  = students.get(i);
            if(student.getID().equals(ID)){
                students.remove(i);
                break;
            }
        }
        System.out.println("删除学生信息成功");
    }
//修改学生信息
    public static void reviseStudent(List<Student> students){
        System.out.println("请输入你要修改学生的学号");
        Scanner sc = new Scanner(System.in);
        String oldID = sc.nextLine();

        System.out.println("请重新输入班级:");
        String classes = sc.nextLine();
        System.out.println("请重新输入姓名:");
        String name = sc.nextLine();
        System.out.println("请重新输入学号:");
        String ID = sc.nextLine();
        System.out.println("请重新输入年龄:");
        int age = sc.nextInt();

        Student num = new Student(classes,name,age,ID);

        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getID().equals(oldID)){
                students.set(i, num);
            }
        }
        System.out.println("修改学生信息成功");
    }
//查看所有学生信息
    public static void cheek_All_Student(List<Student> students){
        for(Student student : students){
            System.out.println("班级:" + student.getClasses());
            System.out.println("姓名:" + student.getName());
            System.out.println("年龄:" + student.getAge());
            System.out.println("学号" + student.getID());
            System.out.println("---------------------");
        }
    }
//输入学号，查看信息
    public static void cheek_one_student(List<Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生ID");
        String ID = sc.nextLine();
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getID().equals(ID)){
                System.out.println("班级:" + student.getClasses());
                System.out.println("姓名:" + student.getName());
                System.out.println("年龄:" + student.getAge());
                System.out.println("学号" + student.getID());
            }else{
                System.out.println("查无此人，请重新输入！");
            }
        }
    }
    public static void order(){
        System.out.println("欢迎来到学生信息管理系统,请确定你要进行的操作:");
        System.out.println("---添加学生信息回复: 1 ---");
        System.out.println("---删除学生信息回复: 2 ---");
        System.out.println("---修改学生信息回复: 3 ---");
        System.out.println("---查看所有学生信息回复 : 4 ---");
        System.out.println("---输入学号，查看个人信息回复: 5 ---");
        System.out.println("---查看手册回复: 6 ---");
    }
}
