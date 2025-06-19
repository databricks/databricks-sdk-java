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
import java.util.Collection;
import java.util.Objects;

/** Generates a credential that can be used to access database instances */
@Generated
@JsonSerialize(
    using = GenerateDatabaseCredentialRequest.GenerateDatabaseCredentialRequestSerializer.class)
@JsonDeserialize(
    using = GenerateDatabaseCredentialRequest.GenerateDatabaseCredentialRequestDeserializer.class)
public class GenerateDatabaseCredentialRequest {
  /** Instances to which the token will be scoped. */
  private Collection<String> instanceNames;

  /** */
  private String requestId;

  public GenerateDatabaseCredentialRequest setInstanceNames(Collection<String> instanceNames) {
    this.instanceNames = instanceNames;
    return this;
  }

  public Collection<String> getInstanceNames() {
    return instanceNames;
  }

  public GenerateDatabaseCredentialRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateDatabaseCredentialRequest that = (GenerateDatabaseCredentialRequest) o;
    return Objects.equals(instanceNames, that.instanceNames)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceNames, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateDatabaseCredentialRequest.class)
        .add("instanceNames", instanceNames)
        .add("requestId", requestId)
        .toString();
  }

  GenerateDatabaseCredentialRequestPb toPb() {
    GenerateDatabaseCredentialRequestPb pb = new GenerateDatabaseCredentialRequestPb();
    pb.setInstanceNames(instanceNames);
    pb.setRequestId(requestId);

    return pb;
  }

  static GenerateDatabaseCredentialRequest fromPb(GenerateDatabaseCredentialRequestPb pb) {
    GenerateDatabaseCredentialRequest model = new GenerateDatabaseCredentialRequest();
    model.setInstanceNames(pb.getInstanceNames());
    model.setRequestId(pb.getRequestId());

    return model;
  }

  public static class GenerateDatabaseCredentialRequestSerializer
      extends JsonSerializer<GenerateDatabaseCredentialRequest> {
    @Override
    public void serialize(
        GenerateDatabaseCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenerateDatabaseCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenerateDatabaseCredentialRequestDeserializer
      extends JsonDeserializer<GenerateDatabaseCredentialRequest> {
    @Override
    public GenerateDatabaseCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenerateDatabaseCredentialRequestPb pb =
          mapper.readValue(p, GenerateDatabaseCredentialRequestPb.class);
      return GenerateDatabaseCredentialRequest.fromPb(pb);
    }
  }
}
