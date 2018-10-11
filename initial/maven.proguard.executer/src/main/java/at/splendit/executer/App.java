package at.splendit.executer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.splendit.core.ClassNameUtil;

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class); 
	
	
	public static void main(String[] args) {
		logger.info("------------------------------------------------------------------------");
		logger.info("Multi-maven-proguard showcase");
		logger.info("");
		logger.info("execute: ClassNameUtil.returnClassName()");
		logger.info(ClassNameUtil.returnClassName());
		logger.info("");
		logger.info("execute: ClassNameUtil.ofuscatedMethodWrapper()");
		logger.info(ClassNameUtil.ofuscatedMethodWrapper());
		logger.info("");
		logger.info("------------------------------------------------------------------------");

	}
}

