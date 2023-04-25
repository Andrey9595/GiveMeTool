package ru.anb.givemetool.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Products(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val authorId: Int,
    val author: String,
    val content: String,
    val photo: Int,
    var liked: Boolean = false,
    var basket: Boolean = false,
)
