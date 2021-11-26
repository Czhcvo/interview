package demo;
//静态变量和静态代码块的加载时期,字符串常量的+拼接,字符串常量池,成员变量和局部变量

public class InterView01 {
    public static final String A = "123";
    public static final String B;

    static{
        B = "456";
        s = A + B;
    }

    static String s;

    public static void main(String[] args) {
        System.out.println(s == "123456");

        String s = A + "456";
        System.out.println(s == "123456");
    }

}
