package org.itstep;

import org.springframework.stereotype.Component;

@Component
public class SpringTestImpl implements SpringTest{

	public void testMethodRun() {
		System.out.println("Congratulation! You are able to run desKtop Spring application!");
	}

}
