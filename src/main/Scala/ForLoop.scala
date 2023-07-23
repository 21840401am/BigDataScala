import org.apache.spark.sql.SparkSession

// Creating an object
object ForLoop {
  //Defining main method
  def main(args: Array[String]): Unit = {
    // Instantiating sparksesssion
    val spark = SparkSession.builder().master("local").appName("ForLoop").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")

    println("the value of w is :")
    // for loop using to , For loop starts from 0 and ends at 10
    for (w <- 0 to 10) {
      println(w)
    }
    //for loop using until, We can use until when We want to print the value from 0 to n-1.

    println("The value of x is : ")
    for (x <- 0 until 10) {
      println(x)
    }
    // for loop with multiple ranges
    for (a <- 0 to 10; b <- 0 until 8) {
      println("the value of a is :" + a)
      println("the value of b is :" + b)
    }

    // Scala program to illustrate how to use for loop with collection like LIST

    val rankList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (c <- rankList) {
      println("the value of c is :" + c)
    }

    // Scala program to illustrate how to use for loop with filters

    val rank1 = 0;
    val ranklist1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (rank1 <- ranklist1
         if rank1 < 10; if rank1 > 6) {
      println("The rank1 value is :" + rank1)
      // Explanation:In the above example, the for loop use two filters to filter the given collection.
      // These filters eliminate those ranks which are less than 10 and greater than 6.
    }

  }

}
