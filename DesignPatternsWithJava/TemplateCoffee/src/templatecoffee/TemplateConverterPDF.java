/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatecoffee;

/**
 *
 * @author aanto
 */
public class TemplateConverterPDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // File paths
        String wordFile  = "../word/docs/doc1.docx";
        String excelFile = "../excel/sheets/sheet1.docx";
        
        System.out.println("\nSTARTING APPLICATION\n" );
        // Create converters 
        System.out.println("\n Converting file ["+wordFile+"] to PDF\n" );
        ConverterPDF docsConverter = new Word(wordFile);
        docsConverter.FileToPDF();
        
        System.out.println("\n Converting file ["+excelFile+"] to PDF\n" );
        ConverterPDF excelConverter = new Excel(excelFile);
        excelConverter.FileToPDF();
    }
    
}
