package com.yaojiafeng.kotlin.es

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 下午5:51
 * Description:
 */
@Document(indexName = "books", type = "books")
class Book {

    @Id
    lateinit var id: String
    lateinit var title: String
    lateinit var author: String

    override fun toString(): String {
        return "Book(id='$id', title='$title', author='$author')"
    }


}