public class Euclid_GCD {
    public static void main(String[] args) {
        System.out.println(Gcd(12,21));
    }

    static int  Gcd(int a,int b) {
        if(b==0)return a;
        return Gcd(b,a%b);
    }
}
