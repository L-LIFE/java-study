package variable;

public class var6 {
    public static void main(String[] args) {
        // 변수는 선언 후 초기값을 안 주면 아예 오류가 발생하여 다음단계로 넘어가지지 않는다.
        //이 변수들은 지역 변수
        //Var6.class를 보면 자동으로 최적화하여 초기화가 안된 변수는 제거해버림.
        int a;
        System.out.println(a);
    }
}
