object Q6 {
  def main(args : Array[String]): Unit = {
    print("How many numbers you want : ")
    val number = scala.io.StdIn.readInt()
    printFibonacci(number)
  }

  def printFibonacci(n: Int): Unit = {
    var i :Int = 0
    while(i < n) {
      print(fibonacci(i) + " ")
      i= i + 1
    }
    println()
  }

  def fibonacci(n: Int): Int = {
    if(n == 0){
      0
    }else if(n <= 2) {
      1
    } else {
      fibonacci(n - 1) + fibonacci(n - 2)
    }
  }
}
