package technology.walrath.euler

object E7 {
	def main(args:Array[String]) {
		lazy val p: Stream[Int] = 2 #:: Stream.from(3).filter(i => p.takeWhile{x => x * x <= i}.forall{i % _ > 0})
		println(p.take(10001).last)
	}
}
