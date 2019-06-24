package br.com.api.kotlin.resource

import br.com.api.kotlin.entity.User
import br.com.api.kotlin.service.UserService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.NO_CONTENT
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class UserResource (private val userService: UserService) {

    @GetMapping("/users")
    fun findAll() = ResponseEntity.ok(userService.findAll())

    @GetMapping("/users/{id}")
    fun findById(@PathVariable id: String): ResponseEntity<User> = ResponseEntity.ok(userService.findById(id))

    @PostMapping("/users")
    fun create(@RequestBody user: User): ResponseEntity<User> =
            ResponseEntity(userService.save(user), CREATED)

    @PutMapping("/users/{id}")
    fun update(@RequestBody user: User, @PathVariable id: String): ResponseEntity<User> {
        user.id = id
        return ResponseEntity.ok(userService.save(user))
    }

    @DeleteMapping("/users/{id}")
    @ResponseStatus(NO_CONTENT)
    fun delete(@PathVariable id: String) = userService.delete(id)
}