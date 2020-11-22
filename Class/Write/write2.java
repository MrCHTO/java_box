/*
2、现有一字符串数组如下：
private String s[] = { " Who "," is ", " the ", " champion "," of ", "the ","Russian ","Cup?", };
要求：
（1）、定义一个线程类，输出该字符串数组内容；
（2）、在main函数启动四个线程输出该字符串数组的内容，
    要求每个线程输出一个完整的“Who is the champion of the Russian World Cup?”。

*/
package Class.Write;

import java.nio.channels.spi.SelectorProvider;

//import java.lang.Thread;

class Ot extends Thread {
    private String[] s = new String[8];
    private int i = 0;

    public void run() {
        while (i < 1) {
            s[0] = " Who ";
            s[1] = " is ";
            s[2] = " the ";
            s[3] = " champion ";
            s[4] = " of ";
            s[5] = "the ";
            s[6] = "Russian ";
            s[7] = "Cup?";
            i++;
            for (String a : s) {
                System.out.print(a);
            }
        }
    }
}

public class write2 {
    public static void main(String[] args) {
        new Ot().start();
        new Ot().start();
        new Ot().start();
        new Ot().start();
    }
}
