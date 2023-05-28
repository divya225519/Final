package com.Preparation.Controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller("doggy")
@Primary
public class Dog implements Animal{
	
	public String bark()
	{
		return "bow bow bow";
	}

}
