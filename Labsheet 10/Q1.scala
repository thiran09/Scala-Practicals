object Q1 {
  def calculateAverage(temperaturesCelsius: List[Double]): Double = {
    val temperaturesFahrenheit = temperaturesCelsius.map(celsius => celsius * 9/5 + 32)
    val sumFahrenheit = temperaturesFahrenheit.reduce((a, b) => a + b)
    val averageFahrenheit = sumFahrenheit / temperaturesFahrenheit.length
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val temperaturesCelsius = List(0.0, 10.0, 20.0, 30.0)
    val averageFahrenheit = calculateAverage(temperaturesCelsius)
    println(s"Average Fahrenheit Temperature: $averageFahrenheit")
  }
}
