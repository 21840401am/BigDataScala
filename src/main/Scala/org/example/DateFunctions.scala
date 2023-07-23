package org.example

import org.apache.spark.sql.functions.current_date
import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

import java.time.{Instant, LocalDate}

object DateFunctions {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("date_methods").getOrCreate()


    println(LocalDate.now())
    println(Instant.now())
    val a = 10
    val b = 11
    if (a == b) {
      print("a is equal to b ")
    } else {
      print("a is not equal to b")
    }
    //creating a list
    val list1 = List(1, 2, 3, 4, 5)
    println(list1)
    //iterating over a list using for loop
    for (i <- list1) {
      println(i)
    }
    //Creating an array
    val array1 = Array("ayyappa", "maruthi", "alapati", "ayyappa")
    println(array1)
    for (i <- array1) {
      println(i)
    }
    // checking current_date()
    val data = Seq(Row("ayyappa", "maruthi"), Row("anjana", "devi"))
    val custSchema = StructType(Array(StructField("First_name", StringType, true), StructField("Second_name", StringType, true)))
    val df = spark.createDataFrame(spark.sparkContext.parallelize(data), custSchema)
    df.show()
    val dategg = spark.sql("SELECT current_date()")
    dategg.show()

  }
}