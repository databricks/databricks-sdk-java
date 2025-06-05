// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Get IP access list */
@Generated
@JsonSerialize(using = GetAccountIpAccessListRequest.GetAccountIpAccessListRequestSerializer.class)
@JsonDeserialize(
    using = GetAccountIpAccessListRequest.GetAccountIpAccessListRequestDeserializer.class)
public class GetAccountIpAccessListRequest {
  /** The ID for the corresponding IP access list */
  private String ipAccessListId;

  public GetAccountIpAccessListRequest setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  public String getIpAccessListId() {
    return ipAccessListId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountIpAccessListRequest that = (GetAccountIpAccessListRequest) o;
    return Objects.equals(ipAccessListId, that.ipAccessListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessListId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountIpAccessListRequest.class)
        .add("ipAccessListId", ipAccessListId)
        .toString();
  }

  GetAccountIpAccessListRequestPb toPb() {
    GetAccountIpAccessListRequestPb pb = new GetAccountIpAccessListRequestPb();
    pb.setIpAccessListId(ipAccessListId);

    return pb;
  }

  static GetAccountIpAccessListRequest fromPb(GetAccountIpAccessListRequestPb pb) {
    GetAccountIpAccessListRequest model = new GetAccountIpAccessListRequest();
    model.setIpAccessListId(pb.getIpAccessListId());

    return model;
  }

  public static class GetAccountIpAccessListRequestSerializer
      extends JsonSerializer<GetAccountIpAccessListRequest> {
    @Override
    public void serialize(
        GetAccountIpAccessListRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAccountIpAccessListRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAccountIpAccessListRequestDeserializer
      extends JsonDeserializer<GetAccountIpAccessListRequest> {
    @Override
    public GetAccountIpAccessListRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAccountIpAccessListRequestPb pb =
          mapper.readValue(p, GetAccountIpAccessListRequestPb.class);
      return GetAccountIpAccessListRequest.fromPb(pb);
    }
  }
}
