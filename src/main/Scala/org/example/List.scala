package org.example

object Listss {
  def main(args: Array[String]): Unit = {
    // Alist can contain duplicates
    val duplicateList: List[Int] = List(1, 1, 2, 3, 4, 5)
    println(duplicateList)
    val a = List(1, 2) // list is immutable ,list is recursive and it represents a linked list
    val stringList: List[String] = List("ayyappa", "maruthi", "alapati")
    println(stringList)
    // Creating list by using :: cons operator
    val consList: List[Int] = 1 :: (2 :: (3 :: Nil))
    println(consList)
    // To get the first element of list using head
    println("To get the first element of list" + stringList.head)
    //To get all the elements of list except head use Tail
    println("To get all the elements of list except head" + stringList.tail)
    // To know whether the list is a empty or not use isEmpty method which returns a boolean value
    println(stringList.isEmpty)
    // we can concatenate list in 3 methods
    // first method using triple colon (:::)
    val concatenateList = a ::: stringList //here we concatenate list of Int and String type in reesult we get Any data type
    println(concatenateList)
    // concating two lists with triple colon operator (first method)
    val concatList = a ::: consList // Both the lists are Int type and the result contains duplicates
    println(concatList)
    // concatenating two lists  with .:::()
    val concatingLists = a.:::(stringList) //diff between  ::: and .::: list a is added to the list stringList in parenthesis, but in ::: it just adds as it is
    println(concatingLists)
    // Another method to concat list is List.concat
    val listConcat = List.concat(a, stringList)
    println(listConcat)
    //Creating uniform list in scala
    val uniformList = List.fill(5)(8)
    println(uniformList)
    //To reverse a list
    val reverseList = stringList.reverse
    println("the reverse list of stringList is"+reverseList)
    // To get the element by an index using Apply method
    val indexElement = stringList.apply(2)
    println(indexElement)
    // to know whether a particular element exists or not in the list -- use contains method, which returns a boolean value
    val containsMethod = stringList.contains("ayyappa")
    println(containsMethod)
    val containsMethod2 = duplicateList.contains(5)
    println(containsMethod2)
    // To get the length of the list
    val lengthList = stringList.length
    println(lengthList)
    // to get the distinct elements in the list
    val distinctList = duplicateList.distinct
    println(distinctList)
    // to get the size of a list
    val sizeList = stringList.size
    println("The output of size on a list is"+sizeList)
    // to know whether a list contains duplicates or not, which returns a boolean value
    val checkDuplicates = duplicateList.distinct.size  != duplicateList.size
    println(checkDuplicates)
    // To get the duplicates of a list
    val getDuplicates = duplicateList.diff(duplicateList.distinct).distinct
    println(getDuplicates)

  }

}
