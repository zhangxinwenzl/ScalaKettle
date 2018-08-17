import scala.collection.JavaConverters.propertiesAsScalaMap


object TestPropertiesMap {
  def main(args: Array[String]): Unit = {

    val props:scala.collection.mutable.Map[String,String]=propertiesAsScalaMap(System.getProperties)
  }
}
#