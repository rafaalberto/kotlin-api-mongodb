package br.com.api.kotlin.service

interface CrudService <T, PK> {
    fun findAll(): MutableList<T>
    fun findById(id: PK): T
    fun save(entity: T, id: Any?): T
    fun delete(id: PK)
}