import scala.math._

object E3 {
	def main(args:Array[String]) {
		val o = 600851475143l
		lazy val p: Stream[Int] = 2 #:: Stream.from(3).filter(i => p.takeWhile{x => x * x <= i}.forall{i % _ > 0})
		println(p.takeWhile(_ <= sqrt(o).floor.toInt).filter(o % _.toLong == 0).max)
	}
}
