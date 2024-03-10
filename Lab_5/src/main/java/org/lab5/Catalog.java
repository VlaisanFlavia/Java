package org.lab5;

import javax.print.Doc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {

    private String name;
    private List<Document> documents;

    public Catalog() {
        this.name = "";
        this.documents = new ArrayList<>();
    }

    /**
     * Constructor
     *
     * @param name: sets the name of catalog
     */

    public Catalog(String name) {
        this.name = name;
        this.documents = new ArrayList<Document>();
    }

    /**
     * This method sets a name for the catalog
     *
     * @param name : the name that will be set for the catalog
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the name of catalog
     *
     * @return : name will be returned
     */

    public String getName() {
        return name;
    }

    /**
     * This method sets the documents in list of document from the catalog
     *
     * @param documents : the document
     */
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    /**
     * This method returns the documents from the catalog
     *
     * @return : document to be return
     */

    public List<Document> getDocuments() {
        return new ArrayList<>(documents);
    }

    /**
     * This method adds a new document in list
     *
     * @param document : document to be added
     */

    public void addDocument(Document document) {
        documents.add(document);
    }

    /**
     * This method removes a document from the list
     *
     * @param document: document to be removed
     */

    public void removeDocument(Document document) {
        documents.remove(document);
    }

    /**
     * This method finds a document by id
     *
     * @param id : the id of the document
     * @return document: the document found with this id will be returned
     */
    public Document findById(String id) {
        for (Document document : documents) {
            if (document.getId().equals(id)) {
                return document;
            }
        }
        return null;
    }

    /**
     * This method overrides the toString() method
     *
     * @return : a string with the catalog information
     */

    @Override
    public String toString() {
        return "Catalog => " + "Name: " + name + "\n" + "documents: " + documents + "\n";
    }
}
