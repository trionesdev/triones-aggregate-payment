package com.trionesdev.payment.aggregate.shared.enums

enum class Currency {
    CNY, USD, EUR;

    companion object {
        fun fromString(value: String): Currency? {
            return entries.firstOrNull { it.name.equals(value, true) }
        }

        fun fromString(value: String?, defaultEnum: Currency): Currency {

            return entries.firstOrNull { it.name.equals(value, true) } ?: defaultEnum
        }
    }
}