package com.wear.module.util

import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import org.apache.commons.codec.binary.Hex

class SHA {
    /**
     * [SHA]
     * - SHA 암호화(글로벌)
     * */
    fun securityPassword(
        data: String,
        key: String,
        type: Int,
    ): String {
        val sha256Hmac = Mac.getInstance("HmacSHA$type")
        val secretKey = SecretKeySpec(key.toByteArray(), "HmacSHA$type")
        sha256Hmac.init(secretKey)
        return Hex.encodeHexString(sha256Hmac.doFinal(data.toByteArray()))
    }
}