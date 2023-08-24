object q1 {

  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero") //If false, displays "Denominator cannot be zero".
    // This ensures that the denominator of a rational number is always non-zero.

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    // ensures that the rational number is in its simplest form

    private val gcdVal = gcd(n.abs, d.abs)
    val numer: Int = n / gcdVal
    val denom: Int = d / gcdVal

    def neg: Rational = new Rational(-numer, denom)

    override def toString: String = s"$numer / $denom" //using string interpolation.
    // provide a custom string representation
  }

  object Rational {
    def apply(n: Int, d: Int): Rational = new Rational(n, d)
    //creates a new Rational instance using the provided numerator n and denominator d.
  }


  def main(args: Array[String]): Unit = {
    val x = Rational(3, 4)
    val negX = x.neg
    println("x = ", x)
    println("-x =", negX)
  }


}