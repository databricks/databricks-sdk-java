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
@JsonSerialize(using = GetGroupRequest.GetGroupRequestSerializer.class)
@JsonDeserialize(using = GetGroupRequest.GetGroupRequestDeserializer.class)
public class GetGroupRequest {
  /** Unique ID for a group in the Databricks workspace. */
  private String id;

  public GetGroupRequest setId(String id) {
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
    GetGroupRequest that = (GetGroupRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetGroupRequest.class).add("id", id).toString();
  }

  GetGroupRequestPb toPb() {
    GetGroupRequestPb pb = new GetGroupRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetGroupRequest fromPb(GetGroupRequestPb pb) {
    GetGroupRequest model = new GetGroupRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetGroupRequestSerializer extends JsonSerializer<GetGroupRequest> {
    @Override
    public void serialize(GetGroupRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetGroupRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetGroupRequestDeserializer extends JsonDeserializer<GetGroupRequest> {
    @Override
    public GetGroupRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetGroupRequestPb pb = mapper.readValue(p, GetGroupRequestPb.class);
      return GetGroupRequest.fromPb(pb);
    }
  }
}
