package org.example

object CreatingFun {
  def main(args: Array[String]): Unit = {

    //Creating a function to add two numbers
    def addition(a: Int, b: Int): Int = {
      a + b
    }

    val a = 7
    val b = 10
    val c = addition(a, b)
    println(c)

    //
    def addAndSub(a: Int, b: Int): Int = {
      (a + b) + (a - b)
    }

    val d = addAndSub(a, b)
    println(d)

    // we can write a parameter less function
    def aParameterLessFunction(): String = "ayyappa"

    println(aParameterLessFunction())
    println(aParameterLessFunction) // we can call a parameterless function without parenthesis in scala 2
    // In scala 3 we have to call a parameterless function with_parenthesis, with parenthesis only
    // in scala 3 we have to call a parameterless_function_without_parenthesis, without parenthesis only

    // a repeated function
    def aRepeatedFunction(a: String, b: Int): String = {
      if (b == 1) a else a + aRepeatedFunction(a, b - 1)
    }
    println(aRepeatedFunction("ayyappa",5))
  }

}
