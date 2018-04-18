package com.yaojiafeng.kotlin.git

import org.eclipse.jgit.api.Git
import org.eclipse.jgit.internal.storage.file.FileRepository
import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: yaojiafeng
 * Date: 2018/4/18
 * Time: 下午5:56
 * To change this template use File | Settings | File Templates.
 * Description:
 */

fun main(args: Array<String>) {
    val file = File("/Users/sierra/IdeaProjects/kotlin/abcd6097865769714730966")

    var repo = FileRepository(file)

    var git = Git(repo)

    for (revCommit in git.log().call()) {
        println(revCommit.id)
        println(revCommit.authorIdent.name)
        println(revCommit.commitTime)
    }


}