package com.diaafdj.backend0010;

public class Hero {
    String name;
    int health_point;
    int grade;
    Hero(){                     //默认构造方法
        this.health_point=100;
        this.grade=1;
    }

    Hero(int t){                //带参的构造方法
        if(t==1){
            this.health_point=100;
            this.grade=1;
        } else if (t==2) {
            this.health_point=200;
            this.grade=1;
        }
        else{
            System.out.println("无效的参数");
        }
    }

    public void setName(String name) {      //设置英雄名称
        this.name = name;
    }
    public void getHero(){                  //输出英雄信息
        System.out.printf("name:%s\nhealth_point:%d\ngrade:%d\n",this.name,this.health_point,this.grade);
    }

    public void fight(Hero opp){            //战斗，降低目标英雄100生命值
        opp.health_point-=100;
    }

    public void fight(int t,Hero opp){        //带参数的绝招，有绝招1和绝招2
        if(t==1){
            opp.health_point-=100;
        } else if (t==2) {
            opp.health_point-=150;
        }

    }

    public static void main(String[] args) {
        Hero hero1=new Hero();
        hero1.setName("hero1");
        Hero hero2=new Hero(2);
        hero2.setName("hero2");
        hero2.getHero();
        hero1.fight(2,hero2);
        hero2.getHero();
    }
}
