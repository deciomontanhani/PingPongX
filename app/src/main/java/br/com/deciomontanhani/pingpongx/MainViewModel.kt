package br.com.deciomontanhani.pingpongx

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var playerOneScore = MutableLiveData<Int>(0)
    var playerTwoScore = MutableLiveData<Int>(0)

    fun goalPlayer1() {
        playerOneScore.value = playerOneScore.value?.plus(1)
    }

    fun goalPlayer2() {
        playerTwoScore.value = playerTwoScore.value?.plus(1)
    }

    fun revenge() {
        playerOneScore.value = 0
        playerTwoScore.value = 0
    }
}