package com.communisolve.myuberclone.Common

import com.communisolve.myuberclone.Model.DriverInfoModel
import java.lang.StringBuilder

object Common {
    fun buildWelcomeMessage(): String {
return StringBuilder("Welcome, ")
    .append(currentUser!!.firstName)
    .append(" ")
    .append(currentUser!!.lastName)
    .toString()

    }

    val DRIVERS_LOCATION_REFERENCE: String="DriversLocation"
    var currentUser: DriverInfoModel?=null
     val DRIVER_INFO_REFERENCE: String="DriverInfo"
 }