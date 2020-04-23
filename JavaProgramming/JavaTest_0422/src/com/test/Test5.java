// java Test5.java -> Test5.class생성됨
// java Test5 "이순신","강감찬"

package com.test;

public class Test5 {

	public static void main(String[] args) {
		//String[] args 는 안에 넣고 싶은 값이 있을때 run con---에서 직접 값을 입력해서 넣을 때 사용
		
		for(int inx=0; inx<args.length; inx++) {
			System.out.println(args[inx]);
		}

	}

}
