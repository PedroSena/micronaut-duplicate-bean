/*
 * Copyright 2017 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import javax.inject.Inject
import javax.inject.Named

/**
 * @author James Kleeh
 * @since 1.0
 */
@Controller("/")
class HelloController(
    private val greetingService: GreetingService
) {

    @Inject
    @Named("string1")
    lateinit var string1: String

    @Inject
    @Named("string2")
    lateinit var string2: String

    @Get("/hello/{name}")
    fun hello(name: String) = string1 + string2
}