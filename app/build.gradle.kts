import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    // Added to support generation of docs
    id("org.jetbrains.dokka")
}

android {
    namespace = "com.alreylz.android101"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.alreylz.android101"
        minSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    dokkaPlugin("org.jetbrains.dokka:android-documentation-plugin:1.9.20")
}



// https://kotlinlang.org/docs/dokka-html.html#configuration-options
//Configuration goes here
tasks.withType<DokkaTask>().configureEach {


    val appName = "Android 101";
    val author = "@alreylz";

    doFirst {
        println("Creating documentation for ${appName}  [@alreylz] \n---------------------------------------------------")
    }


    //This is the directory
    outputDirectory.set(file("$rootDir/documentation")) // Set to root directory or any custom location


    val dokkaBaseConfiguration = """
    {
     "projectVersion": "1.0.0",
     "navigationRoot": "My Awesome Project",
     "footerMessage": "(c) 2024 ${author}",
     "separateInheritedMembers": false,
     "mergeImplicitExpectActualDeclarations": false,
     "customAssets": ["${file("$rootDir/.docs-config/assets/logo-icon.svg")}"],
     "customStyleSheets": [
        "${file("$rootDir/.docs-config/assets/style/my-customizations.css")}",
        "${file("$rootDir/.docs-config/assets/style/my-logo-styles.css")}",
        "${file("$rootDir/.docs-config/assets/style/my-styles.css")}"
     ],
      "reportUndocumented": true,
      "title": "${appName}",
      "projectVersion": "1.0.0"
    }
    """
    //"templatesDir": "${file("$rootDir/.docs-config/templates")}",

    pluginsMapConfiguration.set(
        mapOf(
            // fully qualified plugin name to json configuration
            "org.jetbrains.dokka.base.DokkaBase" to dokkaBaseConfiguration
        )
    )


    // Configure other options if necessary
    dokkaSourceSets {
        configureEach {
            includeNonPublic.set(false)
            reportUndocumented.set(true)
        }
    }

    // Optional: Print the output directory
    doLast {
        println("Dokka HTML documentation generated in: ${outputDirectory.get()}")
    }
}