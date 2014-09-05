package com.github.foostan

import scala.util.parsing.combinator._

object Parser extends RegexParsers {

  def code = """[a-zA-Z \n\r{}:\[\]]*""".r

  def parse(input: String) = parseAll(code, input)
}

