import org.scalatest.FunSuite

class FooBarTest extends FunSuite {

  test("the example in the mail works") {
    val mailExample = "1 2 Foo 4 Bar Foo 7 8 Foo Bar 11 Foo 13 14 FooBar 16 17 Foo"
    assert(FooBar.foobar(18).mkString(" ") == mailExample)
  }

  test("the foobar property holds") {
    FooBar.foobar(200).zipWithIndex.foreach { case (item, index) =>
      val shiftedIndex = index + 1
      item match {
        case "FooBar" => assert(shiftedIndex % 3 == 0 && shiftedIndex % 5 == 0)
        case "Foo" => assert(shiftedIndex % 3 == 0)
        case "Bar" => assert(shiftedIndex % 5 == 0)
        case _ => // No problem
      }
    }
  }

}
