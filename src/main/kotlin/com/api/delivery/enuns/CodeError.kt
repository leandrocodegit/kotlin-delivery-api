package com.api.delivery.enuns

enum class CodeError (var value: String) {
    NOT_FOUND("001"),
    DUPLICATE("002"),
    ACTIVE("003"),
    INACTIVE("004"),
    ADDRESS_NOT_FOUND("005"),
    ENDERECO_BLANK("006"),
    FORMAT_INVALID("007"),
    PARAM_INVALID("008"),
    REST_ERROR("009"),
    STOCK_ERROR("010"),
   AGE_ACCEPT("011"),
    ACTIVE_RESPONSE("012")

}