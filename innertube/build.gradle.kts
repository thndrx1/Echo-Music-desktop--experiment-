plugins {
    kotlin("jvm")
    id("java-library")
    alias(libs.plugins.kotlin.serialization)
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    api(libs.ktor.client.core)
    api(libs.ktor.client.content.negotiation)
    api(libs.ktor.serialization.json)
    api(libs.ktor.client.encoding)
    api(libs.ktor.client.okhttp)
    api("com.squareup.okhttp3:okhttp:4.12.0")
    api(libs.brotli)
    
    // Using string notation to avoid "Minimal dependencies are immutable"
    implementation("com.github.TeamNewPipe:NewPipeExtractor:${libs.versions.newpipeextractor.get()}") {
        exclude(group = "com.google.protobuf", module = "protobuf-java")
    }
    implementation("com.github.maxrave-dev:PipePipeExtractor:${libs.versions.pipepipe.get()}") {
        exclude(group = "com.google.protobuf", module = "protobuf-java")
    }
    implementation("com.github.TeamNewPipe:nanojson:c7a6c1c08d16b6d5ecded34758e6415e07be2166")
    
    testImplementation(libs.junit)
}
