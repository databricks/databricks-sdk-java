// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Get catalog workspace bindings */
@Generated
@JsonSerialize(using = GetWorkspaceBindingRequest.GetWorkspaceBindingRequestSerializer.class)
@JsonDeserialize(using = GetWorkspaceBindingRequest.GetWorkspaceBindingRequestDeserializer.class)
public class GetWorkspaceBindingRequest {
  /** The name of the catalog. */
  private String name;

  public GetWorkspaceBindingRequest setName(String name) {
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
    GetWorkspaceBindingRequest that = (GetWorkspaceBindingRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceBindingRequest.class).add("name", name).toString();
  }

  GetWorkspaceBindingRequestPb toPb() {
    GetWorkspaceBindingRequestPb pb = new GetWorkspaceBindingRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetWorkspaceBindingRequest fromPb(GetWorkspaceBindingRequestPb pb) {
    GetWorkspaceBindingRequest model = new GetWorkspaceBindingRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetWorkspaceBindingRequestSerializer
      extends JsonSerializer<GetWorkspaceBindingRequest> {
    @Override
    public void serialize(
        GetWorkspaceBindingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetWorkspaceBindingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWorkspaceBindingRequestDeserializer
      extends JsonDeserializer<GetWorkspaceBindingRequest> {
    @Override
    public GetWorkspaceBindingRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWorkspaceBindingRequestPb pb = mapper.readValue(p, GetWorkspaceBindingRequestPb.class);
      return GetWorkspaceBindingRequest.fromPb(pb);
    }
  }
}
