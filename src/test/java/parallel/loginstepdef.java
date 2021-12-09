package parallel;

import java.util.List;
import java.util.Map;

import com.base.driverclass;
import com.page.loginpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginstepdef {
	
	loginpage lp = new loginpage(driverclass.getDriver());
	
	
	
	@Given("I want to write a step with precondition")
	public void login() {
		lp.login();
	}
	
	@When("some other precondition")
	public void asset() {
		lp.asset();
	}
	
	@Given("I want to write a step with preconditio")
	public void login1() {
		lp.login();
	}
	
	@When("some other preconditio")
	public void asset1() {
		lp.asset();
	}
 
	
	@Given("I want to write a step {int} precondition1")
	public void i_want_to_write_a_step_precondition1(int name) {
		System.out.print(name);
		lp.login();
	}
	
	@When("some other precondition1")
	public void asset2() {
		lp.asset();
	}
	

	@Given("I want to write a step precondition2")
	public void i_want_to_write_a_step_precondition2(DataTable d) {
		List<String> list = d.asList();
		for(int i =0;i<list.size();i++) {
			 
			System.out.print(list.get(i));
		}
		lp.login();
	}
	
	
	@Given("I want to write a step precondition3")
	public void i_want_to_write_a_step_precondition3(DataTable d) {
		List<Map<String, String>> map = d.asMaps();
		/*for(int i =0;i<map.size();i++) {
			 
			System.out.print(map.get(i));
		}*/
		System.out.print(map.get(0).get("rollno"));
		
		lp.login();
	}
	
	
	@Given("I want to write a step {string} precondition4 {string}")
	public void i_want_to_write_a_step_precondition4(String a,String b) {
		System.out.print(a + b);
	}
	 
	
	
	
	@When("some other  precondition2")
	public void asset3() {
		lp.asset();
	}

}
