package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass {
	public void before() {
		System.out.println("before 호출");
	}
	public void after() {
		System.out.println("after 호출");
	}
	public int around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around 메서드 호출1");
		int a=(Integer) pjp.proceed();
		System.out.println("around 메서드 호출2");
		return a;
	
	}
	public void after_Throwing(Exception e) {
		System.out.println("after throwing 호출");
	}
}
