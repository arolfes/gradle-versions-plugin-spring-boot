package com.github.arolfes.gradle.versions.gradleversionspluginspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleVersionsPluginSpringBootApplication

fun main(args: Array<String>) {
	runApplication<GradleVersionsPluginSpringBootApplication>(*args)
}
