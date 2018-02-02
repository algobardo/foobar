object FooBar {

  def main(args: Array[String]): Unit = {
    println(foobar(100).mkString(" "))
  }

  def foobar(max: Int): Stream[String] = {
    (1 to max)
      .toStream
      .map { i =>
        if (i % 15 == 0) {
          "FooBar"
        } else {
          if (i % 3 == 0) {
            "Foo"
          } else if (i % 5 == 0) {
            "Bar"
          } else {
            i.toString
          }
        }
      }
  }


}