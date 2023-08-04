package com.anthem.DataStructures

import org.apache.spark.sql.SparkSession

object ListOperations {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("Operations on List").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    val list1 = List(1, 2, 3, 4, 5)
    // Printing the elements in List
    print(list1)
    println(list1)
    // Printing the elements of list by iterating over a list using for loop

    for (i <- list1) {
      println(i)
    }

    // Printing the square roots of elements in the list using for loop
    for (i <- list1) {
      println(i * i)
    }

    // Filtering the elements in the list
    /*for (i <- list1 if i > 2 {

       print(i)
     }
     else {
       print(i-1)}
     )
     {
       println(i)
     }*/
    // Concatenating two lists
    val list2 = List(23, 45, 67, 85)
    val list3 = List(85, 21, 40, 52)
    val concatenated_list = list2 ::: list3
    print("printing concatenated list")
    println(concatenated_list)

    // ++ way of concatenating list
    val anotherConcatList = list2 ++ list3
    print("printing  ++ concatenated list")
    println(anotherConcatList)

    // Using concat method to concat list
    val concatList = List.concat(list2, list3)
    print("printing concatenated list using concat method")
    println(concatList)

    // Concatination two list, one of the list will be reversed
    val list7 = List(1, 2, 3, 4, 5)
    val list8 = List(6, 7, 8, 9, 10)
    val concatenatedReversedList = list7.reverse_:::(list8)
    println(" printing Concatination of two list, one of the list will be reversed")
    println(concatenatedReversedList)
    for (j <- list8) {
      println(j)
    }
    // Add an element at the beginning of the list
    val listA = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val listB = List(10, 11, 12, 13)
    val appendElement = 56
    val concatedListAB = listA ++ listB
    println("Add an element at the beginning of the list")
    println(concatedListAB)


    //Using mkString method on list
    val mkStringList = list1.mkString("/", ",", "/")
    print("printing mkStringList")
    println(mkStringList)

    // Using takeRight method on a list
    // takeRight method will have index starts with 1 from right side of a list
    val list4: List[String] = List("Ayyappa", "maruthi", "alapati", "amarayya")
    val takeRightList = list4.takeRight(2)
    print(takeRightList)

    val list5 = List(2, 45, 76, "ayyappa", true)
    print("printing list that contains various datatypes")
    print(list5)
    for (k <- list5) {
      println(k)
    }
    // To get the head of a list
    val headElement = list5.head
    println(headElement)

    // To  get the tail element of a list
    val tailElement = list5.tail
    println(tailElement)


    // to get the datatype of element in a list
    val dataTypeList = list5.head.getClass.getSimpleName
    println(dataTypeList)
    val dataTypeList1 = list5(3).getClass.getSimpleName
    println(dataTypeList1)

    // Appending an element to a list at the end
    /* The :+ operator in Scala is right-associative, meaning it appends an element to the end of a sequence.
       If you reverse the order, it will not append the element to the original list*/
    val appendingElement = 6
    val appendedList = list5 :+ appendingElement
    println(appendedList)

    // Appending an element to a list in the beginning
    val appendedList1 = appendingElement +: list5
    println("Appending an element to a list in the beginning")
    println(appendedList1)

    // Get the last element of the list

    val lastElementList = list5.last
    println(lastElementList)

    // Access the elements of a list

    println(list5(0))
    println(list5(1))
    println(list5(2))

    // Creating an empty list
    val emptyList: List[Int] = Nil
    println(emptyList)

    // Creating an empty list of String
    val emptyStringList: List[String] = Nil
    println(emptyStringList)

    // Sorting a list
    val list6 = List(99, 88, 46, 52)
    println("printing the sorted list")
    println(list6.sorted)

    // Sorting the list in reverse order
    println("Sorting the list in reverse order(descending order)")
    println(list6.sorted.reverse)


    //  Get all elements of the list except the last one. Using init method
    val list9 = List(89, 52, 26, 48)
    println(" Printing all elements of the list except the last one. Using init method")
    println(list9.init)

    // get the length of the list
    val list10 = List(1, 2, 3, 4, 56, 7, 8, 9, 1, 0, 11, 12)
    println("printing the length of the list below")
    println(list10.length)

    /*Length compare
    If the length of the collection is less than len, the method returns a negative integer.
     If the length of the collection is equal to len, the method returns 0.
     If the length of the collection is greater than len, the method returns a positive integer*/

    val lengthCompareList = list9.lengthCompare(2)
    println(lengthCompareList)

    // Checking whether a list is empty or not
    println("Checking whether a list is empty or not")
    println(list10.isEmpty)

    //Filtering a list
    val list11 = List(88, 95, 52, 64, 75, 15, 45, 68)
    val list12 = list11.filter(i => i > 64)
    println("'printing the list of elements which are greater than 64")
    for (j <- list12) {
      println(j)
    }
    // Filtering the list using if else condition
    val filteredList = list11.filter(j => if (j >= 60) {
      true
    } else {
      false
    })

    for (i <- filteredList) {
      println(i)
    }

    //Using map function on a list
    val list13 = List(12, 13, 14, 15, 16, 17)
    val mapList = list13.map(m => m * m)
    println("Using map function caluculating squares for all the elements in list ")
    println(mapList)

    val cubeMapList = list13.map(m => m * m)
    print("Using map function caluculating squares for all the elements in list ")
    println(cubeMapList)

    // doubling all the elements in a list
    val doubledList = list13.map(n => n * 2)
    println("Doubling all the elements in the  list ")
    println(doubledList)

    //Mapping each element to a string
    val stringMapList = list13.map(n => s"Seq_no : $n")
    println("mapping all the elements in the list")
    println(stringMapList)

    // caluculating the sum of all the elements in the list
    val list14 = List(10, 20, 30, 40, 50)
    println("printing sum of all the elements in the list")
    println(list14.sum)

    // Calculating product of all the elements in the list
    val list15 = List(1, 2, 3, 4, 5)
    println("calculating the product of all the elements in the list")
    println(list15)

    // Getting the size of a list
    val list16 = List(1, 2, 3, 4)
    println("printing the size of a list")
    println(list16)

    /*In general, both size and length give you the number of elements in a list.
    However, if you are specifically working with lists or arrays, using length is generally preferred because
     it is more efficient for these collections. If you are working with more general collections, you can use size,
     which is available on all collections, but be aware that it might take linear time for certain collection types.
*/
    // Getting the minimum value in the list
    val list17 = List(23, 82, 89, 98)
    println("printing the lowest element in a list")
    println(list17.min)

    // Getting the maximum value in the list
    val list18 = List(89, 100, 56, 74)
    println("printing the  maximum element in a list")
    println(list18.max)

    // Using init() method which gives all the elements of the list except last one
    val list19 = List(21, 20, 36, 45)
    println("printing all the elements of the list except last one")
    println(list19.init)

    // getting all the elements of a list using filterNot method
    val list20 = List(50, 40, 60, 30, 85)
    println("Printing all the elements which satisfies filter condition using filterNot")
    println(list20.filterNot(i => i % 2 != 0))


    //Reading elements from console
    val inputList = scala.io.StdIn.readInt()







    // Using foreach over a list
    list1.foreach(i => print((i * i) + ","))
    list1.foreach(i => print((i * i) + " "))


  }

}
