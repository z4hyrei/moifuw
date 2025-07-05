package me.z4hy.dev.moifuw

class NoteEvent(
    val tickPoint: TickPoint,
    val note: Note,
)

sealed interface Note

class TapNote(
    val position: ButtonPosition,
    val modifier: Modifier,
) : Note {
    class Modifier(
        val isBreak: Boolean = false,
        val isEx: Boolean = false,
    )
}

class HoldNote(
    val position: ButtonPosition,
    val modifier: Modifier,
    val duration: TickDelta,
) : Note {
    class Modifier(
        val isBreak: Boolean = false,
        val isEx: Boolean = false,
    )
}
