package org.example

interface EmailUser {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}
