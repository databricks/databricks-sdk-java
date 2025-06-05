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

/** Get listing */
@Generated
@JsonSerialize(using = GetListingRequest.GetListingRequestSerializer.class)
@JsonDeserialize(using = GetListingRequest.GetListingRequestDeserializer.class)
public class GetListingRequest {
  /** */
  private String id;

  public GetListingRequest setId(String id) {
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
    GetListingRequest that = (GetListingRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingRequest.class).add("id", id).toString();
  }

  GetListingRequestPb toPb() {
    GetListingRequestPb pb = new GetListingRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetListingRequest fromPb(GetListingRequestPb pb) {
    GetListingRequest model = new GetListingRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetListingRequestSerializer extends JsonSerializer<GetListingRequest> {
    @Override
    public void serialize(GetListingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetListingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetListingRequestDeserializer extends JsonDeserializer<GetListingRequest> {
    @Override
    public GetListingRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetListingRequestPb pb = mapper.readValue(p, GetListingRequestPb.class);
      return GetListingRequest.fromPb(pb);
    }
  }
}
