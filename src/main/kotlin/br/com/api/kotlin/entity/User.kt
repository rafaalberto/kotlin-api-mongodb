package br.com.api.kotlin.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
        @Id var id: String? = null,
        val username: String,
        val password: String,
        val name: String)