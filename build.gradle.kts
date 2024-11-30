import org.jetbrains.dokka.gradle.DokkaTask


// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // Added to support generation of docs
    id("org.jetbrains.dokka") version "1.9.20" apply true
}



