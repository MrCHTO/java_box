/*
1、接口Shape定义如下：
interface Shape{
 double getArea();  //计算形状的面积
 double getCircumference();  //计算形状的周长
}；
要求：
（1）、请定义一个圆类实现该接口；
（2）、写一个main函数测试该圆类，并能够输出圆的面积与周长。
*/
package Class.Write;

import java.util.Scanner;

interface Shape {
    // 计算形状的面积
    double getArea();

    // 计算形状的周长
    double getCircumference();
}

class Circle implements Shape {
    private final double PI = 3.14f;
    /*
     * final用来修饰方法和属性表示特殊的意义; 修饰方法时表示方法不能被重写； 修饰属性时表示属性不能被改变; 这里属性又分为对象和基本类型;
     * 修饰基本类型表示基本类型赋值以后不能再被赋值; 修饰对象表示这个属性不能再指向其他对象（引用不变）; 但是他指向的这个对象本身还是可以被改变的;
     */
    private double radius;

    // Circle类构造方法
    Circle() {
    }

    Circle(Double r) {
        radius = r;
    }

    // Circle类求面积
    public double getArea() {
        return PI * radius * radius;
    }

    // Circle类求周长
    public double getCircumference() {
        return 2 * PI * radius;
    }
}

public class write1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Shape sp = new Circle(radius);
        System.out.println("面积：" + sp.getArea() + "\t周长：" + sp.getCircumference());
        sc.close();
    }
}
