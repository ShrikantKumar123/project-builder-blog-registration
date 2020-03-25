package model;


import java.time.LocalDateTime;

public class User
{
	String name;
	String password;
	LocalDateTime date;
	String email;
	
	
   public User(String name, String password, LocalDateTime date)//method used
   {
	   this.name=name;
	   this.password=password;
	   this.date=date;
	   
   }
   
   
   public void setEmail(String email)
   {
	   this.email=email;
   }
   public void setPassword(String password)
   {
	   this.password=password;
   }
   public void setDate(LocalDateTime date2)
   {
     this.date=date2;
   	
   }
   
  
      
public char[] getEmail()  //getter used
{ char c[]=email.toCharArray();
	
	return c;
}
public char[] getPassword() {
	char c[]=password.toCharArray();
	return c;
}

   
   
}
