package org.example;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String masterDirectoryPath = "/path/to/master/directory";

        DocumentRepository repository = new DocumentRepository(masterDirectoryPath);

        List<Document> documents = repository.listDocuments();

        System.out.println("Repository Content:");
        for (Document document : documents) {
            System.out.println("Document Name: " + document.fileName());
            System.out.println("Content:\n" + document.format());
            System.out.println();
        }
    }
}