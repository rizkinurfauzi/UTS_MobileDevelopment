package com.rizkinf.tokorizki.activity.login

import com.rizkinf.tokorizki.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}