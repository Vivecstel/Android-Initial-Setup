plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.hilt)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.parcelize)
    id(BuildPlugins.googleServices)
    id(BuildPlugins.crashlytics)
}

android {
    compileSdkVersion(AndroidConfiguration.compileSdk)
    buildToolsVersion = "30.0.2"

    defaultConfig {
        applicationId("com.steleot.androidinitialsetup")
        minSdkVersion(AndroidConfiguration.minSdk)
        targetSdkVersion(AndroidConfiguration.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        javaCompileOptions {
            annotationProcessorOptions {
                arguments["room.schemaLocation"] = "$projectDir/schemas"
            }
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    lintOptions {
        isAbortOnError = false
    }
}

dependencies {

    implementation(Libraries.fragment)
    debugImplementation(TestLibraries.fragmentTesting)

    implementation(Libraries.liveData)
    implementation(Libraries.viewModel)
    implementation(Libraries.viewModelSavedState)
    testImplementation(TestLibraries.coreTesting)

    implementation(Libraries.room)
    implementation(Libraries.roomKotlin)
    kapt(Libraries.roomCompiler)
    testImplementation(TestLibraries.roomTesting)

    implementation(Libraries.material)
    implementation(Libraries.constraint)
    implementation(Libraries.recyclerView)

    implementation(Libraries.startUp)

    implementation(Libraries.hilt)
    kapt(Libraries.hiltCompiler)

    implementation(Libraries.okhttp)
    implementation(Libraries.okhttpLogging)
    implementation(Libraries.retrofit)
    implementation(Libraries.retrofitMoshi)
    implementation(Libraries.sandwich)
    testImplementation(TestLibraries.okhttpMock)

    implementation(Libraries.moshi)
    kapt(Libraries.moshiCodeGen)

    implementation(Libraries.coroutines)
    testImplementation(TestLibraries.coroutinesTest)

    implementation(Libraries.coil)

    implementation(Libraries.whatIf)

    implementation(Libraries.timber)

    implementation(platform(Libraries.firebaseBom))
    implementation(Libraries.firebaseAnalytics)
    implementation(Libraries.firebaseCrashlytics)
    implementation(Libraries.firebasePerformance)
    implementation(Libraries.firebaseMessaging)

    androidTestImplementation(TestLibraries.testCore)
    androidTestImplementation(TestLibraries.androidJunit)
    androidTestImplementation(TestLibraries.androidTruth)

    androidTestImplementation(TestLibraries.truth)

    testImplementation(TestLibraries.mockitoKotlin)

    testImplementation(TestLibraries.turbine)

    testImplementation(TestLibraries.roboelectic)
}
