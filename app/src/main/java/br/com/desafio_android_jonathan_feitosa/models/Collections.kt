package br.com.desafio_android_jonathan_feitosa.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Collections (
    var resourceURI:String,
    var name:String?
):Parcelable
