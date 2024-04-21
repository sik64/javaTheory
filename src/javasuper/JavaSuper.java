package javasuper;
class Base{
    Base(){
        System.out.println("Base()의 생성자");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived()의 생성자");
    }
}
class Shape {
    String a;
    Shape(String str){
        a = str;//????
        System.out.println("Shape의 생성자" + str);
    }
}
class Rectangle extends Shape{
    Rectangle(){
        super("msg");
        System.out.println("Rectangle()의 생성자");
    }
}
public class JavaSuper {
    public static void main(String[] args){
        Base d = new Derived();
        Rectangle r = new Rectangle();
    }
}
