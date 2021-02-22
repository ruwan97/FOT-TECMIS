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
public class TecnicalView {
    
    private String tecId;
    private String depId;
    private String name;
    private String gender;
    private String pno;
    private String image;
     
    public TecnicalView(String tecId,String depId,String name,String gender,String pno,String image)
    {
        this.tecId=tecId;
        this.depId=depId;
        this.name=name;       
        this.gender=gender;
        this.pno=pno;
        this.image=image;
                
                        
    }
    
    public String  getTecnicalId()
    {
        return tecId;
    }
    
    public String getTecnicalDepId()
    {
        return depId;
    }
    
    public String  getTecnicalName()
    {
        return name;
    }
   
     public String getTecnicalGender()
    {
        return gender;
    }
     
     public String  getTecnicalPno()
    {
        return pno;
    }
  
    public String getTecnicalImage()
    {
        return image;
    }
}
