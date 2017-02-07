package com.github.sameer.shoppingcart

object Offers {

  def buyOneGetOneApple(numberOfItems: Int, costOfOne: Double): Double = ((numberOfItems / 2) + (numberOfItems % 2)) * costOfOne

  def threeForTwoOrange(numberOfItems: Int, costOfOne: Double): Double = (2 * (numberOfItems/3) + (numberOfItems %3)) * costOfOne

  def offer(item: String): Int => Double = {
    val price: Double = ShoppingCart.getPrice(item)
    item toLowerCase() match {
      case "apple" => (numberOfItems:Int) => buyOneGetOneApple(numberOfItems, price)
      case "orange" => (numberOfItems:Int) => threeForTwoOrange(numberOfItems, price)
      case _ => (numberOfItems:Int) => numberOfItems * price
    }
  }

}
