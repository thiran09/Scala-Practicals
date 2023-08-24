object q2 {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    private val gcdVal = gcd(n.abs, d.abs)
    val numer: Int = n / gcdVal
    val denom: Int = d / gcdVal


    def sub(other: Rational): Rational = {
      new Rational(numer * other.denom - other.numer * denom, denom * other.denom)
    }

    override def toString: String = s"$numer / $denom"
  }

  object Rational {
    def apply(n: Int, d: Int): Rational = new Rational(n, d)
  }


  def main(args: Array[String]): Unit = {
    val x = Rational(3, 4)
    val y = Rational(5, 8)
    val z = Rational(2, 7)

    val result = x.sub(y).sub(z)
    println("x - y - z = ",result)

  }


}
