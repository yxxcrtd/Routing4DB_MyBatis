package com.google.code.routing4db.strategy;

import java.util.Random;

import junit.framework.TestCase;

import org.springframework.util.PatternMatchUtils;

public class RandomTest extends TestCase {

	@SuppressWarnings("unused")
	public void testRandom() {
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(2));
		}

		String[] methods = { "selectBy", "select" };
		for (String method : methods) {
			String pattern = "*select*";
			// System.out.println(Pattern.matches("\\*select\\*", method));
		}

		System.out.println("xxx*xxx".replaceAll("\\*", "b"));

		System.out.println(PatternMatchUtils.simpleMatch("*", "a"));

		char ch = 'x';

		System.out.println(((Character) ch).getClass().getName());
	}

}
