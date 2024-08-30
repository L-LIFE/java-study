package operator;

public class operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a=5, b=2;

        //덧셈
        int sum =a+b;
        System.out.println("a+b= "+sum);

        //뺄셈
        int diff=a-b;
        System.out.println("a-b="+diff);

        //곱셈
        int multi =a*b;
        System.out.println("a*b="+multi);

        //나눗셈
        int div=a/b; //=>5/2= 2.5인데 int형이므로 소수점 뒤의 숫자는 사라진다. 그래서 2만 나옴.
        System.out.println("a/b="+div);

        //나머지
        int mod=a%b;
        System.out.println("a%b="+mod);

        int z=10/0; //0으로 나누는 경우 오류가 발생.(정해져 있는 예외 처리 부분임.)
        //예외문
        //Exception in thread "main" java.lang.ArithmeticException: / by zero

    }
}
