import com.objectcomputing.example.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    loginFailedAuthEventListener(com.objectcomputing.example.LoginFailedAuthEventListener)
}
