package utilitity_file;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Extendclass_of_screen  extends ScreenShort implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
		screenshort(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpeg");
	}

}
