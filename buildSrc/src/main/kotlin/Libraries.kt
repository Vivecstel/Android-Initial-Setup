object Libraries {

    /* https://developer.android.com/jetpack/androidx/releases/fragment */
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"

    /* https://developer.android.com/jetpack/androidx/releases/lifecycle */
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val viewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"

    /* https://developer.android.com/jetpack/androidx/releases/room */
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomKotlin = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    /* https://github.com/material-components/material-components-android */
    const val material = "com.google.android.material:material:${Versions.material}"

    /* https://developer.android.com/jetpack/androidx/releases/constraintlayout */
    const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"

    /* https://developer.android.com/jetpack/androidx/releases/recyclerview */
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"

    /* https://developer.android.com/jetpack/androidx/releases/startup */
    const val startUp = "androidx.startup:startup-runtime:${Versions.startUp}"

    /* https://developer.android.com/training/dependency-injection/hilt-android */
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"

    /* https://github.com/square/okhttp */
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"

    /* https://github.com/square/retrofit */
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    /* https://github.com/skydoves/Sandwich */
    const val sandwich = "com.github.skydoves:sandwich:${Versions.sandwich}"

    /* https://github.com/square/moshi/ */
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    /* https://github.com/Kotlin/kotlinx.coroutines */
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    /* https://github.com/coil-kt/coil/ */
    const val coil = "io.coil-kt:coil:${Versions.coil}"

    /* https://github.com/skydoves/WhatIf */
    const val whatIf = "com.github.skydoves:whatif:${Versions.whatIf}"

    /* https://github.com/JakeWharton/timber */
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    /* https://firebase.google.com/docs/android/learn-more */
    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebase}"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"
    const val firebasePerformance = "com.google.firebase:firebase-perf-ktx"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"
}
