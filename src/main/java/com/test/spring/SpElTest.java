package com.test.spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpElTest {
	@Test
	public void helloWorld(){
		ExpressionParser parser=new SpelExpressionParser();
		Expression expression=parser.parseExpression("('Hello' + ' World').concat(#end)");
		EvaluationContext context=new StandardEvaluationContext();
		context.setVariable("end", "!");
		System.out.println(expression.getValue(context));
		
		Class<String> result=parser.parseExpression("T(String)").getValue(Class.class);
		System.out.println(result);
		
		Assert.assertEquals(String.class, result); 
	}
}
