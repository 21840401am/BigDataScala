import org.apache.spark.sql.SparkSession

object Test {
  def main(args: Array[String]): Unit = {
    val spark =
      SparkSession.builder().master("local").appName("Test").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    var a, b, c = 1
    println(a, b, c)
    val d, e, f = 2
    println(d, e, f)

    //Creating a tuple
    val ayyappa = ("alapati", "maruthi", 22, 22.5, 22.666)
    // Accessing the elements in a tuple in two ways
    println(ayyappa._1) // we can't give '0' here
    println(ayyappa._3)

    //Accessing the elements in another way(scala3)
    // But it is not working because we are using scala 2.11, so we are commenting it out
    //println(ayyappa(0))
    //println(ayyappa(1))

    //data type declaration

    val name: String = "ayyappa maruthi"
    println(name)
    val number: Int = 2
    // val number : Int = 2.6 Type mismatch


    //
    val (j, k, l) = (1, 2, "ayyappa")
    println(j, k, l)
    /* A function or methods that are defined using Scala def keyword get evaluated when they are called.
          This practice reduces the load on compiler because if a function is not called in some case.It is not evaluated.*/

    // Creating a method on our own to find a square root
    def squareOf(x: Int) = x * x

    val y = 6
    val squareRoot = squareOf(y)
    println(squareRoot)

    // Creating a method/function to create a cube root
    def cubeRoot(x: Int) = x * x * x

    // We are testing the above method
    val z = 6
    val cubeRootOfZ = cubeRoot(z)
    println(cubeRootOfZ)

    // We will create a method to double a number

    def doubleTheNumber(x: Int) = x * 2

    val doubleOfNumber = doubleTheNumber(3)
    println(doubleOfNumber)

    //Defining a variable with two elements
    def addingTwoElements(x: Int, y: Int) = x + y

    // Applying the above method/function with some values
    val addTwoNum = addingTwoElements(9, 10)
    println(addTwoNum)
    // Here we are giving defined variables
    val (s, m) = (8, 10)
    val addTwoNum2 = addingTwoElements(s, m)
    println(addTwoNum2)


    //Anonymous function(the function that has no name)
    //This below function will take one arguement and doubles it
          (x: Int) =>x * 2
      //  On the left of => is a list of parameters. On the right is an expression involving the parameters


      // Assigning a function to a variable (or) Naming a function
      val increaseByOne = (num: Int) => num + 1

      // Applying the above function
      println(increaseByOne(8))

      // Doubling a num with function assigned to a variable
      val doublingNum = (num: Int) => num + num
      println(doublingNum(20))
      println(doublingNum.apply(52)) // apply() method helps to read code easier

      // A function that takes two arguements
      val multiplication = (x:Int, y:Int) => x*y
      println(multiplication.apply(890,963))

            val addOne = (x: Int) => x + 1
            println(addOne(1))


  }


}
