package com.mockito.Unittestbymockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class BusinessImpl {
	//@Autowired
private Businesservice getalldata;
	
	public BusinessImpl(Businesservice getalldata) {
		super();
		this.getalldata = getalldata;
	}

	int getbiggernumber()
	{
	int[] numbers	=getalldata.retrivealldata();
	int greatest=Integer.MIN_VALUE;
		for(int number:numbers)
		{
			if(number>greatest)
			{
			greatest=number;
			}
		}
		return greatest;
	}
}
