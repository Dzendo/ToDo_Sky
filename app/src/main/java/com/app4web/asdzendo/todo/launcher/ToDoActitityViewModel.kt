package com.app4web.asdzendo.todo.launcher


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.app4web.asdzendo.todo.database.FactRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class ToDoActitityViewModel @Inject constructor(
       private val factRepository: FactRepository
): ViewModel() {
    // Наблюдается (т.к. это LifeData) из ToDoActivity
    val count:LiveData<Int> = factRepository.count()
    init {
        Timber.i("TODOActitityViewModel created")
    }
}