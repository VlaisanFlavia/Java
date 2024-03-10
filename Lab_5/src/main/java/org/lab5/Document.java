package org.lab5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.*;

public class Document implements Serializable {
    private String id;
    private String name;
    private String location;
    private Map<String, String> tags;

    /**
     * Constructor
     *
     * @param id       : sets the id
     * @param name     : sets the name
     * @param location : sets the location
     */

    public Document(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.tags = new HashMap<String, String>();
    }

    /**
     * This method sets the name of the document
     *
     * @param name : the name of the document
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method sets the id of the document
     *
     * @param id : the id of the document
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method sets the location of the document
     *
     * @param location: the location of the document
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method sets the tags
     *
     * @param tags: the tags of the document
     */

    public void setTags(Map<String, String> tags) {
        this.tags.putAll(tags);
    }

    /**
     * This method returns the id of document
     *
     * @return id: id to be returned
     */

    public String getId() {
        return id;
    }

    /**
     * This method returns the name of document
     *
     * @return name: name to be returned
     */

    public String getName() {
        return name;
    }

    /**
     * This method returns the location of the document
     *
     * @return location: location to be returned
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method returns the tags
     *
     * @return tags: tags to be returned
     */

    public Map<String, String> getTags() {
        return new HashMap<>(tags);
    }

    /**
     * This method adds a tag in list
     *
     * @param name  : the name of the tag
     * @param value : the value of the tag
     */

    public void addTag(String name, String value) {
        tags.put(name, value);
    }

    /**
     * This method removes a tag from the list
     *
     * @param name : the name of the tag to be removed
     */
    public void removeTag(String name) {
        tags.remove(name);
    }

    /**
     * This method overrides the toString() method
     *
     * @return : a string with the document information
     */

    @Override
    public String toString() {
        return "Document => " + "Name: " + name + "Id: " + id + "Location: " + location + "Tags: " + tags;
    }
}