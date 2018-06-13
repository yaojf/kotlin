package com.yaojiafeng.kotlin.maven

import org.apache.maven.shared.invoker.DefaultInvocationRequest
import org.apache.maven.shared.invoker.DefaultInvoker
import org.apache.maven.shared.invoker.InvocationOutputHandler
import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: yaojiafeng
 * Date: 2018/4/13
 * Time: 下午2:25
 * To change this template use File | Settings | File Templates.
 * Description:
 */

private class MavenOutputHandler : InvocationOutputHandler {
    override fun consumeLine(str: String) {
        println(str)
    }
}

fun main(args: Array<String>) {
    val request = DefaultInvocationRequest()
    request.baseDirectory = File("/Users/sierra/IdeaProjects/kotlin/abcd3179463213420977935")
    request.userSettingsFile = File("/Users/yaojiafeng/.m2/settings.xml")
    request.goals = listOf("clean", "package")
    request.mavenOpts = "-Djar.finalName=app -Dfile.encoding=UTF8"

    val loggerHandler = MavenOutputHandler()
    request.setOutputHandler(loggerHandler)

    val invoker = DefaultInvoker()
    invoker.mavenHome = File("/Users/sierra/Documents/apache-maven-3.5.3")

    val result = invoker.execute(request)

    println(result)
}