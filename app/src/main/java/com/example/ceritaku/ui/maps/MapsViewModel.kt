package com.example.ceritaku.ui.mapsimport androidx.lifecycle.ViewModelimport com.example.ceritaku.data.AppRepositoryclass MapsViewModel(private val appRepository: AppRepository): ViewModel() {    fun getStoriesMap() = appRepository.getStoriesMap()}