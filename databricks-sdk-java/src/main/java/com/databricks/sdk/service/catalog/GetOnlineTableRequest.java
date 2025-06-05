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

/** Get an Online Table */
@Generated
@JsonSerialize(using = GetOnlineTableRequest.GetOnlineTableRequestSerializer.class)
@JsonDeserialize(using = GetOnlineTableRequest.GetOnlineTableRequestDeserializer.class)
public class GetOnlineTableRequest {
  /** Full three-part (catalog, schema, table) name of the table. */
  private String name;

  public GetOnlineTableRequest setName(String name) {
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
    GetOnlineTableRequest that = (GetOnlineTableRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetOnlineTableRequest.class).add("name", name).toString();
  }

  GetOnlineTableRequestPb toPb() {
    GetOnlineTableRequestPb pb = new GetOnlineTableRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetOnlineTableRequest fromPb(GetOnlineTableRequestPb pb) {
    GetOnlineTableRequest model = new GetOnlineTableRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetOnlineTableRequestSerializer
      extends JsonSerializer<GetOnlineTableRequest> {
    @Override
    public void serialize(
        GetOnlineTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetOnlineTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetOnlineTableRequestDeserializer
      extends JsonDeserializer<GetOnlineTableRequest> {
    @Override
    public GetOnlineTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetOnlineTableRequestPb pb = mapper.readValue(p, GetOnlineTableRequestPb.class);
      return GetOnlineTableRequest.fromPb(pb);
    }
  }
}
