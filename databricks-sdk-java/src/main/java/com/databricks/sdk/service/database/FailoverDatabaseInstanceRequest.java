// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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
@JsonSerialize(
    using = FailoverDatabaseInstanceRequest.FailoverDatabaseInstanceRequestSerializer.class)
@JsonDeserialize(
    using = FailoverDatabaseInstanceRequest.FailoverDatabaseInstanceRequestDeserializer.class)
public class FailoverDatabaseInstanceRequest {
  /** */
  private String failoverTargetDatabaseInstanceName;

  /** Name of the instance to failover. */
  private String name;

  public FailoverDatabaseInstanceRequest setFailoverTargetDatabaseInstanceName(
      String failoverTargetDatabaseInstanceName) {
    this.failoverTargetDatabaseInstanceName = failoverTargetDatabaseInstanceName;
    return this;
  }

  public String getFailoverTargetDatabaseInstanceName() {
    return failoverTargetDatabaseInstanceName;
  }

  public FailoverDatabaseInstanceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FailoverDatabaseInstanceRequest that = (FailoverDatabaseInstanceRequest) o;
    return Objects.equals(
            failoverTargetDatabaseInstanceName, that.failoverTargetDatabaseInstanceName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failoverTargetDatabaseInstanceName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(FailoverDatabaseInstanceRequest.class)
        .add("failoverTargetDatabaseInstanceName", failoverTargetDatabaseInstanceName)
        .add("name", name)
        .toString();
  }

  FailoverDatabaseInstanceRequestPb toPb() {
    FailoverDatabaseInstanceRequestPb pb = new FailoverDatabaseInstanceRequestPb();
    pb.setFailoverTargetDatabaseInstanceName(failoverTargetDatabaseInstanceName);
    pb.setName(name);

    return pb;
  }

  static FailoverDatabaseInstanceRequest fromPb(FailoverDatabaseInstanceRequestPb pb) {
    FailoverDatabaseInstanceRequest model = new FailoverDatabaseInstanceRequest();
    model.setFailoverTargetDatabaseInstanceName(pb.getFailoverTargetDatabaseInstanceName());
    model.setName(pb.getName());

    return model;
  }

  public static class FailoverDatabaseInstanceRequestSerializer
      extends JsonSerializer<FailoverDatabaseInstanceRequest> {
    @Override
    public void serialize(
        FailoverDatabaseInstanceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FailoverDatabaseInstanceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FailoverDatabaseInstanceRequestDeserializer
      extends JsonDeserializer<FailoverDatabaseInstanceRequest> {
    @Override
    public FailoverDatabaseInstanceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FailoverDatabaseInstanceRequestPb pb =
          mapper.readValue(p, FailoverDatabaseInstanceRequestPb.class);
      return FailoverDatabaseInstanceRequest.fromPb(pb);
    }
  }
}
