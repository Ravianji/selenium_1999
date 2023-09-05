package pack_2;

import org.testng.annotations.Test;

public class class_2 {
	@Test(groups = {"smoke","sanity"})
	public void m4()
	{
		System.out.println("iin the method of class02_m4");
	}

@Test(groups = {"fungtion","unit"})
public void m5()
{
	System.out.println("in the method of class_02_m5");
	}
@Test(groups = {"smoke","fungtion"},alwaysRun = true)
public void m6()
{
System.out.println("in the method of class02_m6");	
}



}