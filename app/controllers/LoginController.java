package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.*;
import models.users.*;

public class LoginController extends Controller{


   private FormFactory formFactory;

    private Environment env;

        @Inject  
        public LoginController(Environment e,FormFactory f){
        this.env = e;
        this.formFactory = f;
    }


    public Result login() {

        Form<Login> loginForm = formFactory.form(Login.class);
        
        return ok(login.render(loginForm,User.getById(session().get("Id"))));
    }

    public Result loginSubmit() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();


        if (loginForm.hasErrors()){
            return badRequest(login.render(loginForm,User.getById(session().get("Id"))));
        } else{
            session().clear();
            session("email",loginForm.get().getEmail());


            User u = User.getById(loginForm.get().getEmail());

           
            if (u != null && "admin".equals(u.getRole())) {
                return redirect(controllers.routes.HomeController.ListEmployee(0));
            }
            


            else if (u != null && "employee".equals(u.getRole())) {
                return redirect(controllers.routes.HomeController.EmployeeIndex());
            }
            
        
            

        }

        return redirect(controllers.routes.HomeController.index());
    }

    public Result logout(){
        session().clear();
        flash("success","You've been logged out");
        return redirect(routes.LoginController.login());
    }


}