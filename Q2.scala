object Q2 {
    import scala.io.StdIn

    var inputList: List[String] = List.empty[String];
    var count = 0;

    def main(args: Array[String]) = {
      print("How many strings you want to enter: ")
      count = StdIn.readInt();
      func(count);

    }

    def func(count: Int): Unit = {
      var i = 0;
      while (i < count) {
        print("Enter a string: ");
        var input = StdIn.readLine();
        inputList = inputList :+ input;
        i += 1;
      }
      for (str <- inputList) {
        val length = str.length
        if (length > 5) {
          println(str);
        }
      }
    }
}
