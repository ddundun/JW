import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1. 더하기 2. 빼기 3. 나누기 4 곱하기 5 나머지 6. 종료");
            System.out.println("무엇을 하시겠습니까?");

            int so1 = scan.nextInt();
            if (so1 == 1) {
                System.out.println("첫번째 수");
                int num1 = scan.nextInt();
                System.out.println("두번째 수");
                int num2 = scan.nextInt();

                System.out.println(+num1+"+"+num2+"="+(num1 + num2));
            }

            else if (so1 ==2) {
                System.out.println("첫번째 수");
                int num1 = scan.nextInt();
                System.out.println("두번째 수");
                int num2 = scan.nextInt();

                System.out.println(+num1+"-"+num2+"="+(num1 - num2));
                }
            else if (so1 ==3) {
                System.out.println("첫번째 수");
                int num1 = scan.nextInt();
                System.out.println("두번째 수");
                int num2 = scan.nextInt();

                System.out.println(+num1+"/"+num2+"="+(num1 / num2));
            }
            else if (so1 ==4) {
                System.out.println("첫번째 수");
                int num1 = scan.nextInt();
                System.out.println("두번째 수");
                int num2 = scan.nextInt();

                System.out.println(+num1+"*"+num2+"="+(num1 * num2));
            }
            else if (so1 ==5) {
                System.out.println("첫번째 수");
                int num1 = scan.nextInt();
                System.out.println("두번째 수");
                int num2 = scan.nextInt();

                System.out.println(+num1+"%"+num2+"="+(num1 % num2));
            }
            else if (so1 ==6) {
              break;
            }
            }
        }
    }


