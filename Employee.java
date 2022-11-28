package com.diaafdj.backend0010;

public class Employee extends Role{
    private  int salary;
    private static int ID;
    Employee(){
        super();
        this.salary=0;
    }
    Employee(String name,int age,String gender){
        super(name,age);
        super.setGender(gender);

    }
    Employee(String name,int age,String gender,int salary){
        this(name,age,gender);
        this.setSalary(salary);

    }

    public int getSalary() {
        return salary;
    }

    public static int getID() {
        return ID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void setID(int ID) {
        Employee.ID = ID;
    }

    @Override
    public void play() {
        System.out.println("Employee play:"+super.getName());
    }

    public final void sing(){
        System.out.println("Employee sing:"+super.getName());
    }

}
