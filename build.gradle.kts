plugins {
    id("com.android.application")
}

android {
    namespace = "com.focusflow.dailyroutines"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.focusflow.dailyroutines"
        minSdk = 24
        //noinspection EditedTargetSdkVersion
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.18.0")
    implementation("androidx.activity:activity:1.13.0")
}
