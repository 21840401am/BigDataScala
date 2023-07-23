package org.example

import org.apache.parquet.format.IntType
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}
import java.time.Instant

object FindNullValuesPerColumn {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("FindNullValuesPerColumn").getOrCreate()
    import spark.implicits._
    val data = Seq(Row(1, "ayyappa"), Row(null, "maruthi"), Row(3, null), Row(4, null), Row(null, "gopi"))
    val custSchema = StructType(Array(StructField("id", IntegerType, true), StructField("name", StringType, true)))
    val df = spark.createDataFrame(spark.sparkContext.parallelize(data), custSchema)
    println(Instant.now())
    df.limit(3).show()
    df.show(3)
    df.head(2).foreach(println)

  }

}
