package com.chondosha.codapizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.chondosha.codapizza.model.Topping
import com.chondosha.codapizza.model.ToppingPlacement
import com.chondosha.codapizza.ui.PizzaBuilderScreen
import com.chondosha.codapizza.ui.ToppingCell

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaBuilderScreen()
        }
    }

}