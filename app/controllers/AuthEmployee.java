package controllers.security;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;





public class AuthEmployee extends Action.Simple {


    public CompletionStage<Result> call(Http.Context ctx) {

  
        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.getById(id);
            if ("employee".equals(u.getRole())) {

                return delegate.call(ctx);
            }
        }
    
        ctx.flash().put("error", "Login Required.");
        return CompletableFuture.completedFuture(redirect(controllers.routes.LoginController.login()));
    }
}