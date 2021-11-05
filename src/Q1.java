import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("입력");
        System.out.println("이름을 성과 이름을 띄어서 영어로 입력");

        String s1= scan.nextLine();

        String ar[] = s1.split("\\ ");
        System.out.println("출력");
        System.out.println("성 "+ar[0]);
        System.out.println("이름 "+ar[1]);
    }
}
