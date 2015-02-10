package technology.walrath.euler

object E9 {

  def main(args: Array[String]): Unit = {
    val r = for(a <- 2 to 1000; b <- 1 until a; c = 1000 - b - a if a*a + b*b == c*c) yield a * b * c
	 println(r(0))
  }
}
