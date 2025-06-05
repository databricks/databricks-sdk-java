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
@JsonSerialize(using = DataPlaneEventDetails.DataPlaneEventDetailsSerializer.class)
@JsonDeserialize(using = DataPlaneEventDetails.DataPlaneEventDetailsDeserializer.class)
public class DataPlaneEventDetails {
  /** */
  private DataPlaneEventDetailsEventType eventType;

  /** */
  private Long executorFailures;

  /** */
  private String hostId;

  /** */
  private Long timestamp;

  public DataPlaneEventDetails setEventType(DataPlaneEventDetailsEventType eventType) {
    this.eventType = eventType;
    return this;
  }

  public DataPlaneEventDetailsEventType getEventType() {
    return eventType;
  }

  public DataPlaneEventDetails setExecutorFailures(Long executorFailures) {
    this.executorFailures = executorFailures;
    return this;
  }

  public Long getExecutorFailures() {
    return executorFailures;
  }

  public DataPlaneEventDetails setHostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  public String getHostId() {
    return hostId;
  }

  public DataPlaneEventDetails setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneEventDetails that = (DataPlaneEventDetails) o;
    return Objects.equals(eventType, that.eventType)
        && Objects.equals(executorFailures, that.executorFailures)
        && Objects.equals(hostId, that.hostId)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, executorFailures, hostId, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneEventDetails.class)
        .add("eventType", eventType)
        .add("executorFailures", executorFailures)
        .add("hostId", hostId)
        .add("timestamp", timestamp)
        .toString();
  }

  DataPlaneEventDetailsPb toPb() {
    DataPlaneEventDetailsPb pb = new DataPlaneEventDetailsPb();
    pb.setEventType(eventType);
    pb.setExecutorFailures(executorFailures);
    pb.setHostId(hostId);
    pb.setTimestamp(timestamp);

    return pb;
  }

  static DataPlaneEventDetails fromPb(DataPlaneEventDetailsPb pb) {
    DataPlaneEventDetails model = new DataPlaneEventDetails();
    model.setEventType(pb.getEventType());
    model.setExecutorFailures(pb.getExecutorFailures());
    model.setHostId(pb.getHostId());
    model.setTimestamp(pb.getTimestamp());

    return model;
  }

  public static class DataPlaneEventDetailsSerializer
      extends JsonSerializer<DataPlaneEventDetails> {
    @Override
    public void serialize(
        DataPlaneEventDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DataPlaneEventDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DataPlaneEventDetailsDeserializer
      extends JsonDeserializer<DataPlaneEventDetails> {
    @Override
    public DataPlaneEventDetails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DataPlaneEventDetailsPb pb = mapper.readValue(p, DataPlaneEventDetailsPb.class);
      return DataPlaneEventDetails.fromPb(pb);
    }
  }
}
