package com.mycompany.idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Locale loc = Locale.getDefault();
        System.out.println(loc.getLanguage());
        System.out.println(loc.getDisplayLanguage());
        System.out.println("java.home="+System.getProperty("java.home"));
        
    }
}
