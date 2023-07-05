package Labsheet4

import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the number")
    var number = StdIn.readInt()
    println(patternMatching(number))
  }
  def patternMatching(number: Int): String = number match {
    case a if a < 0 => "Negative number"
    case a if a == 0 => "Zero"
    case a if a%2 == 0 => "Even number"
    case a if a%2 != 0 => "Odd number"
  }

}
