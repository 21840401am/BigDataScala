package com.anthem.DataStructures

object ArrayOperations {
  def main(args: Array[String]): Unit = {

    val size = scala.io.StdIn.readInt()

    val arr = new Array[Int](size)
    for (i <- 0 until size) {
      print(i)
      arr(i) = scala.io.StdIn.readInt()
    }

    for (i <- arr) {
      print(arr(i))
    }
  }


}
