import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types.{ArrayType, MapType, StringType, StructType}

object MapDataframe {
  def main(args:Array[String]):Unit ={
    val spark =SparkSession.builder().master("local").appName("MapDataframe").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")

    val arrayMapSchema = new StructType().add("name", StringType)
      .add("properties", ArrayType(new MapType(StringType, StringType, true)))

    val arrayMapData = Seq(
      Row("James", List(Map("hair" -> "black", "eye" -> "brown"), Map("height" -> "5.9"))),
      Row("Michael", List(Map("hair" -> "brown", "eye" -> "black"), Map("height" -> "6"))),
      Row("Robert", List(Map("hair" -> "red", "eye" -> "gray"), Map("height" -> "6.3")))
    )

    val df = spark.createDataFrame(
      spark.sparkContext.parallelize(arrayMapData), arrayMapSchema)
    df.printSchema()
    df.show(false)


  }

}
