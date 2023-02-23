package org.example;
//02.23
// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

class Main {
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