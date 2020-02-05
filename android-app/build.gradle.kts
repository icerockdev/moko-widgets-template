plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.icerock.mobile.multiplatform-units")
}

android {
    compileSdkVersion(Versions.Android.compileSdk)

    dexOptions {
        javaMaxHeapSize = "2g"
    }

    defaultConfig {
        minSdkVersion(Versions.Android.minSdk)
        targetSdkVersion(Versions.Android.targetSdk)

        applicationId = "org.example.app" // REPLACE:org.example.app:APP_ID

        versionCode = 1
        versionName = "0.1.0"

        vectorDrawables.useSupportLibrary = true

        val url = "https://newsapi.org/v2/"
        buildConfigField("String", "BASE_URL", "\"$url\"")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName("debug") {
            isDebuggable = true
            applicationIdSuffix = ".debug"
        }
    }

    packagingOptions {
        exclude("META-INF/*.kotlin_module")
    }
}

dependencies {
    implementation(Deps.Libs.Android.kotlinStdLib.name)

    implementation(Deps.Libs.Android.appCompat.name)
    implementation(Deps.Libs.Android.material.name)
    implementation(Deps.Libs.Android.recyclerView.name)

    implementation(Deps.Libs.MultiPlatform.napier.android!!)

    implementation(project(":mpp-library"))
}

multiplatformUnits {
    classesPackage = "org.example.app" // REPLACE:org.example.app:APP_ID
    dataBindingPackage = "org.example.app" // REPLACE:org.example.app:APP_ID
    layoutsSourceSet = "main"
}
