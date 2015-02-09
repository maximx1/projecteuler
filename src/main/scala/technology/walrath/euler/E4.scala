package technology.walrath.euler

object E4 {
	def main(args: Array[String]) {
		println((100 to 999).flatMap(x => (x to 999).map(_ * x)).filter(x => x.toString == x.toString.reverse).max)
	}
}
