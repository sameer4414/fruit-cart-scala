package com.github.sameer.shoppingcart

object Main {

  def main(args: Array[String]) {
    println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.applyOffers(args))
  }

}
