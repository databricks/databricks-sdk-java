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

/** Get status */
@Generated
@JsonSerialize(using = ContextStatusRequest.ContextStatusRequestSerializer.class)
@JsonDeserialize(using = ContextStatusRequest.ContextStatusRequestDeserializer.class)
public class ContextStatusRequest {
  /** */
  private String clusterId;

  /** */
  private String contextId;

  public ContextStatusRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ContextStatusRequest setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  public String getContextId() {
    return contextId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextStatusRequest that = (ContextStatusRequest) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(contextId, that.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, contextId);
  }

  @Override
  public String toString() {
    return new ToStringer(ContextStatusRequest.class)
        .add("clusterId", clusterId)
        .add("contextId", contextId)
        .toString();
  }

  ContextStatusRequestPb toPb() {
    ContextStatusRequestPb pb = new ContextStatusRequestPb();
    pb.setClusterId(clusterId);
    pb.setContextId(contextId);

    return pb;
  }

  static ContextStatusRequest fromPb(ContextStatusRequestPb pb) {
    ContextStatusRequest model = new ContextStatusRequest();
    model.setClusterId(pb.getClusterId());
    model.setContextId(pb.getContextId());

    return model;
  }

  public static class ContextStatusRequestSerializer extends JsonSerializer<ContextStatusRequest> {
    @Override
    public void serialize(
        ContextStatusRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ContextStatusRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ContextStatusRequestDeserializer
      extends JsonDeserializer<ContextStatusRequest> {
    @Override
    public ContextStatusRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ContextStatusRequestPb pb = mapper.readValue(p, ContextStatusRequestPb.class);
      return ContextStatusRequest.fromPb(pb);
    }
  }
}
