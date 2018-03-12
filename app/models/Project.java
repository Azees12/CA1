package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;


@Entity
public class Project extends Model{

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @ManyToMany(mappedBy="projects")
    public List<Employee> members ;


    public List<Long> empSelect = new ArrayList<Long>();

    public Project(){

    }


    public Project(Long id,String name,List<Employee> b){
        this.id = id;
        this.name = name;

        
    }


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
}

    public List<Employee> getMembers(){
        return members;
    }


    public void setMember(List<Employee>  e){
        this.members = e;
    }

    public void setempSelect(List<Long> empSelect){
        this.empSelect =  empSelect;
    }
    
       public List<Long> getempSelect(){
           return empSelect;
       }

    
    public static Finder<Long, Project> find = new Finder<Long, Project> (Project.class);

    public static List<Project> findAll() {
        return Project.find.query().where().orderBy("name asc").findList();
    }


    public static boolean inProject(Long project, Long employee) {
        return find.query().where()
            .eq("members.id", employee)
            .eq("id", project)
            .findCount() > 0;
    }
    }