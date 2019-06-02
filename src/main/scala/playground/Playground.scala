package playground

object Playground extends App {
//
//  def makeUpper(xs: List[String]) = xs map {
//    _.toUpperCase
//  }
//
//  def makeWhatEverYouLike(xs: List[String], sideEffect: String ⇒ String) =
//    xs map sideEffect
//
//  makeUpper(List("abc", "xyz", "123"))
//
//  makeWhatEverYouLike(List("ABC", "XYZ", "123"), { x ⇒
//    x.toLowerCase
//  })

  val e = '\"'
  val f = '\\'

  println("%c".format(e))

  println("%c".format(f))
}
