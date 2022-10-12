import java.lang.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
       String b=scan.nextLine();
        BigInteger A=new BigInteger(a);
        BigInteger B=new BigInteger(b);
        BigInteger sum=A.add(B);
        System.out.println(sum);
    }
}
