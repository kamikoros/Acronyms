package com.example.proyecto.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyecto.data.model.Lfs
import com.example.proyecto.domain.GetAcronyms
import kotlinx.coroutines.launch

class ViewModel : ViewModel() {
    var getAcronyms = GetAcronyms()
    val acronymsModel = MutableLiveData<Lfs>()
    val isLoading = MutableLiveData<Boolean>()

    fun search(sf:String) {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getAcronyms(sf)
            if(!result.isNullOrEmpty()){
                acronymsModel.postValue(result.first().lfs.first())
            }else{
                acronymsModel.postValue(Lfs("","","", emptyList()))
            }
            isLoading.postValue(false)
        }
    }
}