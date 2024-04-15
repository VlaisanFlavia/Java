# Document Management System

This project implements a simple document management system in Java. It allows users to interact with a document repository through a command-line interface.

## Features

- Add documents to the repository
- View documents using the native operating system application
- Generate HTML report representing the repository content
- Export the repository to a JSON file

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Apache Maven installed (optional, for building the project)

## Structure

The project consists of the following components:

- `org.example`: Java package containing the source code
  - `Document`: Class representing a document
  - `DocumentRepository`: Class representing the document repository
  - `Command`: Interface representing a generic command
  - `ViewCommand`: Class implementing the command to view a document
  - `ReportCommand`: Class implementing the command to generate an HTML report
  - `ExportCommand`: Class implementing the command to export the repository to a JSON file
  - `Shell`: Class representing the interactive shell for executing commands
  - `Main`: Main class to start the application

