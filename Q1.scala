package Labsheet4

import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit ={
    println("Enter your deposit")
    var amount = StdIn.readInt()
    val annualInterest = interest(amount)
    println("Your annual interest is: " + annualInterest)
  }

  def  interest(money: Int):Double = money match{
    case a if a <= 0 => 0
    case a if a <= 20000 => a*0.02
    case a if a <= 200000 => a*0.04
    case a if a <= 2000000 => a*0.035
    case a if a >  2000000 => a*0.065
  }


}
