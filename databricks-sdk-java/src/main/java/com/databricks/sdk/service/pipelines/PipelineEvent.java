// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PipelineEvent class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PipelineEvent {
  /** Information about an error captured by the event. */
  @JsonProperty("error")
  private ErrorDetail error;

  /** The event type. Should always correspond to the details */
  @JsonProperty("event_type")
  private String eventType;

  /** A time-based, globally unique id. */
  @JsonProperty("id")
  private String id;

  /** The severity level of the event. */
  @JsonProperty("level")
  private EventLevel level;

  /** Maturity level for event_type. */
  @JsonProperty("maturity_level")
  private MaturityLevel maturityLevel;

  /** The display message associated with the event. */
  @JsonProperty("message")
  private String message;

  /** Describes where the event originates from. */
  @JsonProperty("origin")
  private Origin origin;

  /** A sequencing object to identify and order events. */
  @JsonProperty("sequence")
  private Sequencing sequence;

  /** The time of the event. */
  @JsonProperty("timestamp")
  private String timestamp;

  /**
   * <p>Setter for the field <code>error</code>.</p>
   *
   * @param error a {@link com.databricks.sdk.service.pipelines.ErrorDetail} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setError(ErrorDetail error) {
    this.error = error;
    return this;
  }

  /**
   * <p>Getter for the field <code>error</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.ErrorDetail} object
   */
  public ErrorDetail getError() {
    return error;
  }

  /**
   * <p>Setter for the field <code>eventType</code>.</p>
   *
   * @param eventType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * <p>Getter for the field <code>eventType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEventType() {
    return eventType;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>level</code>.</p>
   *
   * @param level a {@link com.databricks.sdk.service.pipelines.EventLevel} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setLevel(EventLevel level) {
    this.level = level;
    return this;
  }

  /**
   * <p>Getter for the field <code>level</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.EventLevel} object
   */
  public EventLevel getLevel() {
    return level;
  }

  /**
   * <p>Setter for the field <code>maturityLevel</code>.</p>
   *
   * @param maturityLevel a {@link com.databricks.sdk.service.pipelines.MaturityLevel} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setMaturityLevel(MaturityLevel maturityLevel) {
    this.maturityLevel = maturityLevel;
    return this;
  }

  /**
   * <p>Getter for the field <code>maturityLevel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.MaturityLevel} object
   */
  public MaturityLevel getMaturityLevel() {
    return maturityLevel;
  }

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setMessage(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Getter for the field <code>message</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /**
   * <p>Setter for the field <code>origin</code>.</p>
   *
   * @param origin a {@link com.databricks.sdk.service.pipelines.Origin} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setOrigin(Origin origin) {
    this.origin = origin;
    return this;
  }

  /**
   * <p>Getter for the field <code>origin</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.Origin} object
   */
  public Origin getOrigin() {
    return origin;
  }

  /**
   * <p>Setter for the field <code>sequence</code>.</p>
   *
   * @param sequence a {@link com.databricks.sdk.service.pipelines.Sequencing} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setSequence(Sequencing sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * <p>Getter for the field <code>sequence</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.Sequencing} object
   */
  public Sequencing getSequence() {
    return sequence;
  }

  /**
   * <p>Setter for the field <code>timestamp</code>.</p>
   *
   * @param timestamp a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineEvent} object
   */
  public PipelineEvent setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>timestamp</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTimestamp() {
    return timestamp;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineEvent that = (PipelineEvent) o;
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        error, eventType, id, level, maturityLevel, message, origin, sequence, timestamp);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PipelineEvent.class)
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
