package br.com.api.kotlin.resource

import br.com.api.kotlin.service.CrudService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

abstract class CrudResource <T, PK> {

    @GetMapping
    fun findAll() = ResponseEntity.ok(getService().findAll())

    @GetMapping("/{id}")
    fun findById(@PathVariable id: PK) = ResponseEntity.ok(getService().findById(id))

    @PostMapping
    fun create(@RequestBody entity: T) = ResponseEntity(getService().save(entity, null), HttpStatus.CREATED)

    @PutMapping("/{id}")
    fun update(@RequestBody entity: T, @PathVariable id: PK) = ResponseEntity.ok(getService().save(entity, id))

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: PK) = getService().delete(id)

    abstract fun getService() : CrudService <T, PK>
}

