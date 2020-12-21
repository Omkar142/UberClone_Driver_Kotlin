package com.communisolve.myuberclone.Model

class DriverInfoModel {
     var firstName: String = ""
     var lastName: String = ""
     var phoneNumber = ""
     val avatar:String=""
     var rating = 0.0

     constructor()
     constructor(firstName: String, lastName: String, phoneNumber: String, rating: Double) {
          this.firstName = firstName
          this.lastName = lastName
          this.phoneNumber = phoneNumber
          this.rating = rating
     }


}