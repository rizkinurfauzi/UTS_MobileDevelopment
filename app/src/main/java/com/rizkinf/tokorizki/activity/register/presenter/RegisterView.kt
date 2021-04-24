package com.rizkinf.tokorizki.activity.register.presenter

interface RegisterView {
    fun onSuccessRegister()
    fun onErrorRegister(msg: String?)
}