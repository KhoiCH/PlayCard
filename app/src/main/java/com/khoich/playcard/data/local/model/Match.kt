package com.khoich.playcard.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Match(
    @PrimaryKey(autoGenerate = true)
    val matchId: Long = 0,
)
