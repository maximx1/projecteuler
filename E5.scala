object E5 {
	def main(args: Array[String]) {
		println((20 to Int.MaxValue).find(x => (2 to 20).forall(x % _ == 0)).get)
	}
}
