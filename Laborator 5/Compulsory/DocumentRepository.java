package org.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class DocumentRepository {
    File masterDirectory;

    /**
     * Constructs a DocumentRepository object with the specified master directory path.
     *
     * @param masterDirectoryPath The path to the master directory where documents are stored.
     */
    public DocumentRepository(String masterDirectoryPath) {
        this.masterDirectory = new File(masterDirectoryPath);
    }

    /**
     * Lists the documents in the repository along with their content.
     *
     * @return A list of Document objects containing both file names and content.
     */
    public List<Document> listDocuments() {
        List<Document> documents = new ArrayList<>();
        File[] files = masterDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    String content = readDocumentContent(file);
                    documents.add(new Document(fileName, content));
                }
            }
        }
        return documents;
    }

    /**
     * Reads the content of a document given its file.
     *
     * @param file The file representing the document.
     * @return The content of the document as a string.
     */
    private String readDocumentContent(File file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}