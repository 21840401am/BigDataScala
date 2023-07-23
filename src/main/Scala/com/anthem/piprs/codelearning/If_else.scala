package com.anthem.piprs.codelearning

import org.apache.spark.sql.SparkSession

import scala.Console.println

object If_else {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("If_else").getOrCreate()


    val a = 8 //for assigning a value we use single equal to

    val b = if (a == 8) ("a is equal to 8") else ("a is not equal to 8") //for equality we use double equal to
    //If we do not provide the curly braces ‘{‘ and ‘}’ after if(condition) then by default
    // if statement will consider the immediate one statement to be inside its block.
    val c = if (a == 8) 8 // without else statement
    val d = if (a == 9) 4 // without else statement and the condition is false
    val e = if (a == 9) "the condition is true" else "the condition is false";
    if (a == 8) println("the condition is true") else println("the condition is false") // we have not assigning it to a variable, though we will get output because of println

    if (a == 8) {
      println("the condition is true")
    } else {
      println("the condition is false")
    } //keeping in braces
    println(b)
    println(c)
    println(d)
    println(e)


    // Next we are using string interpolation in if statement
    val f = 9
    if (f == 9) {
      println(s"the value of f is $f which is true")
    } else {
      println(s"the value of f is $f which is false")
    }
    // Next we are using if else if statements
    val x = 120
    val foo : Int = if (x > 0) 1  else  3
    val bar = if (x > 0) 1 else if (x < 0) 2
    println("the value of bar expression is" + bar) //we can't give the println statement without  '+'


  }
}