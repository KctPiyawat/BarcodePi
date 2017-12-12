package kct.piyawat.barcodepi.utility;

/**
 * Created by asus on 5/12/2560.
 */

public class MyConstant {

    private String[] connectedStrings = new String[]{"on", "off"};

    private String[] columnProductStrings = new String[]{
            "id",
            "NameProduct",
            "Barcode",
            "Price",
            "Detail",
            "PathImage",
            "Item"};

    private String urlGetAllProductString = http;://androidthai.in.th/pi/getAllProductPi.php


    public String getUrlGetAllProductString() {
        return urlGetAllProductString;
    }

    public String[] getConnectedStrings() {
        return connectedStrings;
    }

    public String[] getColumnProductStrings() {
        return columnProductStrings;
    }
}   // Main Class
