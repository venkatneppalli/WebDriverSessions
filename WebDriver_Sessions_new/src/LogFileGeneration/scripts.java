package LogFileGeneration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class scripts {


	public static Logger logfile;
	
	
	public static void main(String[] args) {
		
		//MyLOG = Logger.getLogger("devpinoyLogger");
		
		BasicConfigurator.configure();
		
		logfile=Logger.getLogger("ISACALogger");
		
		logfile.debug("Hellow Now started testingnew test");
		
		
		
		

	}

}
