package kr.hs.study.main;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.Person;

public class MainClass {

	public static void main(String[] args) {
	Hello hello=new HelloWorldKo();
	hello.sayHello();
	
	Person p=new Person("lee",25);
	p.setName("kim");
	p.setAge(30);
	System.out.println(p.getAge());
	System.out.println(p.getName());
		
		//kim, 30 입력하고 출력
    //lee, 25  출력 -생성자 이용
	}

}
