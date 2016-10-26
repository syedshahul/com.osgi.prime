package com.osgi.prime.upper.provider;

import org.osgi.service.component.annotations.Component;

import com.osgi.prime.upper.api.Upper;

/**
 * 
 */
@Component(name = "com.osgi.prime.upper")
public class UpperImpl implements Upper{

	@Override
	public String upper(String input) {
		// TODO Auto-generated method stub
		
		return input.toUpperCase();
	}

}
