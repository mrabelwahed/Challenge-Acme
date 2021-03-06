buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.41")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.3.41")
    }
}


allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri( "https://kotlin.bintray.com/kotlinx" )}
    }
}