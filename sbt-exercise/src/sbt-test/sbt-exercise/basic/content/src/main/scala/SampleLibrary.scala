package stdlib

import exercise.Library

/** This is my Library
  * @param name sample
  */
object SampleLibrary extends Library {

  override def owner = "scala-exercises"
  override def repository = "scala-exercises"

  override def color = Option("#BADA55")

  override def sections = List(
    FooSection,
    BarSection
  )

}
