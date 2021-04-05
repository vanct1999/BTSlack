import java.util.Scanner;

public class BTJavaSlack {
    static boolean isPrime(int number) {
        if (number == 2)
            return true;
        else if (number % 2 == 0)
            return false;
        else {
            for (int i = 3; i < Math.sqrt(number); i += 2) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }

    static boolean checkSCP(double x) {
        double a = Math.sqrt(x);
        double b = a - Math.floor(a);
        return (b==0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = sc.nextInt();
        System.out.println("1.SNT?");
        System.out.println("2.Chẵn hay lẻ?");
        System.out.println("3.SCP");
        System.out.println("4.EXIT");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                if (isPrime(n)) {
                    System.out.println("SNT");
                } else {
                    System.out.println("Ko phải SNT");
                }
                break;
            case 2:
                if (n % 2 == 0) {
                    System.out.println(n + " là số chẵn");
                } else {
                    System.out.println(n + " là số lẻ");
                }
                break;
            case 3:
                if (checkSCP(n)){
                    System.out.println(n+" là SCP");
                }else {
                    System.out.println(n+" ko phải SCP");
                }
            case 4:
                break;


        }
    }
}
