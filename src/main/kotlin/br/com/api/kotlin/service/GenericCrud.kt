package br.com.api.kotlin.service

interface GenericCrud <T, PK> {
    fun findAll(): MutableList<T>
    fun findById(id: PK): T
    fun save(entity: T): T
    fun delete(id: PK)
}