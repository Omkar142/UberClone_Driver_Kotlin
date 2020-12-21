package com.communisolve.myuberclone.Utils

import android.view.View
import com.communisolve.myuberclone.Common.Common
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

object UserUtils {
    fun updateUser(
        view: View?,
        updateData:Map<String,Any>
    ){
        FirebaseDatabase.getInstance()
            .getReference(Common.DRIVER_INFO_REFERENCE)
            .child(FirebaseAuth.getInstance().currentUser!!.uid)
            .updateChildren(updateData)
            .addOnFailureListener { exception ->
                Snackbar.make(view!!,exception.message!!,Snackbar.LENGTH_SHORT).show()
            }
            .addOnSuccessListener {
                Snackbar.make(view!!,"Update information Success",Snackbar.LENGTH_SHORT).show()

            }
    }
}