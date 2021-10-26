public class Recursion {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    static int sumOfDigits(int n){
        if(n==0){
            return n;
        }
        else{
            return n%10 + sumOfDigits(n/10);
        }
    }
    static int power(int x,int y){
        if(y==0){
            return 1;
        }
        else{
            return x * power(x,y-1);
        }
    }
    static int gcd(int x,int y){
        if(x<0 || y<0){
            return -1;
        }
        if(y==0){
            return x;
        }
        return gcd(y,x%y);

    }
    public static void main(String[] args) {
//        System.out.println(factorial(6));
//        System.out.println(fibonacci(10));
//        System.out.println(sumOfDigits(1534));
//        System.out.println(power(2,4));
        System.out.println(gcd(48,18));
    }
}
