package at.splendit.executer;

import at.splendit.core.ClassNameUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Multi-maven-proguard showcase");
		System.out.println("-----------------------------");
		System.out.println("execute: ClassNameUtil.returnClassName()");
		System.out.println(ClassNameUtil.returnClassName());
		System.out.println("-----------------------------");
		System.out.println("execute: ClassNameUtil.ofuscatedMethodWrapper()");
		System.out.println(ClassNameUtil.ofuscatedMethodWrapper());
		System.out.println("-----------------------------");

	}
}
