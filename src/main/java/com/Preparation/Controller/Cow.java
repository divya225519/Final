package com.Preparation.Controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller

public class Cow implements Animal{

	@Override
	public String bark() {
		// TODO Auto-generated method stub
		return "ambaa ambaaaa ambaa";
	}
	

}
