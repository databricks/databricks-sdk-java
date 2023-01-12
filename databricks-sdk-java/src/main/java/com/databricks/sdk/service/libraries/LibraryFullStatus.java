// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class LibraryFullStatus {
    /**
     * Whether the library was set to be installed on all clusters via the
     * libraries UI.
     */
    @JsonProperty("is_library_for_all_clusters")
    private Boolean isLibraryForAllClusters;
    
    /**
     * Unique identifier for the library.
     */
    @JsonProperty("library")
    private Library library;
    
    /**
     * All the info and warning messages that have occurred so far for this
     * library.
     */
    @JsonProperty("messages")
    private java.util.List<String> messages;
    
    /**
     * Status of installing the library on the cluster.
     */
    @JsonProperty("status")
    private LibraryFullStatusStatus status;
    
    public LibraryFullStatus setIsLibraryForAllClusters(Boolean isLibraryForAllClusters) {
        this.isLibraryForAllClusters = isLibraryForAllClusters;
        return this;
    }

    public Boolean getIsLibraryForAllClusters() {
        return isLibraryForAllClusters;
    }
    
    public LibraryFullStatus setLibrary(Library library) {
        this.library = library;
        return this;
    }

    public Library getLibrary() {
        return library;
    }
    
    public LibraryFullStatus setMessages(java.util.List<String> messages) {
        this.messages = messages;
        return this;
    }

    public java.util.List<String> getMessages() {
        return messages;
    }
    
    public LibraryFullStatus setStatus(LibraryFullStatusStatus status) {
        this.status = status;
        return this;
    }

    public LibraryFullStatusStatus getStatus() {
        return status;
    }
    
}
