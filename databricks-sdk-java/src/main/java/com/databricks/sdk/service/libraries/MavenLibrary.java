// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class MavenLibrary {
    /**
     * Gradle-style maven coordinates. For example: "org.jsoup:jsoup:1.7.2".
     */
    @JsonProperty("coordinates")
    private String coordinates;
    
    /**
     * List of dependences to exclude. For example: `["slf4j:slf4j",
     * "*:hadoop-client"]`.
     * 
     * Maven dependency exclusions:
     * https://maven.apache.org/guides/introduction/introduction-to-optional-and-excludes-dependencies.html.
     */
    @JsonProperty("exclusions")
    private java.util.List<String> exclusions;
    
    /**
     * Maven repo to install the Maven package from. If omitted, both Maven
     * Central Repository and Spark Packages are searched.
     */
    @JsonProperty("repo")
    private String repo;
    
    public MavenLibrary setCoordinates(String coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public String getCoordinates() {
        return coordinates;
    }
    
    public MavenLibrary setExclusions(java.util.List<String> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    public java.util.List<String> getExclusions() {
        return exclusions;
    }
    
    public MavenLibrary setRepo(String repo) {
        this.repo = repo;
        return this;
    }

    public String getRepo() {
        return repo;
    }
    
}
