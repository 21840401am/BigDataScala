/*
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{count, countDistinct}

object AggregationFunctions {
  def main(args:Array[String]):Unit={
    val spark =SparkSession.builder().master("local").appName("AggregationFunctions").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    val df = spark.read.options(Map("header"->"true","inferschema"->"true")).csv("C:\\Users\\Admin\\IdeaProjects\\learn-spark\\source-code\\piprs\\src\\main\\resources\\new 11.csv")
    df.show(100,50,true)

    //Applying count function to get the no of rows
    df.select(count("*"). as("no_of_rows")).show()
    df.select(count("*"). alias("no_of_rows")).show()
    //countDistinct
    df.select(countDistinct("dockcount").as("diastinct_count_of_dockcount")).show()
    df. select distinct (count("dockcount").as("diastinct_count_of_dockcount")).show()

    //
    //df.distinct.count.show()
  }

}
*/
