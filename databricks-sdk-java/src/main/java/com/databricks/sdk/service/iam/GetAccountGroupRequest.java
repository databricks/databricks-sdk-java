// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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

/** Get group details. */
@Generated
@JsonSerialize(using = GetAccountGroupRequest.GetAccountGroupRequestSerializer.class)
@JsonDeserialize(using = GetAccountGroupRequest.GetAccountGroupRequestDeserializer.class)
public class GetAccountGroupRequest {
  /** Unique ID for a group in the Databricks account. */
  private String id;

  public GetAccountGroupRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountGroupRequest that = (GetAccountGroupRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountGroupRequest.class).add("id", id).toString();
  }

  GetAccountGroupRequestPb toPb() {
    GetAccountGroupRequestPb pb = new GetAccountGroupRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetAccountGroupRequest fromPb(GetAccountGroupRequestPb pb) {
    GetAccountGroupRequest model = new GetAccountGroupRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetAccountGroupRequestSerializer
      extends JsonSerializer<GetAccountGroupRequest> {
    @Override
    public void serialize(
        GetAccountGroupRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAccountGroupRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAccountGroupRequestDeserializer
      extends JsonDeserializer<GetAccountGroupRequest> {
    @Override
    public GetAccountGroupRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAccountGroupRequestPb pb = mapper.readValue(p, GetAccountGroupRequestPb.class);
      return GetAccountGroupRequest.fromPb(pb);
    }
  }
}
