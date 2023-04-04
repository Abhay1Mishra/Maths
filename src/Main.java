public class Main {
    public static void main(String[] args) {
        int x=5;
       factorial(x);
    }

    private static void factorial(int x) {
        int a=1;
        for (int i=1; i<=x;i++){
            a*=i;

        }
        System.out.println(a);

    }
}