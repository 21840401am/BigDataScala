import org.apache.spark.sql.SparkSession

object UsingSepInsteadOfDelimited {
  def main(args:Array[String]):Unit ={
    val spark = SparkSession.builder().master("local").appName("csv").getOrCreate()
    val df=spark.read.option("header",true).option("sep","|").csv("C:\\Users\\Admin\\IdeaProjects\\learn-spark\\source-code\\piprs\\src\\main\\resources" +
      "\\file.csv")
    df.show(false)
  }

}
