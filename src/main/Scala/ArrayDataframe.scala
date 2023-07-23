import org.apache.spark.sql.functions.explode
import org.apache.spark.sql.types.{ArrayType, MapType, StringType, StructType}
import org.apache.spark.sql.{Row, SparkSession}

object ArrayDataframe {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("ArrayDataframe").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")

    val data = Seq(Row("Football", List(Map("ball" -> "football", "color" -> "white"))),
      Row("Basketball", List(Map("ball" -> "basketball", "color" -> "orange"))),
      Row("Cricket", List(Map("ball" -> "cricket_tennis_ball", "color" -> null))))
    val schema = new StructType().add("sport", StringType, true)
      .add("properties", ArrayType(MapType(StringType, StringType, true)))

    val df = spark.createDataFrame(spark.sparkContext.parallelize(data), schema)
    df.show(false)
    df.printSchema()
    import spark.implicits._
    val df2 = df.select($"sport", explode($"properties") as "details")
    df2.show(false)
    val df3 = df2.select($"sport",explode($"details"))
    df3.show()
   // val df4 = df3.select()


  }

}
