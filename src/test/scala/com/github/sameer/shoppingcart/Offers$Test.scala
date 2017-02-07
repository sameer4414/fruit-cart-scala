package com.github.sameer.shoppingcart

import org.specs2.mutable.Specification

class Offers$Test extends Specification {

  "2 items should cost 0.50 when price for 1 is 0.50, on buyOneGetOneApple offer" in {
    Offers.buyOneGetOneApple(2 , 0.50) must be equalTo 0.50
  }

  "3 items should cost 1.00 when price for 1 is 0.50, on buyOneGetOneApple offer" in {
    Offers.buyOneGetOneApple(3 , 0.50) must be equalTo 1.00
  }

  "4 items should cost 1.00 when price for 1 is 0.50, on buyOneGetOneApple offer" in {
    Offers.buyOneGetOneApple(3 , 0.50) must be equalTo 1.00
  }

  "3 items should cost 1.00 when price for 1 is 0.50, on threeForTwoOrange offer" in {
    Offers.threeForTwoOrange(3, 0.50) must be equalTo 1.00
  }

  "7 items should cost 1.00 when price for 1 is 0.50, on threeForTwoOrange offer" in {
    Offers.threeForTwoOrange(7, 0.25) must be equalTo 1.25
  }

  "Apple has buyOneGetOneApple offer" in {
    Offers.offer("apple")(2) must be equalTo ShoppingCart.getPrice("apple")
  }


}
