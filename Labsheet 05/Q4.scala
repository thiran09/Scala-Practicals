object Q4 {
  def main (args : Array[String]) : Unit = {
    println("Enter any number")
    val number : Int = scala.io.StdIn.readInt()
    check(number)
  }

  def check(number : Int): Unit = {
    if(number == 0){
      print("Even")
    }else if(number == 1){
      print("Odd")
    }else{
      check(number - 2)
    }
  }

}
