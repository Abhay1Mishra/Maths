public class Modulo_Arithmetics {
    public static void main(String[] args) {

        int a =2,b=8,x=12342,y=5;
        System.out.println(power(a,b));
        System.out.println(modulo(x,y,101010));

    }

    private static int power(int a,int b) {
        int rus=1;
        while (b>0){
            if (b%2!=0){
                rus=rus*a;
            }
            a =a*a;
            b=b>>1;
        }
        return rus;
    }
    static long modulo(int a,int b,int n){
        long rus = 1;
        while (b>0){
            if((b&1)!=0){
                rus =(rus%n * a%n)%n;
            }
            a = (a%n * a%n)%n;
            b =b>>1;
        }
        return rus;
    }
}
