package com.lokesh.JUNIT_TASK;

public class RemoveA {

	public String remove(String s) {
		
		String res = "";
		int stringLength = s.length();
		
		if(stringLength>=1)
		{
			if(s.charAt(0)!='A')
			{
				res+=s.charAt(0);
			}
			if(stringLength>=2)
			{
				if(s.charAt(1)!='A')
				{
					res+=s.charAt(1);
				}
				res+=s.substring(2, stringLength);
			}
		}
		return res;
	}
}
