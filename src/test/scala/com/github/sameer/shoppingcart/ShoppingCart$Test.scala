package com.github.sameer.shoppingcart

import org.specs2.mutable.Specification

class ShoppingCart$Test extends Specification {

  "Price of an apple is 0.60'" in {
    ShoppingCart.getPrice("apple") must be equalTo 0.60
  }

  "Price of an orange is 0.25'" in {
    ShoppingCart.getPrice("orange") must be equalTo 0.25
  }

  "Price of item that doesn't exist is 0" in {
    ShoppingCart.getPrice("nonexistent") must be equalTo 0
  }

  "Get price should work in case insensitive manner" in {
    ShoppingCart.getPrice("Apple") must be equalTo 0.60
    ShoppingCart.getPrice("OrAnge") must be equalTo 0.25
  }

  "2 Apples should cost 1.20 on checkout" in {
    ShoppingCart.checkout(Array("apple", "apple")) must be equalTo 1.20
  }

  "3 Apples should cost 1.80 on checkout" in {
    ShoppingCart.checkout(Array("apple", "apple", "apple")) must be equalTo 1.8
  }

  "An apple and an orange should cost 0.85" in {
    ShoppingCart.checkout(Array("apple", "orange")) must be equalTo 0.85
  }

  "3 apples and 3 oranges should cost 2.55" in {
    ShoppingCart.checkout(Array("apple", "apple", "apple", "orange", "orange", "orange")) must be equalTo 2.55
  }

  "4 apples and 3 oranges should cost 3.15 in any order case insensitive" in {
    ShoppingCart.checkout(Array("Apple", "Orange", "apple", "orange", "Apple", "orange", "apple")) must be equalTo 3.15
  }

  "2 Apples should cost 0.60 on checkout with offers" in {
    ShoppingCart.applyOffers(Array("apple", "apple")) must be equalTo 0.60
  }

  "3 Apples should cost 1.20 on checkout with offers" in {
    ShoppingCart.applyOffers(Array("apple", "apple", "apple")) must be equalTo 1.20
  }

  "3 Oranges should cost 0.50 on checkout with offers" in {
    ShoppingCart.applyOffers(Array("orange", "orange", "orange")) must be equalTo 0.50
  }

}
 
