package br.com.desafio_android_jonathan_feitosa.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Comics (
    var available:Int,
    var collectionURI:String,
    var items:List<ItemComics>,
    var returned:Int
):Parcelable