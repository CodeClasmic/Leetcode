import java.util.Scanner;

public class nthdigit {
    static public int findNthDigit(int n) {
        int c=0,k=n;
        if(n<=9)
            return n;
        while (n!=0) {
             c++;
             n=n/10;
        }
        int digit=((int) (k-Math.pow(10, c-1))-1);
        System.out.println(digit);
        return digit;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        findNthDigit(n);
        scanner.close();
    }
}
