//ctrl alt l 자동정렬
//shift delete 한 줄 삭제ㄴ
//alt insert

public class Day {
    private String work; //하루의 할 일을 나타내는 문자열


    @Override
    public String toString() {
        return "Day{" +
                "work='" + work + '\'' +
                '}';
    }

    public String getWork() { //할당된 work가져오기?
        return work;
    }

    public void setWork(String work) { //이거쓰면 work에할당
        this.work = work;
    }

    public void set(String work) {
        this.work = work;
    }

    public String get() {
        return work;
    }

    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}