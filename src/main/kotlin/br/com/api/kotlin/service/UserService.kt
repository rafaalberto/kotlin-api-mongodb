package br.com.api.kotlin.service

import br.com.api.kotlin.entity.User
import br.com.api.kotlin.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun findAll(): MutableList<User> = userRepository.findAll()
    fun findById(id: String): User = userRepository.findById(id).get()
    fun save(user: User) = userRepository.save(user)
    fun delete(id: String) = userRepository.deleteById(id)
}