/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119078.adamfirdausdarmawan;


/**
 *
 * @author ryzen
 */
public class Customer extends ServicePrice{
    private String name,email;
    private boolean member;
        
    public String getName(){
        return name;
    }
    
    public void setName(String name){

        this.name=name;
    }

    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){

        this.email=email;
    }
    
    public boolean isMember(){
        return member;
    }
    
    public void setMember(boolean member){
        this.member=member;
    }
}
