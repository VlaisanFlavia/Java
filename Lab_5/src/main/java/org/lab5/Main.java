package org.lab5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Catalog myCatalog = new Catalog("My Documents");

        Document doc1 = new Document("1", "Article on AI", "/home/user/docs/article.txt");
        doc1.addTag("Author", "John Doe");
        doc1.addTag("Year", "2021");

        Document doc2 = new Document("2", "Book on Java", "http://www.example.com/book.pdf");
        doc2.addTag("Author", "Jane Smith");
        doc2.addTag("Publishing Date", "January 1, 2022");

        myCatalog.addDocument(doc1);
        myCatalog.addDocument(doc2);

        Document foundDoc = myCatalog.findById("1");
        System.out.println(foundDoc.getName()); // prints "Article on AI"

        myCatalog.removeDocument(doc2);

        foundDoc = myCatalog.findById("2");
        System.out.println(foundDoc); // prints "null"
         */

        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() {
        Catalog catalog = new Catalog("MyDocuments");
        var book = new Document("object1", "PA", "location1");
        var article = new Document("object2", "Web", "location2");
        catalog.addDocument(book);
        catalog.addDocument(article);

        try {
            CatalogUtil.save(catalog, "d:/research/catalog.json");
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }

    private void testLoadView() {
        Catalog catalog = new Catalog();
        try {
            catalog = CatalogUtil.load("d:/research/catalog.json");
        } catch (IOException | InvalidCatalogException e) {
            System.out.println("Error loading catalog : " + e);
        }

        System.out.println(catalog);
    }
}


    }
            }