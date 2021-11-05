public class Ex03 {

    public static void main(String[] args) {
        double e = 3.1415;
        String f = "3";
        // 문자열 변환 두 가지 방법
        // 1. String,valueof() 함수 사용
        String a = String.valueOf(e);

        // 2. 문자열 더하면 자동으로 문자열로 형변환됨.
        String b = e + "";
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        String ar[] = "3.1415".split("\\.");
        // 점을 기준으로 짜르기.
        System.out.println(ar[0]);
        System.out.println(ar[1]);

        
        // 3. String을 int형 변환
//        int c= Integer.parseInt(f);
        int c= Integer.parseInt("3.1415".split("\\.")[0]);

        // 4. Stringㅇ르 double형 변환
        double d = Double.parseDouble(a);

        System.out.println("c= "+c);
        System.out.println("d= "+d);

    }
}
