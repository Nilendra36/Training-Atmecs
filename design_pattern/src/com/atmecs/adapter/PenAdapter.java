package com.atmecs.adapter;

public class PenAdapter implements Pen {

	@Override
	public void write(String str) {
		PilotPen pp=new PilotPen();
		pp.mark(str);
		
	}
	

}
