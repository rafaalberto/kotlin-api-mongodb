package br.com.api.kotlin.repository

import br.com.api.kotlin.entity.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String>