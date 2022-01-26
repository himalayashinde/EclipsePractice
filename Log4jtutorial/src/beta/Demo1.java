package beta;

import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugging in beta...!!!");

		//if (5 > 4)
		log.info("object is present in beta");
		
		log.error("object is not present in beta");

		log.fatal("This is fatal in beta");

	}

}
