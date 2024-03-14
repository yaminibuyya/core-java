package Connection_using_properties;

import java.io.IOException;
import java.util.Properties;

public class Connection {

	public static void main(String[] args) {

		Properties prop=new Properties();
		try {
			prop.load(Connection.class.getClassLoader().getResourceAsStream("yami.properties"));
			System.out.println(prop.getProperty("id"));
		} catch (IOException e) {
		
		}
	
		
	}

}
