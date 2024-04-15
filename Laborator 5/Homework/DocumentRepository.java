package org.example;

import java.util.*;

/**
 * The DocumentRepository class represents a repository of documents.
 * It stores a list of documents and provides methods to add and retrieve documents.
 */
class DocumentRepository {
    /** The list of documents stored in the repository. */
    private List<Document> documents;

    /**
     * Constructs a new DocumentRepository with an empty list of documents.
     */
    public DocumentRepository() {
        documents = new ArrayList<>();
    }

    /**
     * Adds a document to the repository.
     *
     * @param document the document to be added.
     */
    public void addDocument(Document document) {
        documents.add(document);
    }

    /**
     * Retrieves the list of documents in the repository.
     *
     * @return an unmodifiable list of documents.
     */
    public List<Document> getDocuments() {
        return Collections.unmodifiableList(documents);
    }
}
