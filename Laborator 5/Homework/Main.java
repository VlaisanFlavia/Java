package org.example;

public class Main {
    public static void main(String[] args) {
        DocumentRepository repository = new DocumentRepository();

        repository.addDocument(new Document("Document 1", "Content of document 1"));
        repository.addDocument(new Document("Document 2", "Content of document 2"));
        repository.addDocument(new Document("Document 3", "Content of document 3"));

        Shell shell = new Shell(repository);
        shell.start();
    }
}
