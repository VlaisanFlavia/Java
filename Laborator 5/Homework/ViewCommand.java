package org.example;

import java.awt.Desktop;
import java.io.File;

/**
 * The ViewCommand class represents a command to view a document using the native operating system application.
 */
class ViewCommand implements Command {
    /** The name of the document to be viewed. */
    private String documentName;

    /**
     * Constructs a new ViewCommand with the specified document name.
     *
     * @param documentName the name of the document to be viewed.
     */
    public ViewCommand(String documentName) {
        this.documentName = documentName;
    }

    /**
     * Executes the view command to open the specified document using the native operating system application.
     *
     * @throws UnsupportedOperationException if the desktop is not supported by the current platform.
     * @throws IllegalArgumentException      if the specified document file does not exist.
     * @throws Exception                     if an error occurs while opening the document.
     */
    @Override
    public void execute() throws Exception {
        File file = new File(documentName);
        if (!Desktop.isDesktopSupported()) {
            throw new UnsupportedOperationException("Desktop not supported");
        }
        Desktop desktop = Desktop.getDesktop();
        if (!file.exists()) {
            throw new IllegalArgumentException("File not found: " + documentName);
        }
        desktop.open(file);
        System.out.println("Opening document: " + documentName);
    }
}
