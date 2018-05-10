package generalClasses;

import org.testng.annotations.Test;

public class First {
  @Test (priority=1)
  public void f() {
	  System.out.println("Welcome");
  }
  
  @Test (priority=1)
  public void f1() {
	  System.out.println("Welcome second");
  }
}
