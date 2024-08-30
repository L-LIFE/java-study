package variable;

public class Var3 {
    public static void main(String[] args) {
        int a;
        a=10;
        System.out.println(a);

        //변수값 변경
        a=50;
        System.out.println(a); //전에 들어간 10의 값은 아예 사라지고 50이 들어오게 됨.
    }
}
