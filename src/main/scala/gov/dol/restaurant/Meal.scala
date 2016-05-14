// Copyright (C) 2015-2016 Raj Khanna.
package gov.dol.restaurant

import scala.collection.mutable.ArrayBuffer

class Meal {
  private val entries = new ArrayBuffer[Entry]

  def addEntry(e: Entry): Unit = { entries += e }
  def removeEntry(e: Entry): Unit = { entries -= e }
  def getEntries():List[Entry] = { entries.toList }
  // def getEntries() = entries.toList

  def restaurantClosed:Unit = {
    throw new Exception("No Meal!")
  }
}
