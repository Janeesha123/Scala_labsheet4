package Labsheet4

object Q3 {
  def main(args: Array[String]): Unit={
    println(format("Benny",upper))
    println(format("Niroshan",lower))
    println(format("Saman",lower))
    println(format("Kumara",upper))

  }

  def upper(str: String): String={
    str.toUpperCase()
  }
  def lower(str: String): String={
    str.toLowerCase()
  }
  def format(name: String,format:String=>String): String={
    format(name)
  }

}
