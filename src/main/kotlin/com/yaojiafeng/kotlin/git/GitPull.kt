package com.yaojiafeng.kotlin.git

import org.eclipse.jgit.api.Git
import org.eclipse.jgit.internal.storage.file.FileRepository
import org.eclipse.jgit.lib.Constants
import org.eclipse.jgit.lib.ObjectId
import org.eclipse.jgit.lib.Ref
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider
import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: yaojiafeng
 * Date: 2018/4/13
 * Time: 下午2:14
 * To change this template use File | Settings | File Templates.
 * Description:
 */

fun main(args: Array<String>) {
//    val file = File.createTempFile("abcd", "", File("/Users/sierra/IdeaProjects/kotlin")).apply {
//        delete()
//        mkdir()
//    }
//    val command = Git.cloneRepository().setDirectory(file).setURI("https://github.com/yaojf/oauth2.0.git").setBranch("master")
//    val cp = UsernamePasswordCredentialsProvider("771954794@qq.com", "ailk@1991")
//
//
//    val git = command.setCredentialsProvider(cp).call()

    val git = Git.open(File("/Users/sierra/IdeaProjects/kotlin/abcd6097865769714730966"))

    val call = git.log().call()

}