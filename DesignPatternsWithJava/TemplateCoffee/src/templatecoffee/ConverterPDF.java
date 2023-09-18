/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatecoffee;

/**
 *
 * @author aanto
 */
public abstract class ConverterPDF {
    public final void FileToPDF(){
        String pathFile = this.OpenFile();
        this.ExtractData(pathFile);
        this.ConvertToPDF(pathFile);
        System.out.println("Saved on: "+this.SaveOnFolder());
        
        if(this.AtFinishedOpenPDF())
            this.OpenNewPDF(pathFile);
        else
            System.out.println("PDF created successfully!!!");
    }
    
    abstract public String OpenFile();
    
    public final void ExtractData(String path){
        System.out.println("Extract Data from: "+ path);
    }
    
    public final void ConvertToPDF(String path){
        System.out.println("Converting file: "+ path+ " ......");
    }
    
    abstract  public String SaveOnFolder();
    
    public final void OpenNewPDF(String path){
        System.out.println("Opening file: "+ path+"...");
    }
    
    public Boolean AtFinishedOpenPDF(){
        return true;
    }
    
}
