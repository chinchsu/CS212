/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author chin_
 */
public class Date212 {

    int m; // month
    int d; // day
    int y; // year
    String D;
    // create date with int
    Date212(int y, int m, int d) {
        this.m = m;
        this.d = d;
        this.y = y;
    }

    // create date with string veryify string is 8 digit if not set to 0
    Date212(String D){
        this(
                D.matches("^[0-9]{8}") ? Integer.parseInt(D.substring(0, 4)) : 0,
                D.matches("^[0-9]{8}") ? Integer.parseInt(D.substring(4, 6)) : 0,
                D.matches("^[0-9]{8}") ? Integer.parseInt(D.substring(6, 8)) : 0
        );
        this.D = D;
    }

    // Date verifiers
    private boolean verifyYear(String v) {
        return v.matches("^[0-9]{4}");
    }

    private boolean verifyMD(String v) {
        return v.matches("^[0-9]{2}");
    }

    public String toString() {
        String S = "";
        if (m > 9) {
            S += m + "/";
        } else {
            S += "0" + m + "/";
        }
        if (d > 9) {
            S += d + "/";
        } else {
            S += "0" + d + "/";
        }
        if (y > 999) {
            S += y;
        } else if (y > 99) {
            S += "0" + y;
        } else if (y > 9) {
            S += "00" + y;
        } else {
            S += "000" + y;
        }
        return S;
    }
    // compare dates
    public boolean isGreater(String S){
        int a = Integer.parseInt(D);
        int b = Integer.parseInt(S);
        if (a > b){
            return true;
        } 
        else
            return false;
    }
    // compare dates
    public boolean isSmaller(String S){
        int a = Integer.parseInt(D);
        int b = Integer.parseInt(S);
        if (a < b){
            return true;
        } 
        else
            return false;
    }
    // compare Dates
    public boolean isEqual(String S){
        int a = Integer.parseInt(D);
        int b = Integer.parseInt(S);
        if (a == b){
            return true;
        } 
        else
            return false;
    }
    // get years
    public int getYear() {
        return y;
    }

    public int getMonth() {
        return m;
    }

    public int getDay() {
        return d;
    }
}
