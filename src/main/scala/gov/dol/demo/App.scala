// Copyright (C) 2015-2016 Raj Khanna.
package gov.dol.demo

/**
 * @author ${user.name}
 */
object App {

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def main(args : Array[String]):Unit = {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
