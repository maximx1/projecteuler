package technology.walrath.euler

/**
 * Created by justin on 2/9/15.
 */
object E10 {
  def main(args: Array[String]): Unit = {
    lazy val p: Stream[Int] = 2 #:: Stream.from(3).filter(i => p.takeWhile{x => x * x <= i}.forall{i % _ > 0})
    println(p.takeWhile(_ <= 2000000).map(_.toLong).sum)
  }
}
