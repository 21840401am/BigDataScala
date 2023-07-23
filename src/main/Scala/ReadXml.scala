import com.databricks.spark.xml.XmlDataFrameReader
import org.apache.spark.sql.SparkSession

object ReadXml {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("XML_read").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    //Reading an xml file with options
    val xmlDf = spark.read.format("xml").option("rootTag", "data").option("rowTag", "record").load("C:\\Users\\Admin\\IdeaProjects\\learn-spark\\source-code\\piprs\\src\\main\\resources\\new 24.xml")
    xmlDf.show()
    //Reading an xml file without options
    val xmlDf2 = spark.read.format("xml").load("C:\\Users\\Admin\\IdeaProjects\\learn-spark\\source-code\\piprs\\src\\main\\resources\\new 24.xml")
    xmlDf2.show()
    //Reading an xml file with only rootTag option
    val xmlDf3 = spark.read.format("xml").option("rootTag", "data").load("C:\\Users\\Admin\\IdeaProjects\\learn-spark\\source-code\\piprs\\src\\main\\resources\\new 24.xml")
    xmlDf3.show()
    // Reading an xml file with only rowTag option
    val xmlDf4 = spark.read.format("xml").option("rowTag", "record").load("C:\\Users\\Admin\\IdeaProjects\\learn-spark\\source-code\\piprs\\src\\main\\resources\\new 24.xml")
    xmlDf4.show()
    //Reading an xml file with depenedency name in format and xml instead of load
    val xmlDf5 = spark.read.format("com.databricks").option("rootTag", "data").option("rowTag", "record").xml("C:\\Users\\Admin\\IdeaProjects\\learn-spark\\source-code\\piprs\\src\\main\\resources\\new 24.xml")
    xmlDf5.show()
  }

}
