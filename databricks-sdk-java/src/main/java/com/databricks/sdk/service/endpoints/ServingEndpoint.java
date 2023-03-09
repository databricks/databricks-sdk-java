// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ServingEndpoint {
    /**
     * The config that is currently being served by the endpoint.
     */
    @JsonProperty("config")
    private EndpointCoreConfigSummary config;
    
    /**
     * The timestamp when the endpoint was created in Unix time.
     */
    @JsonProperty("creation_timestamp")
    private Long creationTimestamp;
    
    /**
     * The email of the user who created the serving endpoint.
     */
    @JsonProperty("creator")
    private String creator;
    
    /**
     * System-generated ID of the endpoint. This is used to refer to the
     * endpoint in the Permissions API
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * The timestamp when the endpoint was last updated by a user in Unix time.
     */
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    
    /**
     * The name of the serving endpoint.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Information corresponding to the state of the serving endpoint.
     */
    @JsonProperty("state")
    private EndpointState state;
    
    public ServingEndpoint setConfig(EndpointCoreConfigSummary config) {
        this.config = config;
        return this;
    }

    public EndpointCoreConfigSummary getConfig() {
        return config;
    }
    
    public ServingEndpoint setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    public Long getCreationTimestamp() {
        return creationTimestamp;
    }
    
    public ServingEndpoint setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public String getCreator() {
        return creator;
    }
    
    public ServingEndpoint setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public ServingEndpoint setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }
    
    public ServingEndpoint setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ServingEndpoint setState(EndpointState state) {
        this.state = state;
        return this;
    }

    public EndpointState getState() {
        return state;
    }
    
}
