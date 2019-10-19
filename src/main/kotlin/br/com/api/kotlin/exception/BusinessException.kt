package br.com.api.kotlin.exception

import org.springframework.http.HttpStatus

class BusinessException(val code: String, val httpStatus: HttpStatus) : RuntimeException()