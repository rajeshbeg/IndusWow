package framework;

import org.testng.annotations.Test;

public class Dependency {
	@Test
	public void Openbrowser()
	{
		System.out.println("Opening browser");
	}
	@Test(dependsOnMethods={"Openbrowser"},alwaysRun=true)
	public void Flightbooking()
	{
		System.out.println("After opening browser book flight");
	}
	// time out of script
	@Test(timeOut=5000)
	public void Timereleted()
	{
		System.out.println("Payment is goin on");
	}
// enable or disable the testcases
	@Test(enabled=false)
	public void Payment()
	{
		System.out.println("Payment is goin on");
	}

}
