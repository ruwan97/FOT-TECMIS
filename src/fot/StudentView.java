/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fot;

/**
 *
 * @author user
 */
public class StudentView {
    
    private String stuId;
    private String depId;
    private String menterId;
    private String name;
    private String address;
    private String gender;
    private String bday;
    private String pno;
    private String image;
     
    public StudentView(String stuId,String depId,String menterId,String name,String address,String gender,String bday,String pno,String image)
    {
        this.stuId=stuId;
        this.depId=depId;
        this.menterId=menterId;
        this.name=name;       
        this.address=address;
        this.gender=gender;
        this.bday=bday;
        this.pno=pno;
        this.image=image;
                
                        
    }
    
    public String  getStudentId()
    {
        return stuId;
    }
    
    public String getStudentDepId()
    {
        return depId;
    }
    
    public String getStudentMenterId()
    {
        return menterId;
    }
    
    public String  getStudentName()
    {
        return name;
    }
    
    public String getStudentAddress()
    {
        return address;
    }
    
     public String getStudentGender()
    {
        return gender;
    }
     
     public String getStudentBday()
    {
        return bday;
    }
     
     public String  getStudentPno()
    {
        return pno;
    }
  
    public String getStudentImage()
    {
        return image;
    }
}
