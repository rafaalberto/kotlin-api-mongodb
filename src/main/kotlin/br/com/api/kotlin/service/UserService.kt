package br.com.api.kotlin.service

import br.com.api.kotlin.entity.User
import br.com.api.kotlin.exception.BusinessException
import br.com.api.kotlin.repository.UserRepository
import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) : GenericCrud<User, String> {

    override fun findAll(): MutableList<User> = userRepository.findAll()

    override fun findById(id: String): User = userRepository.findById(id).orElseThrow {
        BusinessException("User not found", BAD_REQUEST)
    }

    override fun save(entity: User): User = userRepository.save(entity)

    override fun delete(id: String) = userRepository.deleteById(id)
}
