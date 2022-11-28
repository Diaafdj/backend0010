package com.diaafdj.backend0010;

public class Manager extends Employee{
    final String vehicle;

    @Override
    public void play() {
        System.out.println("Manager play:"+super.getName());
    }

    public Manager(String name, int age, String gender, String vehicle) {
        super(name,age,gender);
        this.vehicle = vehicle;
    }

    public static void main(String[] args) {                    //测试
        Manager zs=new Manager("张三",18,"男","Bus");
        Employee ls=new Employee("李四",18,"男",4000);
        Manager.setID(1145);
        zs.play();
        ls.sing();
    }
}
