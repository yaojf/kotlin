package com.yaojiafeng.kotlin.es

import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 下午2:26
 * Description:
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTests {

    val log = LoggerFactory.getLogger(ApplicationTests::class.java)!!

    @Autowired
    lateinit var bookElasticsearchRepository: BookElasticsearchRepository

    @Test
    fun `es test"`() {
        val book = Book().apply {
            this.id = "1001"
            this.title = "Elasticsearch Basics"
            this.author = "Rambabu Posa"
        }

        bookElasticsearchRepository.save(book)

        val book1 = bookElasticsearchRepository.findOne("1001")
        log.info("id为1001的book: $book1")
    }

}