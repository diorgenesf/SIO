/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcos Vinicius
 */
public class DateTime {

    /**
     * Converte a data do formato(yyyy-mm-dd) padrão Sql, para o formato(dd /mm /yyyy).
     */
    public Object GetDataSql(String D) {
        if(D.isEmpty()) return null;
        SimpleDateFormat FBanco = new SimpleDateFormat("yyyy-mm-dd");
        Date Data = null;
        try {
            Data = FBanco.parse(D);
        } catch (ParseException ex) {
        }
        SimpleDateFormat FSaida = new SimpleDateFormat("dd/mm/yyyy");

        return FSaida.format(Data);
    }

    /**
     * Converte a data do formato(dd/mm/yyyy), para o formato(yyyy-mm-dd).
     */
    public String SetDataSql(String D) {
        if(D.isEmpty()) return null;
        SimpleDateFormat FEnt = new SimpleDateFormat("dd/mm/yyyy");
        Date Data = null;
        try {
            Data = FEnt.parse(D);
        } catch (ParseException ex) {
        }
        SimpleDateFormat FBanco = new SimpleDateFormat("yyyy-mm-dd");

        return FBanco.format(Data);
    }

    public Object SomarMes(int N) {
        if(N==0) return null;
        java.util.GregorianCalendar Data = (java.util.GregorianCalendar) java.util.GregorianCalendar.getInstance();
        Data.add(Data.MONTH, N);//Aumenta em 1 mes 
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        return dataFormatada.format(Data.getTime());
    }

    public String GetAllDate() {
        String F = "";
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date D = new java.sql.Date(System.currentTimeMillis());
        D.setTime(System.currentTimeMillis());
        F = ("" + formatador.format(D));
        Calendar calendar = new GregorianCalendar();
        java.sql.Date trialTime = new java.sql.Date(System.currentTimeMillis());
        calendar.setTime(trialTime);
        F += ("   " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        return F;
    }

    public String GetDay() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd");
        java.sql.Date D = new java.sql.Date(System.currentTimeMillis());
        D.setTime(System.currentTimeMillis());
        return ("" + formatador.format(D));
    }

    public String GetMonth() {
        SimpleDateFormat formatador = new SimpleDateFormat("MM");
        java.sql.Date D = new java.sql.Date(System.currentTimeMillis());
        D.setTime(System.currentTimeMillis());
        return ("" + formatador.format(D));
    }

    public String GetYear() {
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
        java.sql.Date D = new java.sql.Date(System.currentTimeMillis());
        D.setTime(System.currentTimeMillis());
        return ("" + formatador.format(D));
    }

    public String GetHour() {
        Calendar calendar = new GregorianCalendar();
        java.sql.Date trialTime = new java.sql.Date(System.currentTimeMillis());
        calendar.setTime(trialTime);
        return ("" + calendar.get(Calendar.HOUR_OF_DAY));
    }

    public String GetSeconds() {
        Calendar calendar = new GregorianCalendar();
        java.sql.Date trialTime = new java.sql.Date(System.currentTimeMillis());
        calendar.setTime(trialTime);
        return ("" + calendar.get(Calendar.SECOND));
    }

    public String GetMinutes() {
        Calendar calendar = new GregorianCalendar();
        java.sql.Date trialTime = new java.sql.Date(System.currentTimeMillis());
        calendar.setTime(trialTime);
        return ("" + calendar.get(Calendar.MINUTE));
    }

    public String GetTime() {
        Calendar calendar = new GregorianCalendar();
        java.sql.Date trialTime = new java.sql.Date(System.currentTimeMillis());
        calendar.setTime(trialTime);
        return ("" + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
    }
     public String GetDateString() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date D = new java.sql.Date(System.currentTimeMillis());
        D.setTime(System.currentTimeMillis());
        return ("" + formatador.format(D));
    }

    public static java.sql.Date GetDate() {
        java.sql.Date D = new java.sql.Date(System.currentTimeMillis());
        D.setTime(System.currentTimeMillis());
        //return ("" + formatador.format(D));
        return D;
    }

    public static String GetDate(java.sql.Date D) {
        if(D==null) return null;
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return ("" + formatador.format(D));
    }
}
