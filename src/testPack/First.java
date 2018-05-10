package testPack;

import org.testng.annotations.Test;

public class First {
  @Test (groups={"Smoke"})
  public void f1() {
	  System.out.println("First method");
  }
  
  @Test (groups={"Smoke"})
  public void f2() {
	  System.out.println("Second method");
  }
  
  @Test(groups={"Smoke", "Regression"})
  public void f3() {
	  System.out.println("Third method");
  }
  
  @Test (groups={"Regression"})
  public void f4() {
	  System.out.println("Fourth method");
  }
  
  @Test (groups={"Smoke", "Regression"})
  public void f5() {
	  System.out.println("Fifth method");
  }
  
  @Test
  public void f6() {
	  System.out.println("Sixth method");
  }
}
