package javaInheritance;

public class JavaInheritance {
    public static class Test {
        private int a = 1; // 전용 // 클래스 내부에서만 메소드를 이용해서 접근 가능
        int b = 2; // 디폴트 // 클래스 내부에서 또는 같은 패키지 안에서 접근 가능
        public int c =3; // 다른 패키지에서 접근 가능
        static int s = 4; // 클래스 Test는 static이 아니므로 객체를 만들어서 접근해야한다.그렇다면 static 필드는?
        // 접근자와 설정자 장점 예시
        int age;
        public void setAge(int age) {
            if( age < 0 )
                this.age = 0;
            else this.age = age;
        }

        public void printA(){
            System.out.println(a); // a 가 private이기 때문에 밖에서 쓰기위해선 내부의 메소드를 통해서
        }
    }

    public static void main(String[] args){

        Test obj = new Test(); // 객체 생성
        //System.out.println(Test.a); // a 가 private이기 때문에 밖에서 쓰기위해선 내부의 메소드를 통해서
        System.out.println(obj.a);
        obj.printA();
        //obj.a = 10; // private 전용 멤버는 다른 클래스에서는 접근 안 됨
        obj.b = 20; // 디폴트 멤버는 접근할 수 있음
        obj.c = 30; // public 공용 멤버는 접근할 수 있음
    }
    //1. 필드의 경우, private로 만드는 것이 바람직한 이유는 무엇인가?
    //2. 필드를 정의할 때 아무런 접근 제어 수식자를 붙이지 않으면 어떻게 되는가?
    //정보 은닉이란 구현의 세부 사항을 클래스 안에 감추는 것이다
    //설정자(mutator) setter
    //접근자(accessor) getter
    //접근자에서 매개 변수를 통하여 잘못된 값이 넘어오는 경우, 이를 사전에 차단할 수 있다.
}
