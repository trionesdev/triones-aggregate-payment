package com.trionesdev.payment.aggregate

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class PaymentComponent(val channel: String)