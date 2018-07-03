package superfaisant


class AuthenticateInterceptor {

    boolean before() { true }

    boolean after() { true }

    void afterView() {
        // no-op
    }

    def filters = {
       loginCheck(controller: '*', action: '*') {
           before = {
              if (!session.user && !actionName.equals('login')) {
                  redirect(controller: "Event", action: "login")
                  return false
               }
           }
       }
   }
}
