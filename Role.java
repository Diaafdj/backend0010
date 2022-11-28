package com.diaafdj.backend0010;

public abstract class Role {
    private String name;
    private int age;
    private String gender;
    public abstract void play();

    Role(){
        this.name="无";
        this.age=0;
        this.gender="未知";

    }
    Role(String name){
        this.setName(name);
    }
    Role(String name,int age){
        this(name);
        this.setAge(age);
    }
    Role(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
