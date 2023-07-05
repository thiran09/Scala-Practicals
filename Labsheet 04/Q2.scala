object Q2 {

  def inputNumber(number: Int): String = number match {
    case x if number <= 0 => "Negative/Zero"
    case x if number % 2 == 0 => "Even"
    case x if number % 2 != 0 => "Odd"
  }

  def main(args : Array[String]) : Unit ={
    val number = args(0).toInt
    println(inputNumber(number))

  }

}
