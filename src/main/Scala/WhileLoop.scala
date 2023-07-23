import org.apache.spark.sql.SparkSession

object WhileLoop {
  def main(args:Array[String]):Unit ={
    val spark = SparkSession.builder().master("local").appName("WhileLoop").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    // Initializing variable a
    // If we are taking val in place of var it throws an error
    var a = 10
    while(a < 20){
      println("the value of a is :"+a);
      a = a + 2;
    }
  }

}
