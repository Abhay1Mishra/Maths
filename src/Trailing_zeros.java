public class Trailing_zeros {
    public static void main(String[] args) {
        int x =30;
        trailing_zeros(x);
    }

    private static void trailing_zeros(int x) {
        int rus =0;
        for (int i=5; i<=x ;i*=5){
            rus+=x/i;
        }
        System.out.println(rus);
    }
}
