package com.wear.module.util

import java.util.Calendar
import java.util.Date

class DataSystem(

) {
    fun getWeekDate() : Pair<Date, Date> {
        val calendar = Calendar.getInstance()
        calendar.time = Date()

        // 일요일
        calendar.add(Calendar.DAY_OF_MONTH, (1-calendar.get(Calendar.DAY_OF_WEEK)))
        val mondayDate = calendar.time

        // 토요일
        calendar.add(Calendar.DAY_OF_MONTH, (7-calendar.get(Calendar.DAY_OF_WEEK)))
        val sundayDate = calendar.time
        return Pair(mondayDate, sundayDate)
    }
}