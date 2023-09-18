/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatecoffee;

/**
 *
 * @author aanto
 */
public class Word extends ConverterPDF{
    private String filePath;
    
    public Word(String filePath){
        this.filePath = filePath;
    }

    @Override
    public String OpenFile() {
        return "../word/docs/file1.docx";
    }

    @Override
    public String SaveOnFolder() {
        return "../word/docs/";
    }
    
    @Override 
    public Boolean AtFinishedOpenPDF(){
        return false;
    }
}
