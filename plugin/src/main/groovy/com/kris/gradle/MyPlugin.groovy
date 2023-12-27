package com.kris.gradle

import org.apache.commons.lang3.StringUtils
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {

    @Override
    void apply(final Project project) {
//        println "Applying MyPlugin... "
        project.tasks.register('myplugin') {
            doLast{
                println "========== Result: " + StringUtils.capitalize("my-plugin")
            }
        }
    }
}