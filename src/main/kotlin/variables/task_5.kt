package variables

import kotlin.concurrent.timer

fun main() {
    val TOTAL_SECONDS_IN_SPACE = 6480

    val SECONDS_IN_MINUTE = 60
    val SECONDS_IN_HOUR = 3600

    val hours = TOTAL_SECONDS_IN_SPACE / SECONDS_IN_HOUR
    val minutes = (TOTAL_SECONDS_IN_SPACE % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds = TOTAL_SECONDS_IN_SPACE % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}