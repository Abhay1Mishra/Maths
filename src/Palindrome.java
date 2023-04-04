public class Palindrome {
    public static void main(String[] args) {
        int x= 333;
        palindrome(x);
        System.out.println(0*10+4);

    }

    private static void palindrome(int x) {
        int a =0;
        int rus =0;
        while (x>0){

            a =x % 10;
            rus = rus *10 + a;
            x =x / 10;

        }
        System.out.println(rus);
    }
}
