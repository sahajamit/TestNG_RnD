package com.testng.practise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITest;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;
import org.testng.IAnnotationTransformer;

public class TestNGAnnotationTransformer implements IAnnotationTransformer{
	@Override
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		if ("test1".equals(testMethod.getName())) {
		      annotation.setTimeOut(2000);
		    }
	}
}
