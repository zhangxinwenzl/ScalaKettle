import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class testLog4j {

    public static void main(String[] args) {

//        PropertyConfigurator.configure(testLog4j.class.getResourceAsStream("log4j.properties"));
        PropertyConfigurator.configure(testLog4j.class.getResource("log4j.properties").getPath());

//        testLog4j.class.getResource("log4j.properties").getPath()
//      System.out.println(testLog4j.class.getResource("log4j.properties").getPath());
        Logger log= Logger.getLogger(testLog4j.class);
        log.info("test for log4j");
    }
}
