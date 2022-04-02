package com.github.zeyuanj.intellijplugintest.services

import com.intellij.openapi.project.Project
import com.github.zeyuanj.intellijplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
