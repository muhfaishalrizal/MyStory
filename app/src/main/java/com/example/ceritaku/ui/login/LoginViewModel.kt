package com.example.ceritaku.ui.loginimport androidx.lifecycle.ViewModelimport com.example.ceritaku.data.AppRepositoryclass LoginViewModel(private val appRepository: AppRepository): ViewModel() {    fun authLogin(email: String, password:String) = appRepository.autLogin(email, password)}