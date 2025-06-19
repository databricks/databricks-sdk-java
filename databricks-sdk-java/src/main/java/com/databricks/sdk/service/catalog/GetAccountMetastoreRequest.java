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

/** Get a metastore */
@Generated
@JsonSerialize(using = GetAccountMetastoreRequest.GetAccountMetastoreRequestSerializer.class)
@JsonDeserialize(using = GetAccountMetastoreRequest.GetAccountMetastoreRequestDeserializer.class)
public class GetAccountMetastoreRequest {
  /** Unity Catalog metastore ID */
  private String metastoreId;

  public GetAccountMetastoreRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountMetastoreRequest that = (GetAccountMetastoreRequest) o;
    return Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountMetastoreRequest.class)
        .add("metastoreId", metastoreId)
        .toString();
  }

  GetAccountMetastoreRequestPb toPb() {
    GetAccountMetastoreRequestPb pb = new GetAccountMetastoreRequestPb();
    pb.setMetastoreId(metastoreId);

    return pb;
  }

  static GetAccountMetastoreRequest fromPb(GetAccountMetastoreRequestPb pb) {
    GetAccountMetastoreRequest model = new GetAccountMetastoreRequest();
    model.setMetastoreId(pb.getMetastoreId());

    return model;
  }

  public static class GetAccountMetastoreRequestSerializer
      extends JsonSerializer<GetAccountMetastoreRequest> {
    @Override
    public void serialize(
        GetAccountMetastoreRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAccountMetastoreRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAccountMetastoreRequestDeserializer
      extends JsonDeserializer<GetAccountMetastoreRequest> {
    @Override
    public GetAccountMetastoreRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAccountMetastoreRequestPb pb = mapper.readValue(p, GetAccountMetastoreRequestPb.class);
      return GetAccountMetastoreRequest.fromPb(pb);
    }
  }
}
