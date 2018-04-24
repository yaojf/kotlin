package com.yaojiafeng.kotlin.jpa

import javax.persistence.*

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 下午2:20
 * Description:
 */
@Entity
@Table(name = "user")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1,
        @Column(nullable = false)
        var username: String = "",

        var password: String = ""
)