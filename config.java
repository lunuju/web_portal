//whichever package you want

/*
it has been decided by mutual consensus that
a flag will be used in order to indicate which
configuration profile should be used at a given
time
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

//put this as part of any function
public class sample {
	//function that saves configurations in a file
	public static void saveConfig() {
		Properties prop = new Properties();
		OutputStream output = null;

		try {
			output = new FileOutputStream("config.properties");

			//set the properties value
			prop.setProperty("dbtype", "sql");
			//prop.setProperty("dbtype", "json");

			//save properties to project root folder
			prop.store(output, null);
		} catch(IOException io) {
			io.printStackTrace();
		} finally {
			if(output != null) {
				try {
					output.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	} //saveConfig() ends
	
	//functions that load configuration from a file using a flag as return
	public static String loadConfig() {
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream("config.properties");

			//load a properties file
			prop.load(input);
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return prop.getProperty("dbtype");
	} //loadConfig() ends
} //class sample ends
