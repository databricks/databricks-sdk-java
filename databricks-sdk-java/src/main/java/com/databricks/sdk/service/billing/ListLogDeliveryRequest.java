// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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

/** Get all log delivery configurations */
@Generated
@JsonSerialize(using = ListLogDeliveryRequest.ListLogDeliveryRequestSerializer.class)
@JsonDeserialize(using = ListLogDeliveryRequest.ListLogDeliveryRequestDeserializer.class)
public class ListLogDeliveryRequest {
  /** Filter by credential configuration ID. */
  private String credentialsId;

  /** Filter by status `ENABLED` or `DISABLED`. */
  private LogDeliveryConfigStatus status;

  /** Filter by storage configuration ID. */
  private String storageConfigurationId;

  public ListLogDeliveryRequest setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public ListLogDeliveryRequest setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  public ListLogDeliveryRequest setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListLogDeliveryRequest that = (ListLogDeliveryRequest) o;
    return Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(status, that.status)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialsId, status, storageConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListLogDeliveryRequest.class)
        .add("credentialsId", credentialsId)
        .add("status", status)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }

  ListLogDeliveryRequestPb toPb() {
    ListLogDeliveryRequestPb pb = new ListLogDeliveryRequestPb();
    pb.setCredentialsId(credentialsId);
    pb.setStatus(status);
    pb.setStorageConfigurationId(storageConfigurationId);

    return pb;
  }

  static ListLogDeliveryRequest fromPb(ListLogDeliveryRequestPb pb) {
    ListLogDeliveryRequest model = new ListLogDeliveryRequest();
    model.setCredentialsId(pb.getCredentialsId());
    model.setStatus(pb.getStatus());
    model.setStorageConfigurationId(pb.getStorageConfigurationId());

    return model;
  }

  public static class ListLogDeliveryRequestSerializer
      extends JsonSerializer<ListLogDeliveryRequest> {
    @Override
    public void serialize(
        ListLogDeliveryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListLogDeliveryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListLogDeliveryRequestDeserializer
      extends JsonDeserializer<ListLogDeliveryRequest> {
    @Override
    public ListLogDeliveryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListLogDeliveryRequestPb pb = mapper.readValue(p, ListLogDeliveryRequestPb.class);
      return ListLogDeliveryRequest.fromPb(pb);
    }
  }
}
