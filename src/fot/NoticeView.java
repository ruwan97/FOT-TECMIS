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
class NoticeView {
    
    private String no;
    private String date;
    private String title;
    private String notice;
     
    public NoticeView(String no,String date,String title,String notice)
    {
        this.no=no;
        this.date=date;
        this.title=title;
        this.notice=notice;
        
    }
    
    public String getNoticeNo()
    {
        return no;
    }
    
    public String getNoticeDate()
    {
        return date;
    }
    
    public String getNoticeTitle()
    {
        return title;
    }
    
    public String getNoticeNotice()
    {
        return notice;
    }
    
}
