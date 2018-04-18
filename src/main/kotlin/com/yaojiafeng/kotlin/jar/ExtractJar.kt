package com.yaojiafeng.kotlin.jar

import java.io.File
import java.util.jar.JarFile

/**
 * Created with IntelliJ IDEA.
 * User: yaojiafeng
 * Date: 2018/4/13
 * Time: 下午3:06
 * To change this template use File | Settings | File Templates.
 * Description:
 */
fun main(args: Array<String>) {
    val rootJarFile = JarFile(File("/Users/sierra/IdeaProjects/kotlin/abcd3179463213420977935/server/target/app.jar"))

    val toList = rootJarFile.entries().toList()

}