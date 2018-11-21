package sita.database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sita kumari
 */
public class Book {

    private int bookid;
    private String bookcategory;
    private String booktittle;
    private String bookauthor;
    private String bookpublisher;
    private String availablestock;
    private String year;
    private String branchName;

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
            private String semester;
    

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(String bookcategory) {
        this.bookcategory = bookcategory;
    }

    public String getBooktittle() {
        return booktittle;
    }

    public void setBooktittle(String booktittle) {
        this.booktittle = booktittle;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookpublisher() {
        return bookpublisher;
    }

    public void setBookpublisher(String bookpublisher) {
        this.bookpublisher = bookpublisher;
    }

    public String getAvailablestock() {
        return availablestock;
    }

    public void setAvailablestock(String availablestock) {
        this.availablestock = availablestock;
    }

}
