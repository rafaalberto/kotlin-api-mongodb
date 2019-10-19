package br.com.api.kotlin.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiExceptionHandler {

    @ExceptionHandler(BusinessException::class)
    fun handleBusinessException(exception: BusinessException) =
        ResponseEntity.badRequest().body(ErrorResponse(exception.httpStatus, exception.code))

}

class ErrorResponse(val httpStatus: HttpStatus, val message: String)

