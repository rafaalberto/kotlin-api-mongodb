package br.com.api.kotlin.resource

import br.com.api.kotlin.entity.User
import br.com.api.kotlin.service.CrudService
import br.com.api.kotlin.service.UserService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["http://localhost:3000"])
@RestController
@RequestMapping("/users")
class UserResource (private val userService: UserService) : CrudResource <User, String>() {

    override fun getService(): CrudService<User, String> = userService
}