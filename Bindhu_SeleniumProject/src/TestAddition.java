import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


public class TestAddition extends TestCase {

@Before
public void test_functionality(){
		
		Addition obj=new Addition();
		obj.add(20, 30);
		obj.multiplication(20, 50);
	}
}
