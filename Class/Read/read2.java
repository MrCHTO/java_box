package Class.Read;

public class read2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.showMajor(new ComputerScience());
        test.showMajor(new ComputerNetWork());
        test.showMajor(new InternetOfThings());
    }

}

interface CS {
    void show();
}

class ComputerNetWork implements CS {
    public void show() {
        System.out.println("我是计院网络专业.");
    }
}

class ComputerScience implements CS {
    public void show() {
        System.out.println("我是计院计算机专业.");
    }
}

class InternetOfThings implements CS {
    public void show() {
        System.out.println("我是计院物联网专业.");
    }
}

class Test {
    public void showMajor(CS s) { // 接口作为参数
        s.show();
    }
}
