object TestLibraries {

    /* https://developer.android.com/jetpack/androidx/releases/fragment */
    const val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.fragment}"

    /* https://developer.android.com/jetpack/androidx/releases/lifecycle */
    const val coreTesting = "androidx.arch.core:core-testing:${Versions.arch}"

    /* https://developer.android.com/jetpack/androidx/releases/room */
    const val roomTesting = "androidx.room:room-testing:${Versions.room}"

    /* https://github.com/square/okhttp */
    const val okhttpMock = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"

    /* https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/ */
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"

    /* https://developer.android.com/training/testing/set-up-project */
    const val testCore = "androidx.test:core:${Versions.testCore}"
    const val androidJunit = "androidx.test.ext:junit:${Versions.androidJunit}"
    const val androidTruth = "androidx.test.ext:truth:${Versions.androidTruth}"

    /* https://github.com/google/truth */
    const val truth = "com.google.truth:truth:${Versions.truth}"

    /* https://github.com/nhaarman/mockito-kotlin */
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"

    /* https://github.com/cashapp/turbine */
    const val turbine = "app.cash.turbine:turbine:${Versions.turbine}"

    /* https://github.com/robolectric/robolectric */
    const val roboelectic = "org.robolectric:robolectric:${Versions.roboelectic}"
}
