package me.z4hy.dev

@JvmInline
value class TickPoint internal constructor(private val rawValue: Long)

@JvmInline
value class TickDelta internal constructor(private val rawValue: Long)
