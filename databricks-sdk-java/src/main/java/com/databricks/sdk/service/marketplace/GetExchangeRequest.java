// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** Get an exchange */
@Generated
@JsonSerialize(using = GetExchangeRequest.GetExchangeRequestSerializer.class)
@JsonDeserialize(using = GetExchangeRequest.GetExchangeRequestDeserializer.class)
public class GetExchangeRequest {
  /** */
  private String id;

  public GetExchangeRequest setId(String id) {
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
    GetExchangeRequest that = (GetExchangeRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExchangeRequest.class).add("id", id).toString();
  }

  GetExchangeRequestPb toPb() {
    GetExchangeRequestPb pb = new GetExchangeRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetExchangeRequest fromPb(GetExchangeRequestPb pb) {
    GetExchangeRequest model = new GetExchangeRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetExchangeRequestSerializer extends JsonSerializer<GetExchangeRequest> {
    @Override
    public void serialize(GetExchangeRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetExchangeRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetExchangeRequestDeserializer extends JsonDeserializer<GetExchangeRequest> {
    @Override
    public GetExchangeRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetExchangeRequestPb pb = mapper.readValue(p, GetExchangeRequestPb.class);
      return GetExchangeRequest.fromPb(pb);
    }
  }
}
