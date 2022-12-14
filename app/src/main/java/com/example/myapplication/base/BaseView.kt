package com.example.myapplication.base

import androidx.annotation.StringRes

interface BaseView {

    fun showError(error: String)
    fun showError(message: String, retry: () -> Unit)
    fun showLoading()
    fun hideLoading()
    fun showNoInternetError(retry: () -> Unit)
    fun showToast(message: String?)
    fun showToast(@StringRes message: Int?)
    fun showRetryPopUp()
    fun hideRetryPopUp()
    fun showNoConnectionPopUp(type: Int)
}