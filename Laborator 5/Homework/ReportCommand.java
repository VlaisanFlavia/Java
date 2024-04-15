package org.example;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The ReportCommand class represents a command to generate an HTML report
 * representing the content of a document repository.
 */
class ReportCommand implements Command {
    /** The document repository for which the report is generated. */
    private DocumentRepository repository;

    /**
     * Constructs a new ReportCommand with the specified document repository.
     *
     * @param repository the document repository for which the report is generated.
     */
    public ReportCommand(DocumentRepository repository) {
        this.repository = repository;
    }

    /**
     * Executes the report command.
     *
     * @throws Exception if an error occurs during report generation.
     */
    @Override
    public void execute() throws Exception {
        // Create and open an HTML report representing the content of the repository
        generateHTMLReport(repository.getDocuments());
        System.out.println("HTML report generated for repository content.");
    }

    /**
     * Generates an HTML report representing the given list of documents.
     *
     * @param documents the list of documents to include in the report.
     * @throws IOException       if an I/O error occurs while writing the report.
     * @throws TemplateException if an error occurs during template processing.
     */
    private void generateHTMLReport(List<Document> documents) throws IOException, TemplateException {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
        cfg.setClassForTemplateLoading(ReportCommand.class, "/");
        Template template = cfg.getTemplate("report_template.ftl");

        Map<String, Object> input = new HashMap<>();
        input.put("documents", documents);

        StringWriter writer = new StringWriter();
        template.process(input, writer);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("report.html"))) {
            bw.write(writer.toString());
        }
    }
}
