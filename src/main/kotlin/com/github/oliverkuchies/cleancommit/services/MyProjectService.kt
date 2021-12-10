package com.github.oliverkuchies.cleancommit.services

import com.intellij.openapi.project.Project
import com.github.oliverkuchies.cleancommit.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
