import org.apache.spark.sql.SparkSession

object MultiLineMethod {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("MultiLineMethod").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")

    // Multiline methods
    def multilineMethod(x: Int, y: Int) = {
      val add = x + y
      val multiply = add * 5
      val subtract = multiply - 25
      val divide  = subtract/2
      subtract // I didn't know why it  is required here
    }

    println(multilineMethod(2, 2))

    def addThenDouble(a: Int, b: Int): Int = {
      val sum = a + b
      val doubled = sum * 2
      doubled // I didn't know why it  is required here
    }

    println(addThenDouble(2, 2))

    // using If else in the multiline methods
    def ifElseMultiLineMethod(a: Int, b: Int) = {
      if (a > b) "a is greater than b" else "a is less than b"
    }

    println(ifElseMultiLineMethod(5, 2))
  }

}
