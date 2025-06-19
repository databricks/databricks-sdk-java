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
@JsonSerialize(using = DestroyContext.DestroyContextSerializer.class)
@JsonDeserialize(using = DestroyContext.DestroyContextDeserializer.class)
public class DestroyContext {
  /** */
  private String clusterId;

  /** */
  private String contextId;

  public DestroyContext setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public DestroyContext setContextId(String contextId) {
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
    DestroyContext that = (DestroyContext) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(contextId, that.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, contextId);
  }

  @Override
  public String toString() {
    return new ToStringer(DestroyContext.class)
        .add("clusterId", clusterId)
        .add("contextId", contextId)
        .toString();
  }

  DestroyContextPb toPb() {
    DestroyContextPb pb = new DestroyContextPb();
    pb.setClusterId(clusterId);
    pb.setContextId(contextId);

    return pb;
  }

  static DestroyContext fromPb(DestroyContextPb pb) {
    DestroyContext model = new DestroyContext();
    model.setClusterId(pb.getClusterId());
    model.setContextId(pb.getContextId());

    return model;
  }

  public static class DestroyContextSerializer extends JsonSerializer<DestroyContext> {
    @Override
    public void serialize(DestroyContext value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DestroyContextPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DestroyContextDeserializer extends JsonDeserializer<DestroyContext> {
    @Override
    public DestroyContext deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DestroyContextPb pb = mapper.readValue(p, DestroyContextPb.class);
      return DestroyContext.fromPb(pb);
    }
  }
}
