package technology.walrath.euler

object E2 {
	def main(args:Array[String]) {
		lazy val f: Stream[Int] = 0 #:: f.scanLeft(1)(_ + _)
		println(f.takeWhile(_ < 4000000).filter(x => x % 2 == 0).sum)
	}
}
