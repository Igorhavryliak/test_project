public class App {
    public static void main(String [] args){
        int a = 1;
        int b =7;
        System.out.println(sum(a, b));
        System.out.println(div(a, b));

    }

    public static void sum(int a, int b) {
        return a + b;
    }

    public static void div(int a, int b) {
        return a - b;
    }
}
