package com.sara.tutorialrecycleview

sealed class TaskCategory {

    object Personal: TaskCategory()
    object Business: TaskCategory()
    object Other: TaskCategory()
}