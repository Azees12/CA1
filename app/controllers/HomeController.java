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

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import java.io.File;



/**
 * 
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

private FormFactory formFactory;
private Environment e;

@Inject
public HomeController(FormFactory f,Environment env){
    this.formFactory = f;
    this.e = env;
}


private User getCurrentUser() {
    User u = User.getById(session().get("email"));
    return u;
}


    public Result index() {
        return ok(views.html.index.render(User.getById(session().get("email"))));
    }

    public Result ListEmployee(Long dep){

        List<Employee> employeeList = Employee.findAll();
        List<Department> departmentList = Department.findAll();
        List<Project> projectList = Project.findAll();

        if(dep == 0){
            employeeList = Employee.findAll();
        }
        else{
            employeeList= Department.find.ref(dep).getEmployees();
            }
        

       return ok(views.html.ListEmployee.render(employeeList,User.getById(session().get("email")),departmentList, e, projectList));
    }


    public Result addProject(){
        Form<Project> projectForm = formFactory.form(Project.class);

        return ok(addProject.render(projectForm, User.getById(session().get("email"))));
    }

    public Result addProjectSubmit(){

        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        if(newProjectForm.hasErrors()){
            return badRequest(addProject.render(newProjectForm,User.getById(session().get("email"))));
        }else{
            Project newProject = newProjectForm.get();

            newProject.save();
        

        flash("Employee : " + newProject.getname()+" was added");



        for (Long emp : newProject.getempSelect()) {
            newProject.members.add(Employee.find.byId(emp));

        }
    newProject.update();

    }
    return redirect(controllers.routes.HomeController.ListEmployee(0));
    }



    public Result addEmployee(){
    
        Form<Employee> employeeForm = formFactory.form(Employee.class);

        return ok(addEmployee.render(employeeForm,User.getById(session().get("email"))));
    }

    public Result addEmployeeSubmit(){

        String saveImageMsg;

        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()){
            return badRequest(addEmployee.render(newEmployeeForm,User.getById(session().get("email"))));
        }
        else{

    Employee newEmployee = newEmployeeForm.get();
   

        newEmployee.save();

 
        flash("Employee : "+ newEmployee.getName()+" was added");
       

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");


        saveImageMsg = saveFile(newEmployee.getId(), image);

        }
        return redirect(controllers.routes.HomeController.ListEmployee(0));
        }
       
    

    public Result deleteProject(Long id){
        Project.find.ref(id).delete();
        flash("success","Project was removed");
        return redirect (routes.HomeController.ListEmployee(0));
    }  

    public Result deleteEmployee(Long id){
        Employee.find.ref(id).delete();
        flash("success","Employee has been removed");
        return redirect (routes.HomeController.ListEmployee(0));
    }


    public Result updateProject(Long id){
    
        Project e;
        Form<Project> projectForm;

            e = Project.find.byId(id);
           projectForm = formFactory.form(Project.class).fill(e);
          
            return ok(updateProject.render(id, projectForm, getCurrentUser()));
    
    }


    public Result updateProjectSubmit(Long id){

        Form<Project> updateProjectForm = formFactory.form(Project.class).bindFromRequest();
        
              
                if(updateProjectForm.hasErrors()) {
                  
                    return badRequest(updateProject.render(id, updateProjectForm,getCurrentUser()));
                }
                
           
                Project p = updateProjectForm.get();
                p.setId(id);
                
                List<Employee> newEmp = new ArrayList<Employee>();
                for (Long emp : p.getempSelect()) {
                    newEmp.add(Employee.find.byId(emp));
                }
                
                p.setMember(newEmp);
                
                           
                p.update();
        
                
            
        
               
                flash("success", "Project " + updateProjectForm.get().getname() + " has been updated");
                    
           
                return redirect(controllers.routes.HomeController.ListEmployee(0));

    }


    public Result updateEmployee(Long id){
       
        Employee e;
        Form<Employee> employeeForm;

       
            e = Employee.find.byId(id);
            employeeForm = formFactory.form(Employee.class).fill(e);
          
            return ok(updateEmployee.render(id, employeeForm, getCurrentUser()));

        }
        
        

        public Result updateEmployeeSubmit(Long id) {
            
                    String saveImageMsg;
            
                  
                    Form<Employee> updateEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
            
                  
                    if(updateEmployeeForm.hasErrors()) {
                      
                        return badRequest(updateEmployee.render(id, updateEmployeeForm,getCurrentUser() ));
                    }
                    
               
                    Employee p = updateEmployeeForm.get();
                    p.setId(id);
                    
                 
                                        
                 p.update();
            
                    
                    MultipartFormData data = request().body().asMultipartFormData();
                    FilePart image = data.getFile("upload");
            
                    saveImageMsg = saveFile(p.getId(), image);
            
                   
                    flash("success", "Employee " + updateEmployeeForm.get().getName() + " has been updates" + " " + saveImageMsg);
                        
               
                    return redirect(controllers.routes.HomeController.ListEmployee(0));
                }

        public String saveFile(Long id,FilePart<File> image){
          
            if(image !=null){
                String mimeType = image.getContentType();
               
                if (mimeType.startsWith("image/")) {
                   
                    File file = image.getFile();
               
                    ConvertCmd cmd = new ConvertCmd();
                    
                    IMOperation op = new IMOperation();
                   
                    op.addImage(file.getAbsolutePath());
              
                    op.resize(300,200);
                    
                    op.addImage("public/images/EmployeeImages/" + id + ".jpg");
                    
                    IMOperation thumb = new IMOperation();
                   
                    thumb.addImage(file.getAbsolutePath());
                    thumb.thumbnail(60);
                    
                    thumb.addImage("public/images/EmployeeImages/thumbnails/" + id + ".jpg");
                    
                    try{
                        cmd.run(op);
                        cmd.run(thumb);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }				
                    return " and Employee image saved";
                }
            }
            return "Employee file missing";	
        
        } 

        public Result EmployeeView(Long id) {
           Employee p;
    
            p = Employee.find.byId(id);
    
            return ok(EmployeeView.render(p,User.getById(session().get("email")),e));
        }

        public Result EmployeeIndex(){
            List<Employee> employeeList = Employee.findAll();
            List<Department> departmentList = Department.findAll();
            List<Project> projectList = Project.findAll();
    
            
            
           return ok(views.html.Employeeindex.render(employeeList,User.getById(session().get("email")),departmentList, e, projectList));

        }


    }
    

