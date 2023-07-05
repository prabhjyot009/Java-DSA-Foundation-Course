package Basics;

public class AreaOfCircle {
    double radius=5;
    double pi=3.14;
    double area=pi*radius*radius;
    public static void main(String[] args) {
        AreaOfCircle a=new AreaOfCircle();
        System.out.println(a.area);
    }
}
