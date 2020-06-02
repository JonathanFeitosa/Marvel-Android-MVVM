package br.com.desafio_android_jonathan_feitosa.ui.hq

import android.util.Log.i
import androidx.lifecycle.MutableLiveData
import br.com.desafio_android_jonathan_feitosa.base.BaseViewModel
import br.com.desafio_android_jonathan_feitosa.models.ComicsId
import br.com.desafio_android_jonathan_feitosa.repository.ComicsRepository
import kotlinx.coroutines.launch

class HqViewModel(private val comicsRepository: ComicsRepository) : BaseViewModel() {

    val comicsLiveData = MutableLiveData< Pair< List<ComicsId>?, Int> >()

    fun getComicId(comidId:Int){

        launch{

            loading.value = true

            try {
                hasErrorLiveData.value = false
                comicsLiveData.value = comicsRepository.getComicsId(comidId)
            }catch (t:Throwable){
                t.printStackTrace()
                hasErrorLiveData.value = true
                i("ResultadoJFS", "[Error] getComicId: ${t.message}")
            }finally {
                loading.value = false
            }
        }
    }
}