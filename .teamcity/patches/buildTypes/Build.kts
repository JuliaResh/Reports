package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Build")) {
    params {
        expect {
            param("myparam", "credentialsJSON:4562983b-edda-483f-924d-d5a79b27c04a")
        }
        update {
            password("myparam", "credentialsJSON:8faba3e9-e3d2-47b5-bced-e4534276cf5d")
        }
    }
}