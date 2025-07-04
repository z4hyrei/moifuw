package me.z4hy.dev

sealed interface Position

enum class ButtonPosition : Position {
    RING_A1,
    RING_A2,
    RING_A3,
    RING_A4,
    RING_A5,
    RING_A6,
    RING_A7,
    RING_A8,
}

enum class ScreenPosition : Position {
    AREA_A,
    ZONE_A1,
    ZONE_A2,
    ZONE_A3,
    ZONE_A4,
    ZONE_A5,
    ZONE_A6,
    ZONE_A7,
    ZONE_A8,

    AREA_B,
    ZONE_B1,
    ZONE_B2,
    ZONE_B3,
    ZONE_B4,
    ZONE_B5,
    ZONE_B6,
    ZONE_B7,
    ZONE_B8,

    AREA_C,
    ZONE_C1,
    ZONE_C2,

    AREA_D,
    ZONE_D1,
    ZONE_D2,
    ZONE_D3,
    ZONE_D4,
    ZONE_D5,
    ZONE_D6,
    ZONE_D7,
    ZONE_D8,

    AREA_E,
    ZONE_E1,
    ZONE_E2,
    ZONE_E3,
    ZONE_E4,
    ZONE_E5,
    ZONE_E6,
    ZONE_E7,
    ZONE_E8,
}
