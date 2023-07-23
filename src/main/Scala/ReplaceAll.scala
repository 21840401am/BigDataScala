import org.apache.spark.sql.SparkSession
// Scala program of replaceAll()
// method

object ReplaceAll {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("ReplaceAll").getOrCreate()
    // Applying replaceAll method for a particular string
    val result = "ayyappa".replaceAll("yya", "#")
    // Applying replaceAll method from one sub string to another sub string  in a given string
    val result2 = "ayyappamaruthi29@gmail.com".replaceAll("(y)[^&]*(@)", "*")
val strRunDate = " "
    // Displays output
    println(result)
    println(result2)
    println()
  }
}
