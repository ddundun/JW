public class Ex02 {

    public static void main(String[] args) {
//        문자열 비교 연산자는 equals를 사용한다.
        String str1 = "simple String";
        String str2 = "simple String";

        String str3 = new String("simple String");
        String str4 = new String("simple String");

        if(str1.equals(str2))
            System.out.println("str1 str2 동일 인스턴스 참조");
        else
            System.out.println("str1 str2 다른 인스턴스 참조");

//        if(str3 ==str4) : 다른공간이기때문에 다른 인스턴스 참조로뜸.
//        따라서, equals를 활용합시당 ^^~!
//            System.out.println("str3 str4 동일 인스턴스 참조");
//        else
//            System.out.println("str3 str4 다른 인스턴스 참조");

        if(str3.equals(str4))
            System.out.println("str3 str4 동일 인스턴스 참조");
        else
            System.out.println("str3 str4 다른 인스턴스 참조");

    }
}
