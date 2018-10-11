package at.splendit.core;

public class ClassNameUtil 
{

	private ClassNameUtil() {
		
	}

	public static final String returnClassName() {
		return ClassNameUtil.class.getName();
	}
	
	public static final String ofuscatedMethodWrapper() {
		return obfuscatedMethod();
	}
	
	private static final String obfuscatedMethod() {
		return Thread.currentThread().getStackTrace()[1].getMethodName();
	}

}
