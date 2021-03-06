package com.example.restoapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Ingredients(@SerializedName("name_fr") val name: String): Serializable {
    override fun toString(): String {
        return "$name"
    }
}