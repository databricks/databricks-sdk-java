// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ClusterEvent.ClusterEventSerializer.class)
@JsonDeserialize(using = ClusterEvent.ClusterEventDeserializer.class)
public class ClusterEvent {
  /** */
  private String clusterId;

  /** */
  private DataPlaneEventDetails dataPlaneEventDetails;

  /** */
  private EventDetails details;

  /**
   * The timestamp when the event occurred, stored as the number of milliseconds since the Unix
   * epoch. If not provided, this will be assigned by the Timeline service.
   */
  private Long timestamp;

  /** */
  private EventType typeValue;

  public ClusterEvent setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterEvent setDataPlaneEventDetails(DataPlaneEventDetails dataPlaneEventDetails) {
    this.dataPlaneEventDetails = dataPlaneEventDetails;
    return this;
  }

  public DataPlaneEventDetails getDataPlaneEventDetails() {
    return dataPlaneEventDetails;
  }

  public ClusterEvent setDetails(EventDetails details) {
    this.details = details;
    return this;
  }

  public EventDetails getDetails() {
    return details;
  }

  public ClusterEvent setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public ClusterEvent setType(EventType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public EventType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterEvent that = (ClusterEvent) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(dataPlaneEventDetails, that.dataPlaneEventDetails)
        && Objects.equals(details, that.details)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dataPlaneEventDetails, details, timestamp, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterEvent.class)
        .add("clusterId", clusterId)
        .add("dataPlaneEventDetails", dataPlaneEventDetails)
        .add("details", details)
        .add("timestamp", timestamp)
        .add("typeValue", typeValue)
        .toString();
  }

  ClusterEventPb toPb() {
    ClusterEventPb pb = new ClusterEventPb();
    pb.setClusterId(clusterId);
    pb.setDataPlaneEventDetails(dataPlaneEventDetails);
    pb.setDetails(details);
    pb.setTimestamp(timestamp);
    pb.setType(typeValue);

    return pb;
  }

  static ClusterEvent fromPb(ClusterEventPb pb) {
    ClusterEvent model = new ClusterEvent();
    model.setClusterId(pb.getClusterId());
    model.setDataPlaneEventDetails(pb.getDataPlaneEventDetails());
    model.setDetails(pb.getDetails());
    model.setTimestamp(pb.getTimestamp());
    model.setType(pb.getType());

    return model;
  }

  public static class ClusterEventSerializer extends JsonSerializer<ClusterEvent> {
    @Override
    public void serialize(ClusterEvent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterEventPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterEventDeserializer extends JsonDeserializer<ClusterEvent> {
    @Override
    public ClusterEvent deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterEventPb pb = mapper.readValue(p, ClusterEventPb.class);
      return ClusterEvent.fromPb(pb);
    }
  }
}
