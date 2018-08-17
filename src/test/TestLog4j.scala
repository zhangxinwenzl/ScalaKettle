import org.apache.log4j.{Logger, PropertyConfigurator}

object TestLog4j {
  def main(args: Array[String]): Unit = {

    //PropertyConfigurator.configure(testLog4j.class.getResourceAsStream("config.properties"));
   // PropertyConfigurator.configure(testLog4j.class.getResource("config.properties").getPath());



    PropertyConfigurator.configure(this.getClass.getResource("log4j.properties").getPath)
   // PropertyConfigurator.configure(TestLog4j.getClass.getResource("config.properties").getPath)
   // PropertyConfigurator.configure(TestLog4j.getClass.getResourceAsStream("config.properties"))


    val logger= Logger.getLogger(TestLog4j.getClass)
    logger.info("Hello")
  }
}
