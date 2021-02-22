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
public class LecturerView {
    
    private String lecId;
    private String depId;
    private String name;
    private String address;
    private String gender;
    private String pno;
    private String image;
     
    public LecturerView(String lecId,String depId,String name,String address,String gender,String pno,String image)
    {
        this.lecId=lecId;
        this.depId=depId;
        this.name=name;       
        this.address=address;
        this.gender=gender;
        this.pno=pno;
        this.image=image;
                
                        
    }
    
    public String  getLecturerId()
    {
        return lecId;
    }
    
    public String getLecturerDepId()
    {
        return depId;
    }
    
    public String  getLecturerName()
    {
        return name;
    }
    
    public String getLecturerAddress()
    {
        return address;
    }
    
     public String getLecturerGender()
    {
        return gender;
    }
     
     public String  getLecturerPno()
    {
        return pno;
    }
  
    public String getLecturerImage()
    {
        return image;
    }
}
