package com.developerdaya.soap_api_methods.util

object SoapRequest {
    fun getEnvelope(): String {
        return """
            <?xml version="1.0" encoding="utf-8"?>
            <soap12:Envelope xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
              <soap12:Body>
                <ListOfCountryNamesByName xmlns="http://www.oorsprong.org/websamples.countryinfo">
                </ListOfCountryNamesByName>
              </soap12:Body>
            </soap12:Envelope>
        """.trimIndent()
    }
}
