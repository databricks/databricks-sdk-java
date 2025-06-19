// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** Get a share recipient */
@Generated
@JsonSerialize(using = GetRecipientRequest.GetRecipientRequestSerializer.class)
@JsonDeserialize(using = GetRecipientRequest.GetRecipientRequestDeserializer.class)
public class GetRecipientRequest {
  /** Name of the recipient. */
  private String name;

  public GetRecipientRequest setName(String name) {
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
    GetRecipientRequest that = (GetRecipientRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRecipientRequest.class).add("name", name).toString();
  }

  GetRecipientRequestPb toPb() {
    GetRecipientRequestPb pb = new GetRecipientRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetRecipientRequest fromPb(GetRecipientRequestPb pb) {
    GetRecipientRequest model = new GetRecipientRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetRecipientRequestSerializer extends JsonSerializer<GetRecipientRequest> {
    @Override
    public void serialize(GetRecipientRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRecipientRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRecipientRequestDeserializer
      extends JsonDeserializer<GetRecipientRequest> {
    @Override
    public GetRecipientRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRecipientRequestPb pb = mapper.readValue(p, GetRecipientRequestPb.class);
      return GetRecipientRequest.fromPb(pb);
    }
  }
}
