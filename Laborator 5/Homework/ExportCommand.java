package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

/**
 * The ExportCommand class represents a command to export the document repository to a JSON file.
 */
class ExportCommand implements Command {
    /** The document repository to be exported. */
    private DocumentRepository repository;

    /** The file name of the JSON file to export to. */
    private String fileName;

    /**
     * Constructs a new ExportCommand with the specified document repository and file name.
     *
     * @param repository the document repository to be exported.
     * @param fileName the file name of the JSON file to export to.
     */
    public ExportCommand(DocumentRepository repository, String fileName) {
        this.repository = repository;
        this.fileName = fileName;
    }

    /**
     * Executes the export command.
     *
     * @throws Exception if an error occurs during export.
     */
    @Override
    public void execute() throws Exception {
        // Export the repository to an external file using JSON format
        ObjectMapper objectMapper = new ObjectMapper();
        List<Document> documents = repository.getDocuments();
        File file = new File(fileName);

        // Write documents to JSON file
        objectMapper.writeValue(file, documents);

        System.out.println("Exported repository to JSON file: " + fileName);
    }
}
