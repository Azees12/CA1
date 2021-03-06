package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import java.util.ArrayList;
import javax.persistence.GeneratedValue;

@Entity

@Table(name ="user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")

@DiscriminatorValue(
    "user")
public class User extends Model {

    @Id
    private String email;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String role;

    @Constraints.Required
    private String password;


public User(){

}
  
    public User (String email,String name,String role,String password){
        this.email = email;
        this.name = name;
        this.password = password;
    }


    public String getEmail() {
        
        return email;
        
        }
        
        public void setEmail(String email) {
        
        this.email = email;
        
        }

        public String getRole() {
            return role;
        }
        
        public String getName() {
        
        return name;
        
        }
        
        public void setName(String name) {
        
        this.name = name;
        
        }

        public void setRole(String role) {
            this.role = role;
        }
        

        public String getPassword() {
            
            return password;
            
            }
            
            public void setPassword(String password) {
            
            this.password = password;
            
            }

 
    public static Finder<String, User> find = new Finder<String, User>(User.class);
      

    public static List<User> findAll() {
        return User.find.all();
    }

    public static User authenticate(String email, String password){
        return find.query().where().eq("email",email).eq("password",password).findUnique();
    }

    public static User getById(String id){
        if(id == null)
        return null;

        else{
        return find.byId(id);
        }
    }

    
    
  

    }


