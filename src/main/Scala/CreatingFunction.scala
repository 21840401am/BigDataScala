object CreatingFunction {
  def main(args: Array[String]): Unit = {
    val addOne = (x: Int) => x + 1
    println(addOne(1))

    // Doubling a num with function assigned to a variable
    val doublingNum = (num: Int) => num + num
    println(doublingNum(20))
    println(doublingNum.apply(52)) // apply() method helps to read code easier

    // A function can take multiple arguements
    val multiplication = (x: Int, y: Int) => x * y
    println(multiplication.apply(890, 963))

    // If there are more than two expressions we use them in curly braces
    val addNum = (number: Int) => {
      println("We are in a function")
      number + 1
    }
    println(addNum.apply(89))
    // A function may not take parameters at
    // all

    val noParameter = () => 85
    println(noParameter.apply())

    /*    Methods look and behave very similar to functions, but there are a few key differences between them.
   Methods are defined with the def keyword. def is followed by a name, parameter list(s), a return type, and a body*/

    // Multiline methods
     def multilineMethod(x:Int,y:Int) = {
       val add = x+y
       val multiply = add*5
       val subtract = multiply+25

     }
    println(multilineMethod(2,2))

  }
}
