// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ServedModelOutput {
    /**
     * The creation timestamp of the served model in Unix time.
     */
    @JsonProperty("creation_timestamp")
    private Long creationTimestamp;
    
    /**
     * The email of the user who created the served model.
     */
    @JsonProperty("creator")
    private String creator;
    
    /**
     * The name of the model in Databricks Model Registry.
     */
    @JsonProperty("model_name")
    private String modelName;
    
    /**
     * The version of the model in Databricks Model Registry.
     */
    @JsonProperty("model_version")
    private String modelVersion;
    
    /**
     * The name of the served model.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Whether the compute resources for the Served Model should scale down to
     * zero.
     */
    @JsonProperty("scale_to_zero_enabled")
    private Boolean scaleToZeroEnabled;
    
    /**
     * Information corresponding to the state of the Served Model.
     */
    @JsonProperty("state")
    private ServedModelState state;
    
    public ServedModelOutput setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    public Long getCreationTimestamp() {
        return creationTimestamp;
    }
    
    public ServedModelOutput setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public String getCreator() {
        return creator;
    }
    
    public ServedModelOutput setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public String getModelName() {
        return modelName;
    }
    
    public ServedModelOutput setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    public String getModelVersion() {
        return modelVersion;
    }
    
    public ServedModelOutput setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ServedModelOutput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
        this.scaleToZeroEnabled = scaleToZeroEnabled;
        return this;
    }

    public Boolean getScaleToZeroEnabled() {
        return scaleToZeroEnabled;
    }
    
    public ServedModelOutput setState(ServedModelState state) {
        this.state = state;
        return this;
    }

    public ServedModelState getState() {
        return state;
    }
    
}
