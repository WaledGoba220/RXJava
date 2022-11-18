package com.example.myrxjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myrxjava.databinding.ActivityMainBinding
import io.reactivex.rxjava3.disposables.Disposable


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mDisposable:Disposable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        foo()
    }






    private fun foo(){
//
//
//        val observable = Observable.interval(1,TimeUnit.SECONDS).take(10)
//        val subject = PublishSubject.create<Long>()
//        observable.subscribe(subject)
//        Thread.sleep(2500)
//        subject.subscribe(
//            {
//                Log.d(TAG, "Next $it ")
//            },{
//                Log.d(TAG, "Error ${it?.message}")
//            }
//        )
//
//
//





//        val observable = Observable.interval(1,TimeUnit.SECONDS).take(10)
//        observable.subscribe(
//            {
//        t ->
//            Log.d(TAG, "First observa;l $t")
//        },
//            {
//                a->
//                Log.d(TAG, "Error")
//            }
//
//        )
//
//        Thread.sleep(3500)
//
//        observable.subscribe(
//            {
//                    t ->
//                Log.d(TAG, "Second observa;l $t")
//            },
//            {
//                    a->
//                Log.d(TAG, "Error")
//            }
//
//        )






//        val observable = Flowable.range(1,108)
//        observable.onBackpressureBuffer().observeOn(Schedulers.io(),false,5).subscribe(
//            {
//                t ->
//                Log.d(TAG, "next: $t")
//            },
//            {
//                error ->
//                Log.d(TAG, "Error")
//            },
//            {
//                Log.d(TAG, "Completable")
//            }
//        )






//
//        val maybe = Maybe.create<String>{emitter ->
//            binding.editTxt.doOnTextChanged { text, start, before, count ->
//                when(text.toString()) {
//                    "hello" -> emitter.onSuccess("Hi, Welcome")
//                    "no" -> emitter.onComplete()
//                }
//            }
//
//        }
//
//        maybe.subscribe(object :MaybeObserver<String>{
//            override fun onSubscribe(d: Disposable) {
//                Log.d(TAG, "onSubscribe: ")
//            }
//
//            override fun onSuccess(t: String) {
//                Log.d(TAG, "onSuccess: $t")
//            }
//
//            override fun onError(e: Throwable) {
//                Log.d(TAG, "onError")
//            }
//
//            override fun onComplete() {
//                Log.d(TAG, "onComplete")
//            }
//
//        })







//        val completable = Completable.create{ emitter ->
//            binding.editTxt.doOnTextChanged { text, start, before, count ->
//
//                if(text.toString() == "000"){
//                    emitter.onComplete()
//                }
//            }
//
//        }
//        completable.subscribe(object :CompletableObserver{
//            override fun onSubscribe(d: Disposable) {
//                Log.d(TAG, "onSubscribe: ")
//            }
//
//            override fun onComplete() {
//                Log.d(TAG, "onComplete ")
//            }
//
//            override fun onError(e: Throwable) {
//                Log.d(TAG, "onError: ")
//            }
//
//        })






//
//
//        val single  =Single.just(5)
//        single.subscribe(object : SingleObserver<Int>{
//            override fun onSubscribe(d: Disposable) {
//                Log.d(TAG, "onSubscribe: ")
//            }
//
//            override fun onSuccess(t: Int) {
//                Log.d(TAG, "onSuccess: $t")
//            }
//
//            override fun onError(e: Throwable) {
//                Log.d(TAG, "onError: }")
//            }
//
//        })
//






        val list = listOf(1,2,3,4,5,6,7,8,2,5,9,10,11,12)
//        val observable = Observable.fromArray(list)
//        val observable = Observable.fromIterable(list)
//        val observable = Observable.range(1,20)
//        val observable = Observable.interval(5,TimeUnit.SECONDS)
//        val observable = Observable.range(1, 20).take(5)
//        val observable = Observable.timer(10,TimeUnit.SECONDS)
//        val observable = Observable.fromIterable(list).distinct()
//        val observable = Observable.fromIterable(list).buffer(3)
//        val observable = Observable.range(2,20).map { it * 2 }

//
//        val observable = Observable.interval(500,TimeUnit.MILLISECONDS).take(10).map { it * 10 }
//        val sum = Observable.interval(1,TimeUnit.SECONDS).take(10).map { it * 2 }.concatWith(observable)


//        val observable = Observable.interval(500,TimeUnit.MILLISECONDS).take(10).map { it * 10 }
//        val sum = Observable.interval(1,TimeUnit.SECONDS).take(10).map { it * 2 }.mergeWith(observable)
//
//        observable.subscribe{t ->
//            Log.d(TAG, "foo: $t")
//        }

//
//
//        val observable = Observable.range(1,1000)
//        mDisposable = observable.subscribeOn(Schedulers.computation()).subscribe{ t ->
//            Log.d(TAG, "foo: $t - ${ Thread.currentThread().name }")
//        }




//        val happy = Observable.just(5, 10, 20, 40, 50 ,90 ,100)
//        val observer = object :Observer<Int>{
//            override fun onSubscribe(d: Disposable) {
//                Log.d(TAG, "onSubscribe: ")
//            }
//
//            override fun onNext(t: Int) {
//                Log.d(TAG, "onNext: $t")
//            }
//
//            override fun onError(e: Throwable) {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onComplete() {
//                Log.d(TAG, "onComplete: ")
//            }
//
//        }
//
//        happy.subscribe(observer)

    }



    override fun onDestroy() {
        mDisposable.dispose()
        super.onDestroy()
    }



//    private fun foo(){
//        var foo = 5
//        foo = 10
//        foo = 16
//        foo = 20
//        foo = 50
//        foo = 60
//        foo = 90
//        foo = 100
//
//        Log.d(TAG, "foo: ${foo}")
//    }


    companion object{
        private const val TAG= "Waled"
    }

}