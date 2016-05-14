// Copyright (C) 2015-2016 Raj Khanna.
package gov.dol.demo

import org.scalatest.BeforeAndAfter
import org.scalatest.FunSuite
import gov.dol.restaurant.Meal
import gov.dol.restaurant.Entry

class TestMeal extends FunSuite with BeforeAndAfter  {
  var meal: Meal = _

  before {
    meal = new Meal
  }


  test("No order has been placed yet") {
    assert(meal.getEntries.size == 0)
  }


  test("Adding an entry") {
    meal.addEntry(new Entry("Burger"))
    assert(meal.getEntries.size == 1)
  }

  test("No Meal is available as Resturant is closed") {
      intercept[Exception] {
        meal.restaurantClosed
      }
    }
}
