package com.learn.java8.features.stringjoiner;

import java.util.StringJoiner;

public class TestStringJoiner {
	
	public static void main(String args[]) {
		
		StringJoiner sj = new StringJoiner(":");
		sj.add("temp");
		sj.add("java");
		sj.add("jdk1.8");
		sj.add("bin");
		System.out.println(sj);
		
		
	}

}
