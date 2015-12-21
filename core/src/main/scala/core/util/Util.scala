package core.util

object Util {

  def tokenize(text: String): Array[String] = {
    text.split("""\s+""")
  }

}
