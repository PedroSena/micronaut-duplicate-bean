package example

import io.micronaut.context.annotation.Factory
import javax.inject.Named
import javax.inject.Singleton

@Factory
class StringFactory {

    @Singleton
    @Named("string1")
    fun buildString1(): String = "string1"

    @Singleton
    @Named("string2")
    fun buildString2(): String = "string2"

}