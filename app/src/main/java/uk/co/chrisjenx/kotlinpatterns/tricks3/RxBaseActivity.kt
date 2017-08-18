package uk.co.chrisjenx.kotlinpatterns.tricks3


import android.support.v7.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable




abstract class RxBaseActivity : AppCompatActivity() {



    protected val disposables = CompositeDisposable()



    override fun onDestroy() {
        disposables.clear()
        super.onDestroy()
    }




    fun Disposable.attach() {
        disposables.add(this)
    }



}

