package call;
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
        System.out.println(getCallerClassAndMethodName());
    }
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        if (ste.length < 3) {
            return null;
        }
        for (StackTraceElement temp:ste) {
            return (temp.getClassName() + " " + temp.getMethodName());
        }
    }
}
