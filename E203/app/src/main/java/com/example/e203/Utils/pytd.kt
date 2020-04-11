package com.example.e203.Utils

class AppSetting {
    private var values:MutableMap<String, String> = mutableMapOf()
    fun putValue(key: String, value: String) {
        values.put(key, value)
    }

    fun getValue(key: AppSetting_PARAMS) {
        values.get(key.value)
    }
}

enum class AppSetting_PARAMS(var value: String) {
    APK_DOWNLOAD_LINK("app_download_link"),
    APK_DOWNLOAD_VERS("app_versCode")
}