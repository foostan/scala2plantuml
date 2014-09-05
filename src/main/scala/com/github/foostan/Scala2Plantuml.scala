package com.github.foostan

import scala.io.Source

object Scala2Plantuml {
  def main(args: Array[String]) {
    val code = Source.fromFile("sample/Sample.scala").mkString("")
    val res = Parser.parse(code)
    println(res)
  }
}
