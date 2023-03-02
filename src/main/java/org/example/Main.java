package org.example;
//02.23
// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

/*class Main {
    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.breath();
    }
}
class Animal{
    void breath(){
        System.out.println("숨쉬다.");
    }
}
class Person extends Animal{

}

 */

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
*/
/*
class Main {
    public static void main(String[] args) {
        오리 a오리 = new 오리();
        a오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.
    }
}

class 오리{
    void 날다(){
        System.out.println("오리가 날라갑니다.");
    }
}
 */
// 문제 : 아래가 실행되도록 해주세요.

/*
class Main {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
    }
}
class 무기{

}
class 칼 extends 무기{

}
 */
/*
class Main {
    public static void main(String[] args) {
        칼 a칼 = new 칼();
        a칼 = new 활();
    }
}

class 칼{

}
class 활 extends 칼{

}
 */
/*class Main {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.
    }
}
// 리모콘 전용 클래스
class 무기{
 void 공격() {} // 버튼 전용 메서드(함수)
}
class 칼 extends 무기{
    public void 공격(){
        System.out.println("칼로 공격합니다");
    }
}
 */
// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

/*class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언","칼");
        // 브라이언이(가) 칼(으)로 공격합니다.
        a전사.재공격();
        a전사.공격("필립이","창");;
        // 필립이(가) 창(으)로 공격합니다.
        a전사.공격("마크","지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.
        a전사.재공격();
        a전사.재공격();
    }
}
class 전사{
    String 전사;
    String 무기;
     void 공격(String 전사, String 무기){
        this.전사=전사;
        this.무기=무기;
        System.out.println(전사+"(가)"+무기+"(으)로 공격합니다.");
    }
    void 재공격(){
        System.out.println(전사+"(가) "+무기+" (으)로 공격합니다.");
    }
}
 */

// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.

// 문제 : 아래 코드가 실행되도록 해주세요.

/*class Main {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!
        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        // 표준Tv 리모콘을 만든다.
        표준Tv a표준Tv;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        // 출력 : 샤오기TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오기TV 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.

        // LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능
        // (LGTv) => a표준Tv 변수에 있던 표준Tv 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다.
        LGTv aLGTv2 = (LGTv) a표준Tv;
        aLGTv2.게임모드전환();
    }
}
class Tv{
    void 켜기(){}
        void 끄기(){}
}
class 표준Tv extends Tv{

}
class 샤오미Tv extends 표준Tv{
    void 켜기(){
        System.out.println("샤오미Tv 켜집니다.");
    }
    void 끄기(){
        System.out.println("샤오미Tv 꺼집니다.");
    }
    void vr켜기(){
        System.out.println("샤오미Tv vr켜기");
    }
}
class 삼성Tv extends 표준Tv{
    void 켜기(){
        System.out.println("삼성Tv 켜집니다.");
    }
    void 끄기(){
        System.out.println("삼성Tv 꺼집니다.");
    }
    void ar켜기(){
        System.out.println("삼성Tv ar켜기");
    }
}
class LGTv extends 표준Tv{
    void 켜기(){
        System.out.println("LGTv 켜집니다.");
    }
    void 끄기(){
        System.out.println("LGTv 꺼집니다.");
    }
    void 게임모드전환(){
        System.out.println("LGTv 게임모드 전환");
    }
}
System.out.println(str.size(arr.get(i)));

 */

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

//code.oa.gg/java8/936
// Object 클래스와 equals

//code.oa.gg/java8/948
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 다음 코드가 오류없이 진행되도록 해주세요. 오류만 안나면 됩니다.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명령 앱 ==");
        List<WiseSaying> wiseSaying=new ArrayList<>();
        int count=0;
        while(true){
            System.out.print("명령) ");
            String cmd=sc.next();

            if(cmd.equals("종료")){
                break;
            }else if(cmd.equals("등록")){
                System.out.print("명언 : ");
                String context=sc.next();
                System.out.print("작가 : ");
                String author=sc.next();
                //wiseSaying.add(new WiseSaying(context,author));
                count++;
                System.out.printf("%d번 명언이 등록되었습니다.\n",count);
            }
        }
        sc.close();
    }
}
class WiseSaying{
    private String context;
    private String author;

   public String getContext(){
       return context;
   }
   public String getAuthor(){
       return author;
   }

   public void setContext(String context){
       this.context=context;
   }

   public void setAuthor(String author){
       this.author=author;
   }

   public WiseSaying(String context,String author){
       this.context=context;
       this.author=author;
   }
}