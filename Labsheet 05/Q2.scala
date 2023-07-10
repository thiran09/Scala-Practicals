object Q2 {
  def main(args: Array[String]): Unit = {
    val value = args(0).toInt
    //val value : Int = scala.io.StdIn.readInt()
    prime(value)
  }

  var j : Int = 2
  var i : Int = 2

  def prime(value: Int): Unit = {
    while(i <= value){
      primeSeq(i)
      i = i + 1
    }
  }

  def primeSeq(i: Int): Unit = {
    if(i == j){
      print(i + " ")
    }else if( i % j == 0){
      print("")
    }else{
      j = j + 1
      primeSeq(i)
    }
    j = 2
  }
}





