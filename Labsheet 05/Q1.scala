object Q1 {
  def main(args : Array[String]) : Unit = {
    println("Enter any integer: ")
    val number: Int = scala.io.StdIn.readInt()
    println(prime(number))

  }
  var i : Int  = 2

  def prime(value : Int): Boolean = {
    if(value == i){
      return true
    }else if(value % i == 0){
      return false
    }else{
      i = i+1
      prime(value)
    }
  }
}
