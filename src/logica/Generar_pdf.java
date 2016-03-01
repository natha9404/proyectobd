/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.itextpdf.text.BaseColor;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author natha9404
 */
public class Generar_pdf {

    public void ConvertirPDF_Pasajero(ArrayList<String> cedula, ArrayList<String> nombre, ArrayList<String> telefono, ArrayList<String> tarjeta) throws FileNotFoundException {
        String nombre_pdf = "Reporte Pasajero" + ".pdf";
        System.out.println(nombre_pdf);
        try {
            //Creamos documento indicando el tamaño y margenes
            Document documento = new Document(PageSize.LETTER, 20, 20, 20, 20);

            //Creamos el PDF y lo instanceamos para poder escribir sobre el
            PdfWriter.getInstance(documento, new FileOutputStream(nombre_pdf)).setInitialLeading(20);

            //Abrimos el documento
            documento.open();
            System.out.println("Documento Abierto");
            

            //Anexamos el texto a un objeto Pharagraph
            Paragraph parametro = new Paragraph("Listado de Pasajeros con sus tarjetas ", FontFactory.getFont(FontFactory.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK));
            parametro.setAlignment(1);

            Paragraph parametro2 = new Paragraph("Cedula        Nombre                      Telefono      Tarjeta", FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK));

            //Escribimos sobre el
            documento.add(parametro);
            // documento.add(parametro17);
            
            Paragraph parametro3;
            
            
            
            
            for (int i = 0; i < cedula.size(); i++) {

                String tar = "No tiene";
                
                parametro3 = new Paragraph("Cedula: " + cedula.get(i)+ "    Nombre: " + nombre.get(i)+ "    Telefono: " + telefono.get(i)+ "    Tarjeta No.: " + tarjeta.get(i), FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK));
                
                
                System.out.println("Cedula: " + cedula.get(i)+ "    Nombre: " + nombre.get(i)+ "    Telefono: " + telefono.get(i)+ "    Tarjeta No.: " + tarjeta.get(i));
                
                documento.add(parametro3);

            }

            //Cerrar documento
            documento.close();

            //Mensaje de Exito
            JOptionPane.showMessageDialog(null, "PDF Creado con exito.");

            

        } catch (DocumentException de) {
            System.out.println("Error...");
        }
    }
        
    /**
     *
     * @param ruta
     * @param respuesta
     * @param fecha
     * @throws FileNotFoundException
     */
    public void ConvertirPDF_ConteoPasajeros(String ruta, String respuesta, Date fecha) throws FileNotFoundException {
        String nombre_pdf = "Reporte Conteo Pasajeros por Fecha" + ".pdf";
        System.out.println(nombre_pdf);
        try {
            //Creamos documento indicando el tamaño y margenes
            Document documento = new Document(PageSize.LETTER, 20, 20, 20, 20);

            //Creamos el PDF y lo instanceamos para poder escribir sobre el
            PdfWriter.getInstance(documento, new FileOutputStream(nombre_pdf)).setInitialLeading(20);

            //Abrimos el documento
            documento.open();
            System.out.println("Documento Abierto");
            

            //Anexamos el texto a un objeto Pharagraph
            Paragraph parametro = new Paragraph("Se movilizaron " + respuesta + " pasajeros en la ruta " + ruta + " el dia " + fecha, FontFactory.getFont(FontFactory.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK));
            parametro.setAlignment(1);

            //Paragraph parametro2 = new Paragraph("Cedula        Nombre                      Telefono      Tarjeta", FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK));

            //Escribimos sobre el
            documento.add(parametro);
            // documento.add(parametro17);
                        
            //Cerrar documento
            documento.close();

            //Mensaje de Exito
            JOptionPane.showMessageDialog(null, "PDF Creado con exito.");

            

        } catch (DocumentException de) {
            System.out.println("Error..." + de);
        }
    }

    public void ConvertirPDF_Pqr(ArrayList num_ticket, ArrayList tipo_pqr, ArrayList fecha, ArrayList estado, ArrayList nombre_estacion) throws FileNotFoundException {
        
     String nombre_pdf = "Reporte PQR" + ".pdf";
        System.out.println(nombre_pdf);
        try {
            //Creamos documento indicando el tamaño y margenes
            Document documento = new Document(PageSize.LETTER, 20, 20, 20, 20);

            //Creamos el PDF y lo instanceamos para poder escribir sobre el
            PdfWriter.getInstance(documento, new FileOutputStream(nombre_pdf)).setInitialLeading(20);

            //Abrimos el documento
            documento.open();
            System.out.println("Documento Abierto");
            

            //Anexamos el texto a un objeto Pharagraph
            Paragraph parametro = new Paragraph("Listado de Pasajeros con sus tarjetas ", FontFactory.getFont(FontFactory.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK));
            parametro.setAlignment(1);

            Paragraph parametro2 = new Paragraph("Cedula        Nombre                      Telefono      Tarjeta", FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK));

            //Escribimos sobre el
            documento.add(parametro);
            // documento.add(parametro17);
            
            Paragraph parametro3;
            
            
            
            
            for (int i = 0; i < num_ticket.size(); i++) {

                String tar = "No tiene";
                
                parametro3 = new Paragraph("Num Ticket: " + num_ticket.get(i)+ "    Tipo SQR: " + tipo_pqr.get(i)+ "    Fecha: " + fecha.get(i)+ "    Estado: " + estado.get(i)+ "     Estacion:"+ nombre_estacion.get(i), FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK));
                
                
                
                documento.add(parametro3);

            }

            //Cerrar documento
            documento.close();

            //Mensaje de Exito
            JOptionPane.showMessageDialog(null, "PDF Creado con exito.");

            

        } catch (DocumentException de) {
            System.out.println("Error...");
        }
        
    
    }

}
