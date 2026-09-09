plugins {
    id("com.android.library")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.music.echo.playback"
    compileSdk = 36
    defaultConfig { minSdk = 26 }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}
kotlin { jvmToolchain(21) }
dependencies {
    coreLibraryDesugaring(libs.desugaring)
    implementation(project(":core"))
    implementation(libs.cast.framework)
    api(libs.media3)
    api(libs.media3.session)
    api(libs.media3.hls)
    
    implementation(libs.hilt)
    ksp(libs.hilt.compiler)
}
