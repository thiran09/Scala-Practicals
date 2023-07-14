object Q3 {
  def main(args: Array[String]) = {
    var (num1, num2) = (8, 9);
    func(num1, num2);
  }

  def func(x: Int, y: Int): Unit = {
    var z = x + y;
    var a: Double = 0
    a = z / 2.0;
    printf("%.2f\n", a)
  }

}
