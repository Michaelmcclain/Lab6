package edu.cscc;

public class Main {
    // Michael McClain // 2/24/2020/ This Program utilizes inheritance and polymorphism to display addresses.

    public static void main(String[] args) {
	    Address[] addressList = new Address[6];

        addressList[0] = new BusinessAddress("550 East Spring St.","Columbus", "OH","43215","Columbus State","Eibling 302B");
        addressList[1] = new BusinessAddress("","Columbus","OH","43201","AEP","P.O. Box 2075");
        addressList[2] = new BusinessAddress("2079 N. Main St.","Columbus","OH","43227","Bill's Coffee","");

        addressList[3] = new PersonAddress("1200 N. Fourth St.", "Worthington", "OH", "43217","Saul GoodMan");
        addressList[4] = new PersonAddress("207 Main St.","ReynoldsBurg", "OH","43211","Mike Ehrmentraut");
        addressList[5] = new PersonAddress("2091 Elm St.", "Pickerington", "OH", "43191", "Gustavo Fring");


        for (Address address : addressList) {
	        address.printLabel();
            System.out.println("====================");
        }
    }
}
