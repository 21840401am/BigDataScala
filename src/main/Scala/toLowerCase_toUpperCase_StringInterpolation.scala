import org.apache.spark.sql.SparkSession

object toLowerCase_toUpperCase_StringInterpolation {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("toLowerCase_toUpperCase_StringInterpolation")
      .getOrCreate()
    // To convert a string to Lower Case
    val str = "AYYAPPA MARUTHI".toLowerCase()

    // To print the result using string interpolation
    println(s"my name is $str")
    println(str.toLowerCase())

    // To convert a string to Upper Case
    val str2 = "ayyappa maruthi"
    println(str2.toUpperCase())
  }

}
