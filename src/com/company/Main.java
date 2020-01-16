package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product versache = new Product("Versache");
        versache.productPrice();
        versache.productRating();
        Product armani = new Product("Armani");
        armani.productPrice();
        armani.productRating();
        Product zara = new Product("Zara");
        zara.productPrice();
        zara.productRating();
        Product celio = new Product("Celio");
        celio.productPrice();
        celio.productRating();
        Product smog = new Product("Smog");
        smog.productPrice();
        smog.productRating();
        Product maxAndMara = new Product("Max & Mara");
        maxAndMara.productPrice();
        maxAndMara.productRating();
        Product luiVuiton = new Product("Lui Vuiton");
        luiVuiton.productPrice();
        luiVuiton.productRating();
        Product guchi = new Product("Guchi");
        guchi.productPrice();
        guchi.productRating();
        Product sali = new Product("Sali");
        sali.productPrice();
        sali.productRating();
        Product sarojani = new Product("Sarojani");
        sarojani.productPrice();
        sarojani.productRating();

        products.add(versache);
        products.add(armani);
        products.add(zara);
        products.add(celio);
        products.add(smog);
        products.add(maxAndMara);
        products.add(luiVuiton);
        products.add(guchi);
        products.add(sali);
        products.add(sarojani);

        int bestRatedProduct = 0;
        for (int i = 0; i < products.size()-1; i++) {
            if (products.get(i).productRating() > products.get(i + 1).productRating()){
                bestRatedProduct = products.get(i).productRating();
            }

        }
        for (int i = 0; i < products.size()-1; i++) {
            if (bestRatedProduct == products.get(i).productRating()){
                System.out.println(products.get(i).getTitle());
            }
        }
    }
}
