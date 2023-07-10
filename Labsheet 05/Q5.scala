object Q5 {
  def main(args: Array[String]): Unit = {
    print("Enter any number : ")
    val number: Int = scala.io.StdIn.readInt()
    check(number)
  }
  var total : Int = 0

  def check(number: Int): Unit = {
    if (number % 2 == 0) {
      sumEven(number)
    } else {
      check(number - 1)
    }
  }
  def sumEven(number : Int): Unit = {
    if(number == 0){
      print(total)
    }else {
      total = total + number
      sumEven(number - 2)
    }
  }
}


