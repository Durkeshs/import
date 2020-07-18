package org.task;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	@Parameters({"username","password"})
	@Test
private void test1(String s1,String S2) {
System.out.println(s1);
System.out.println(S2);
}
}
