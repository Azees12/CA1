package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import java.util.ArrayList;
import javax.persistence.GeneratedValue;


@Entity
public class Employee extends Model {

    @Id
    @GeneratedValue
    private Long id;

    @Constraints.Required
    private String email;

    @Constraints.Required
    private String name;

    @Constraints.Required
    @ManyToOne
    private Department department;



    @ManyToMany
    public List<Project> projects;

    public Employee(Long id,String email,Department depart,String name){
        this.id = id;
        this.email = email;
        this.department = depart;
        this.name = name;
    
    }



    public Long getId(){
        return id;
    }


    public void setId(Long id){
        this.id = id;
    }

    public String getEmail() {
        
        return email;
        
        }
        
        public void setEmail(String email) {
        
        this.email = email;
        
        }
        
        public String getName() {
        
        return name;
        
        }
        
        public void setName(String name) {
        
        this.name = name;
        
        }
        

    public Department getDepartment(){
        return this.department;
    }

    public List<Project> getProjects(){
        return projects;
    }

    public void setProjects(List<Project>  a){
        this.projects = a;
    }

    public void setDepartment(Department i){
        this.department = i;
    }
 
    public static Finder<Long, Employee> find = new Finder<>(Employee.class);
      
    public static final List<Employee> findAll(){
        return Employee.find.all();
    }

    public static boolean inEmployee(Long employee, Long project) {
        return find.query().where()
            .eq("projects.id", project)
            .eq("id", employee)
            .findCount() > 0;
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options =new LinkedHashMap();
        
        for (Employee p: Employee.findAll()) {
          options.put(p.getId().toString(), p.getName());


        }
        return options;
    }



    
    
  

    }


