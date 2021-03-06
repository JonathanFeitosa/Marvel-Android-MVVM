package br.com.desafio_android_jonathan_feitosa.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import br.com.desafio_android_jonathan_feitosa.R
import br.com.desafio_android_jonathan_feitosa.models.ComicsResponse
import br.com.desafio_android_jonathan_feitosa.models.Thumbnail
import com.squareup.picasso.Picasso

class ImageUtils {

    companion object{

        @JvmStatic
        @BindingAdapter("bind:picassoLoad")
        fun loadImageView(image: ImageView, thumbnail: Thumbnail?) {
            if(thumbnail!!.path.isEmpty().not() && thumbnail.extension.isEmpty().not()){
                val url = "${thumbnail.path}.${thumbnail.extension}"

                Picasso.get().load(url)
                    .error(R.drawable.placeholder)
                    .into(image)
            }
        }
        @JvmStatic
        @BindingAdapter("bind:picassoLoad")
        fun loadImageView(image: ImageView, thumbnail: ComicsResponse.Data.Result.Thumbnail?) {
            if(thumbnail != null && thumbnail.path.isEmpty().not() && thumbnail.extension.isEmpty().not()){
                val url = "${thumbnail.path}.${thumbnail.extension}"

                Picasso.get().load(url)
                    .error(R.drawable.placeholder)
                    .into(image)
            }
        }
    }
}

