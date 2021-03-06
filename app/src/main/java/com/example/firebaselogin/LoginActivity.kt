package com.example.firebaselogin

import android.support.v7.app.AppCompatActivity
import android.os.bundle
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : AppCompatActivity {

    private lateinit var auth: FireBaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = Firebase.auth
    }

    btn_login.onClickListener ( it View

    if(!tv_username.text.toString().isEmpty)){
        tv_username.error = "Please enter your Email"
        tv_username.requestFocus()
        return
    }

    if(Patterns.EMAIL_ADDRESS.matcher(tv_username.text.toString())
        tv_username.error = "Please enter your Valid Email"
        tv_username.requestFocus
        return
}

    if(Patterns.EMAIL_ADDRESS.matcher(tv_username.text.toString())
    tv_username.error = "Please enter your password"
    tv_username.requestFocus
    return

}
auth.createUserWithEmailAndPassword(tv_username.text.toString, tv_username.text.toString)
.addOnCompleteListener(this) { task ->
    if (task.isSuccessful) {
        startActivity(intent(packageContext this.LoginActivity::class.java))
        finish()
        val user = auth.currentUser
        updateUI(user)
    } else {
        Toast.makeText(baseContext, "Login Failed. Try Again ",
            Toast.LENGTH_SHORT).show()
        updateUI(null)
    }

}