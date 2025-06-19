// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = PipelineEvent.PipelineEventSerializer.class)
@JsonDeserialize(using = PipelineEvent.PipelineEventDeserializer.class)
public class PipelineEvent {
  /** Information about an error captured by the event. */
  private ErrorDetail error;

  /** The event type. Should always correspond to the details */
  private String eventType;

  /** A time-based, globally unique id. */
  private String id;

  /** The severity level of the event. */
  private EventLevel level;

  /** Maturity level for event_type. */
  private MaturityLevel maturityLevel;

  /** The display message associated with the event. */
  private String message;

  /** Describes where the event originates from. */
  private Origin origin;

  /** A sequencing object to identify and order events. */
  private Sequencing sequence;

  /** The time of the event. */
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

  @Override
  public int hashCode() {
    return Objects.hash(
        error, eventType, id, level, maturityLevel, message, origin, sequence, timestamp);
  }

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

  PipelineEventPb toPb() {
    PipelineEventPb pb = new PipelineEventPb();
    pb.setError(error);
    pb.setEventType(eventType);
    pb.setId(id);
    pb.setLevel(level);
    pb.setMaturityLevel(maturityLevel);
    pb.setMessage(message);
    pb.setOrigin(origin);
    pb.setSequence(sequence);
    pb.setTimestamp(timestamp);

    return pb;
  }

  static PipelineEvent fromPb(PipelineEventPb pb) {
    PipelineEvent model = new PipelineEvent();
    model.setError(pb.getError());
    model.setEventType(pb.getEventType());
    model.setId(pb.getId());
    model.setLevel(pb.getLevel());
    model.setMaturityLevel(pb.getMaturityLevel());
    model.setMessage(pb.getMessage());
    model.setOrigin(pb.getOrigin());
    model.setSequence(pb.getSequence());
    model.setTimestamp(pb.getTimestamp());

    return model;
  }

  public static class PipelineEventSerializer extends JsonSerializer<PipelineEvent> {
    @Override
    public void serialize(PipelineEvent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineEventPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineEventDeserializer extends JsonDeserializer<PipelineEvent> {
    @Override
    public PipelineEvent deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineEventPb pb = mapper.readValue(p, PipelineEventPb.class);
      return PipelineEvent.fromPb(pb);
    }
  }
}
