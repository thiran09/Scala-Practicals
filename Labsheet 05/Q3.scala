object Q3 {
  def main(args : Array[String]): Unit = {
    println("Enter a number : ")
    val number : Int = scala.io.StdIn.readInt()
    sum(number)
  }

  var total : Int = 0

  def sum(number : Int) : Unit = {

    if(number == 0){
      print(total)
    }else {
      total = total + number
      sum(number - 1)
    }
  }
}
