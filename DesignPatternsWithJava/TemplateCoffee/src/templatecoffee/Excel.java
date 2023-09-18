/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatecoffee;

/**
 *
 * @author aanto
 */
public class Excel extends ConverterPDF{

    private String filePath;
    
    public Excel(String filePath){
        this.filePath = filePath;
    }
    
    @Override
    public String OpenFile() {
        return "../excel/sheets/sheet1.xlsx";
    }

    @Override
    public String SaveOnFolder() {
        return "../excel/sheets/";
    }
    
}
