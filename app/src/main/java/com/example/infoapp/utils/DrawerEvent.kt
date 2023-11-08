package com.example.infoapp.utils

sealed class DrawerEvent{
    data class OnItemClick1(val title: String, val index: Int): DrawerEvent()

}
