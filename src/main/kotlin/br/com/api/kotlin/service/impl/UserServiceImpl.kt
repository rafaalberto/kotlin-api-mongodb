package br.com.api.kotlin.service.impl

import br.com.api.kotlin.entity.User
import br.com.api.kotlin.exception.BusinessException
import br.com.api.kotlin.repository.UserRepository
import br.com.api.kotlin.service.UserService
import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    override fun findAll(): MutableList<User> = userRepository.findAll()

    override fun findById(id: String): User = userRepository.findById(id).orElseThrow {
        BusinessException("User not found", BAD_REQUEST)
    }

    override fun save(entity: User, id: Any?): User {
        val entityToSave = entity.copy(id = id as String?)
        return userRepository.save(entityToSave)
    }

    override fun delete(id: String) = userRepository.deleteById(id)
}
