package call;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        method1();
        method2();
        System.out.println(getCallerClassAndMethodName());
    }
    public static void method1() {
        //не вызывает ничего
        System.out.println(getCallerClassAndMethodName());
    }
    public static void method2() {
        method3();
        method4();
        System.out.println(getCallerClassAndMethodName());
    }
    public static void method3() {
        //не вызывает ничего
        System.out.println(getCallerClassAndMethodName());
    }
    public static void method4() {
        //не вызывает ничего
        System.out.println(getCallerClassAndMethodName());
    }
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
           try {
               return (ste[3].getClassName() + "#" + ste[3].getMethodName());
           } catch (ArrayIndexOutOfBoundsException e) {
               return null;
           }
    }
}
