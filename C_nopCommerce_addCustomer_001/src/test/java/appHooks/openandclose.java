package appHooks;


import java.io.IOException;
import java.time.Duration;

import baseClass.baseclass;
import driverUtils.utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class openandclose {
	private baseclass bc=new baseclass();
	private utils u= new utils();
	
	@Before
	public void open() throws IOException {
		String brow=bc.key("browser");
		if(brow.equals("chrome"))
			bc.chrome();
		else
			bc.firefox();
		bc.driver.manage().window().maximize();
		bc.driver.get(bc.key("url"));
		bc.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@After
	public void close() throws IOException {
		u.screenshot();
		bc.driver.close();
	}
}

