package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingpropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties propertiesobj=new Properties();
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		propertiesobj.load(file);
		
		//Reading data from the properties file
		
	   String url=propertiesobj.getProperty("appurl");
	   String email=propertiesobj.getProperty("email");
	   String pwd=propertiesobj.getProperty("password");
	   String oid=propertiesobj.getProperty("orderid");
	   String custid=propertiesobj.getProperty("customerid");
		
		System.out.println(url+" "+email+" "+pwd+" "+oid+" "+custid);
		
		//Reading all the keys from propertieds file.
		
		//Set<String> keys=propertiesobj.stringPropertyNames();  //[password, orderid, customerid, appurl, email]
		
		//System.out.println(keys);
		
	    Set<Object> keys=propertiesobj.keySet();
	    System.out.println(keys);  //[password, orderid, customerid, appurl, email]
	    
	  //Reading all the Values from propertieds file.
		
	  	Collection<Object>	values=propertiesobj.values();
	  		
	    System.out.println(values);  //[abc, 123, 234, https://demo.opencart.com/, abc@gmail.com]
	    
	    file.close();
		
		
		
		
	

	}

}
