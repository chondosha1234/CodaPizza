package com.chondosha.codapizza.model

import androidx.annotation.StringRes
import com.chondosha.codapizza.R

enum class Topping(
    @StringRes val toppingName: Int
) {
    Basil(toppingName = R.string.topping_basil),
    Mushroom(toppingName = R.string.topping_mushroom),
    Olive(toppingName = R.string.topping_olives),
    Peppers(toppingName = R.string.topping_peppers),
    Pepperoni(toppingName = R.string.topping_pepperoni),
    Pineapple(toppingName = R.string.topping_pineapple)
}