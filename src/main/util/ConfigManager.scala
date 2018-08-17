package util

import java.util.Properties
import java.io.InputStream
import scala.collection.JavaConverters.propertiesAsScalaMap

object ConfigManager {
  val prop:Properties= java.util.Properties
  private val path:String=this.getClass.getResource("/config.properties").getPath


  def getProFromPath():Properties={
    synchronized{
      if(prop.isEmpty){
        var is:InputStream=null
        try{
          is=this.getClass.getResourceAsStream(path)
          prop.load(is)
        }
        catch {
          case e:Exception=> throw new RuntimeException(e.getMessage)
        }

        finally{
          is.close()
        }

      }
      prop
    }
  }

  def main(args: Array[String]): Unit = {
    //val prop: scala.collection.Map[String, String] =System.getProperties();
      //    java.util.Properties => scala.collection.mutable.Map[String,String]
      //val prop: scala.collection.Map[String, String]=
      //getProFromPath
  }
}
