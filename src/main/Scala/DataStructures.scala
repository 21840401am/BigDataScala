import org.apache.spark.sql.SparkSession

object DataStructures {
  def main(args:Array[String]): Unit ={
    val spark = SparkSession.builder().master("local[*]")
  }

}
