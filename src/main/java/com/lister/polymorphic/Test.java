package com.lister.polymorphic;


//四、多态

// 多态就是将同一个消息发送给不同对象时，它们所做的响应可能是不同的。比如说动物都有“叫”的方法，但是狗是“汪汪”，而猫是“喵喵”，当它们接收到被打的消息时，所做的响应是不同的。

// 案例：打动物

// 定义一个动物类，实现“叫”的方法

class Animal {
    public void shout(){
        System.out.println("吼吼……");
    }
}
// 定义一个狗类，继承自动物类，重写“叫”的方法

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪……");
    }
}
// 定义一个猫类

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("喵喵……");
    }
}
// 测试程序

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        hit(d);
        hit(c);
    }

    private static void hit(Cat c) {
        c.shout();
    }

    private static void hit(Dog d) {
        d.shout();
    }
}

