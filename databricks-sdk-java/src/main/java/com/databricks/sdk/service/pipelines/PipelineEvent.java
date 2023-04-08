// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PipelineEvent {
    /**
     * Information about an error captured by the event.
     */
    @JsonProperty("error")
    private ErrorDetail error;
    
    /**
     * The event type. Should always correspond to the details
     */
    @JsonProperty("event_type")
    private String eventType;
    
    /**
     * A time-based, globally unique id.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * The severity level of the event.
     */
    @JsonProperty("level")
    private EventLevel level;
    
    /**
     * Maturity level for event_type.
     */
    @JsonProperty("maturity_level")
    private MaturityLevel maturityLevel;
    
    /**
     * The display message associated with the event.
     */
    @JsonProperty("message")
    private String message;
    
    /**
     * Describes where the event originates from.
     */
    @JsonProperty("origin")
    private Origin origin;
    
    /**
     * A sequencing object to identify and order events.
     */
    @JsonProperty("sequence")
    private Sequencing sequence;
    
    /**
     * The time of the event.
     */
    @JsonProperty("timestamp")
    private String timestamp;
    
    public PipelineEvent setError(ErrorDetail error) {
        this.error = error;
        return this;
    }

    public ErrorDetail getError() {
        return error;
    }
    
    public PipelineEvent setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public String getEventType() {
        return eventType;
    }
    
    public PipelineEvent setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public PipelineEvent setLevel(EventLevel level) {
        this.level = level;
        return this;
    }

    public EventLevel getLevel() {
        return level;
    }
    
    public PipelineEvent setMaturityLevel(MaturityLevel maturityLevel) {
        this.maturityLevel = maturityLevel;
        return this;
    }

    public MaturityLevel getMaturityLevel() {
        return maturityLevel;
    }
    
    public PipelineEvent setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }
    
    public PipelineEvent setOrigin(Origin origin) {
        this.origin = origin;
        return this;
    }

    public Origin getOrigin() {
        return origin;
    }
    
    public PipelineEvent setSequence(Sequencing sequence) {
        this.sequence = sequence;
        return this;
    }

    public Sequencing getSequence() {
        return sequence;
    }
    
    public PipelineEvent setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }
    
}
