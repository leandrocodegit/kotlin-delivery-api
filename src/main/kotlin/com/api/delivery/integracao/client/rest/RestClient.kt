package com.api.delivery.integracao.client.rest

import com.api.delivery.integracao.client.reponse.ClientResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "restClient",
    url = "http://localhost:9092/api/v1/users/"
)
interface RestClient {

    @GetMapping("{id}")
    fun getClient(@PathVariable id: Long): ClientResponse
}