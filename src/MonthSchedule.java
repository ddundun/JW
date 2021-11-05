import java.util.Scanner;

public class MonthSchedule {

//    ctrl +z 뒤로 가기/ ctrl +y 앞으로 가기 : redo
    public static void main(String[] args) {
        Day days[] =new Day[30]; //Day 배열 선언 100개 : 0~99
        // work 변수
        //-> setwork getwork get set show 함수들 존재.
        Scanner scan = new Scanner(System.in);

        int index = 0;
        while (true) {
            System.out.println("이번달 스케쥴 관리 프로그램");
            System.out.println("할일(입력:1, 보기:2, 끝내기:3)");

            int so1 = scan.nextInt();
            days[index] = new Day();

            System.out.println("so1 = " + so1);
            if (so1==1) {
                System.out.println("날짜(1~30)?");
                int so2= scan.nextInt(); //so2가 1이면 인덱스0(배열0번째)에 생성
                                        //so2가 30이면 인덱스 29번째

                scan.nextLine(); //입력 버퍼에 ...enter키 삭제...

                days[so2-1] = new Day(); //인덱스 so2번째에 객체 생성

                System.out.println("할 일(빈칸없이 입력)?");
                String so3 = scan.nextLine();
                days[so2-1].setWork(so3);

                System.out.println("입력이 정상적으로 되었습니다.");
//                days[so2].setWork();
            }
            else if( so1 ==2) {
                for (int i = 0; i<days.length; i++) { //days.length: 30
                    if (days[i] != null)
                        System.out.println((i+1)+"번째"+days[i]);
                }

            }
            else if (so1 == 3) {
                System.out.println("종료됩니다.");
                break;
            }
        }

//        System.out.println("시작");
//        Day day1 = new Day();
//        day1.setWork("영화보기");
//        day1.show();
    }
}
