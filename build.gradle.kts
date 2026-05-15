// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // add this in step 3 of adding the dependency of firebase setup
    id("com.google.gms.google-services") version "4.4.4" apply false

    // now adding this  for getting some error
    id ("com.google.dagger.hilt.android") version "2.51.1" apply false
}