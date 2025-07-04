plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

group = "me.z4hy.dev"
version = "0.0.0"

kotlin {
    jvm()
    jvmToolchain(21)
}
