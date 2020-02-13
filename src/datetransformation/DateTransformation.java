/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetransformation;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author Matt Workstation
 */
public class DateTransformation {

    /**
     * @param args the command line arguments
     */
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        // TODO code application logic here
        String auxDate = sdf.format(new Timestamp(System.currentTimeMillis()));
        System.out.println("Fecha Inicial " + auxDate);
        for (int i = 0; i < 50; i++) {
            auxDate = sdf.format(Timestamp.valueOf(auxDate).getTime() - (24*60*60*1000)); //  RESTA 24H A LA FECHA ANTERIOR
            System.out.println("Fecha " + i + ":" + auxDate);
        }
    }
}
