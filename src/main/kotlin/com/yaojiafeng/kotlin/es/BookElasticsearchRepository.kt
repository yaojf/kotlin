package com.yaojiafeng.kotlin.es

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository


/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 下午5:54
 * Description:
 */
interface BookElasticsearchRepository : ElasticsearchRepository<Book, String> {

    fun findByAuthor(author: String, pageable: Pageable): Page<Book>

    fun findByTitle(title: String): List<Book>

}