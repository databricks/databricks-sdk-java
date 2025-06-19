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
@JsonSerialize(using = CreateInstancePoolResponse.CreateInstancePoolResponseSerializer.class)
@JsonDeserialize(using = CreateInstancePoolResponse.CreateInstancePoolResponseDeserializer.class)
public class CreateInstancePoolResponse {
  /** The ID of the created instance pool. */
  private String instancePoolId;

  public CreateInstancePoolResponse setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateInstancePoolResponse that = (CreateInstancePoolResponse) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateInstancePoolResponse.class)
        .add("instancePoolId", instancePoolId)
        .toString();
  }

  CreateInstancePoolResponsePb toPb() {
    CreateInstancePoolResponsePb pb = new CreateInstancePoolResponsePb();
    pb.setInstancePoolId(instancePoolId);

    return pb;
  }

  static CreateInstancePoolResponse fromPb(CreateInstancePoolResponsePb pb) {
    CreateInstancePoolResponse model = new CreateInstancePoolResponse();
    model.setInstancePoolId(pb.getInstancePoolId());

    return model;
  }

  public static class CreateInstancePoolResponseSerializer
      extends JsonSerializer<CreateInstancePoolResponse> {
    @Override
    public void serialize(
        CreateInstancePoolResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateInstancePoolResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateInstancePoolResponseDeserializer
      extends JsonDeserializer<CreateInstancePoolResponse> {
    @Override
    public CreateInstancePoolResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateInstancePoolResponsePb pb = mapper.readValue(p, CreateInstancePoolResponsePb.class);
      return CreateInstancePoolResponse.fromPb(pb);
    }
  }
}
