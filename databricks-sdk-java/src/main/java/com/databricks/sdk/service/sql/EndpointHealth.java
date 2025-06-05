// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = EndpointHealth.EndpointHealthSerializer.class)
@JsonDeserialize(using = EndpointHealth.EndpointHealthDeserializer.class)
public class EndpointHealth {
  /** Details about errors that are causing current degraded/failed status. */
  private String details;

  /**
   * The reason for failure to bring up clusters for this warehouse. This is available when status
   * is 'FAILED' and sometimes when it is DEGRADED.
   */
  private TerminationReason failureReason;

  /** Deprecated. split into summary and details for security */
  private String message;

  /** Health status of the warehouse. */
  private Status status;

  /** A short summary of the health status in case of degraded/failed warehouses. */
  private String summary;

  public EndpointHealth setDetails(String details) {
    this.details = details;
    return this;
  }

  public String getDetails() {
    return details;
  }

  public EndpointHealth setFailureReason(TerminationReason failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  public TerminationReason getFailureReason() {
    return failureReason;
  }

  public EndpointHealth setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public EndpointHealth setStatus(Status status) {
    this.status = status;
    return this;
  }

  public Status getStatus() {
    return status;
  }

  public EndpointHealth setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public String getSummary() {
    return summary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointHealth that = (EndpointHealth) o;
    return Objects.equals(details, that.details)
        && Objects.equals(failureReason, that.failureReason)
        && Objects.equals(message, that.message)
        && Objects.equals(status, that.status)
        && Objects.equals(summary, that.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, failureReason, message, status, summary);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointHealth.class)
        .add("details", details)
        .add("failureReason", failureReason)
        .add("message", message)
        .add("status", status)
        .add("summary", summary)
        .toString();
  }

  EndpointHealthPb toPb() {
    EndpointHealthPb pb = new EndpointHealthPb();
    pb.setDetails(details);
    pb.setFailureReason(failureReason);
    pb.setMessage(message);
    pb.setStatus(status);
    pb.setSummary(summary);

    return pb;
  }

  static EndpointHealth fromPb(EndpointHealthPb pb) {
    EndpointHealth model = new EndpointHealth();
    model.setDetails(pb.getDetails());
    model.setFailureReason(pb.getFailureReason());
    model.setMessage(pb.getMessage());
    model.setStatus(pb.getStatus());
    model.setSummary(pb.getSummary());

    return model;
  }

  public static class EndpointHealthSerializer extends JsonSerializer<EndpointHealth> {
    @Override
    public void serialize(EndpointHealth value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointHealthPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointHealthDeserializer extends JsonDeserializer<EndpointHealth> {
    @Override
    public EndpointHealth deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointHealthPb pb = mapper.readValue(p, EndpointHealthPb.class);
      return EndpointHealth.fromPb(pb);
    }
  }
}
