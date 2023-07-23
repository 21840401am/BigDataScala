import org.apache.spark.sql.functions.{first, last}
import org.apache.spark.sql.types.{IntegerType, StringType, StructType}
import org.apache.spark.sql.{Row, SparkSession}

object MergeTwoRowsOfTheSameId {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("MergeTwoRowsOfTheSameId").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    val data = Seq(Row(100, "john", 35, null), Row(100, "john", null, "georgia"), Row(101, "mike", 25, null),
      Row(101, "mike", null, "new york"), Row(103, "mary", 22, null), Row(103, "mary", null, "texas"), Row(104, "smith", 25, null), Row(105, "jake",
        null, "florida"))
    val schema =  new StructType().add("id",IntegerType,true)
      .add("name",StringType,true)
      .add("age",IntegerType,true)
      .add("city",StringType,true)
    val df = spark.createDataFrame(spark.sparkContext.parallelize(data),schema)
    df.show()
    df.printSchema()
    // First Standard function
    val f = df
      .groupBy("id", "name")
      .agg(first("age", ignoreNulls = true) as "age", first("city", ignoreNulls = true) as "city")
      .orderBy("id")
    f.show()
    //Last standard function
    val l = f
      .groupBy("id", "name")
      .agg(last("age", true) as "age", last("city") as "city")
      .orderBy("id")
    l.show()
  }

}
