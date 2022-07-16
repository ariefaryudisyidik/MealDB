package id.co.mealdb.utils

import android.content.Context
import android.widget.Toast

object Extension {

    fun String.toast(context: Context) {
        Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
    }
}