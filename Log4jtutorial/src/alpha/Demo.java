package alpha;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugging alpha...!!!");

		//if (5 > 4)
		log.info("object is present in alpha");
		
		log.error("object is not present in  alpha");

		log.fatal("This is fatal in alpha");

	}

}
