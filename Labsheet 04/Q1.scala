object Q1{
  def calculateInterest(amount : Double) : Double = {

    val interest : Double = amount match {
      case x if x <= 20000 => x*0.02
      case x if x <= 200000 => x*0.04
      case x if x <= 2000000 => x*0.035
      case x => x*0.065
    }
    interest
  }

  def main(args : Array[String]) : Unit = {
    println("Enter deposit amount : ")
    val deposit: Double = scala.io.StdIn.readDouble()
    val interest: Double = calculateInterest(deposit)

    println(s"Interest value for Rs.$deposit is Rs.$interest")
  }
}