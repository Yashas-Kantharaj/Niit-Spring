package aop.main;

import aop.main.LoggingAspects;
import aop.model.Circle;

public class ShapeServiceProxy extends ShapeService{ //1. aop will create the proxy class

	@Override
	public Circle getCircle() {
		new LoggingAspects().myLogginAdvice(); //2.aop will insert this line
		return super.getCircle();
	}

}