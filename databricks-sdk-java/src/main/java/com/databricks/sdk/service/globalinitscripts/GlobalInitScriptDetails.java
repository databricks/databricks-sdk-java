// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GlobalInitScriptDetails {
    /**
     * Time when the script was created, represented as a Unix timestamp in
     * milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * The username of the user who created the script.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Specifies whether the script is enabled. The script runs only if enabled.
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    
    /**
     * The name of the script
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * The position of a script, where 0 represents the first script to run, 1
     * is the second script to run, in ascending order.
     */
    @JsonProperty("position")
    private Long position;
    
    /**
     * The global init script ID.
     */
    @JsonProperty("script_id")
    private String scriptId;
    
    /**
     * Time when the script was updated, represented as a Unix timestamp in
     * milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * The username of the user who last updated the script
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    public GlobalInitScriptDetails setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public GlobalInitScriptDetails setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public GlobalInitScriptDetails setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    
    public GlobalInitScriptDetails setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public GlobalInitScriptDetails setPosition(Long position) {
        this.position = position;
        return this;
    }

    public Long getPosition() {
        return position;
    }
    
    public GlobalInitScriptDetails setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    public String getScriptId() {
        return scriptId;
    }
    
    public GlobalInitScriptDetails setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public GlobalInitScriptDetails setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
}
