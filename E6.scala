import scala.math._

object E6 {
	def main(args: Array[String]) {
		println(square((1 to 100).sum) - (1 to 100).map(square).sum)
	}

	def square(x: Int) = x * x
}
