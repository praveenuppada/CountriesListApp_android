plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.countriesapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.countriesapp"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

val lifecycleExtensionVersion = "1.1.1"
val butterknifeVersion = "10.1.0"
val supportVersion = "29.0.0"
val retrofitVersion = "2.3.0"
val glideVersion = "2.1.1"
val rxJavaVersion = "2.1.1"
val daggerVersion = "2.14.1"
val mockitoVersion = "2.11.0"

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation("com.android.support:design:$supportVersion")

    implementation("androdi.arch.lifecycle.extension:$lifecycleExtensionVersion")

    implementation("com.jakewharton:butterknife:$butterknifeVersion")
    annotationProcessor("com.jakewharton:butterknife-compiler:$butterknifeVersion")

    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation("com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion")

    implementation("io.reactivex.rxjava2:rxjava:$rxJavaVersion")
    implementation("io.reactivex.rxjava2:rxandroid:$rxJavaVersion")

    implementation("com.github.bumptech.glide:glide:$glideVersion")

    implementation("com.google.dagger:dagger:$daggerVersion")
    implementation("com.google.dagger:dagger-android-support:$daggerVersion")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    annotationProcessor("com.google.dagger:dagger-compiler:$daggerVersion")
    annotationProcessor("com.google.dagger:dagger-android-processor:$daggerVersion")
    
    testImplementation("org.mockito:mockito-inline:$mockitoVersion")
    testImplementation("android.arch.core:core-testing:1.1.1")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}