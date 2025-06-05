// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PipelineEventPb {
  @JsonProperty("error")
  private ErrorDetail error;

  @JsonProperty("event_type")
  private String eventType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("level")
  private EventLevel level;

  @JsonProperty("maturity_level")
  private MaturityLevel maturityLevel;

  @JsonProperty("message")
  private String message;

  @JsonProperty("origin")
  private Origin origin;

  @JsonProperty("sequence")
  private Sequencing sequence;

  @JsonProperty("timestamp")
  private String timestamp;

  public PipelineEventPb setError(ErrorDetail error) {
    this.error = error;
    return this;
  }

  public ErrorDetail getError() {
    return error;
  }

  public PipelineEventPb setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  public String getEventType() {
    return eventType;
  }

  public PipelineEventPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public PipelineEventPb setLevel(EventLevel level) {
    this.level = level;
    return this;
  }

  public EventLevel getLevel() {
    return level;
  }

  public PipelineEventPb setMaturityLevel(MaturityLevel maturityLevel) {
    this.maturityLevel = maturityLevel;
    return this;
  }

  public MaturityLevel getMaturityLevel() {
    return maturityLevel;
  }

  public PipelineEventPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public PipelineEventPb setOrigin(Origin origin) {
    this.origin = origin;
    return this;
  }

  public Origin getOrigin() {
    return origin;
  }

  public PipelineEventPb setSequence(Sequencing sequence) {
    this.sequence = sequence;
    return this;
  }

  public Sequencing getSequence() {
    return sequence;
  }

  public PipelineEventPb setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineEventPb that = (PipelineEventPb) o;
    return Objects.equals(error, that.error)
        && Objects.equals(eventType, that.eventType)
        && Objects.equals(id, that.id)
        && Objects.equals(level, that.level)
        && Objects.equals(maturityLevel, that.maturityLevel)
        && Objects.equals(message, that.message)
        && Objects.equals(origin, that.origin)
        && Objects.equals(sequence, that.sequence)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        error, eventType, id, level, maturityLevel, message, origin, sequence, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineEventPb.class)
        .add("error", error)
        .add("eventType", eventType)
        .add("id", id)
        .add("level", level)
        .add("maturityLevel", maturityLevel)
        .add("message", message)
        .add("origin", origin)
        .add("sequence", sequence)
        .add("timestamp", timestamp)
        .toString();
  }
}
