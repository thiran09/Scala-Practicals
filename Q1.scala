object Q1 {

    def reverseString(newString: String): Unit = {

      if (newString.length() != 0) {
        var temp = newString.charAt(0)
        reverseString(newString.substring(1))
        print(temp)
      }
    }

    def main(args: Array[String]): Unit = {
      print("Enter a string : ")

    }

  val newString = scala.io.StdIn.readLine()
  println(newString)
  reverseString(newString)


}
