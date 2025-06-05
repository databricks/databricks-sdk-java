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

/** Get access list */
@Generated
@JsonSerialize(using = GetIpAccessListRequest.GetIpAccessListRequestSerializer.class)
@JsonDeserialize(using = GetIpAccessListRequest.GetIpAccessListRequestDeserializer.class)
public class GetIpAccessListRequest {
  /** The ID for the corresponding IP access list */
  private String ipAccessListId;

  public GetIpAccessListRequest setIpAccessListId(String ipAccessListId) {
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
    GetIpAccessListRequest that = (GetIpAccessListRequest) o;
    return Objects.equals(ipAccessListId, that.ipAccessListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessListId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIpAccessListRequest.class)
        .add("ipAccessListId", ipAccessListId)
        .toString();
  }

  GetIpAccessListRequestPb toPb() {
    GetIpAccessListRequestPb pb = new GetIpAccessListRequestPb();
    pb.setIpAccessListId(ipAccessListId);

    return pb;
  }

  static GetIpAccessListRequest fromPb(GetIpAccessListRequestPb pb) {
    GetIpAccessListRequest model = new GetIpAccessListRequest();
    model.setIpAccessListId(pb.getIpAccessListId());

    return model;
  }

  public static class GetIpAccessListRequestSerializer
      extends JsonSerializer<GetIpAccessListRequest> {
    @Override
    public void serialize(
        GetIpAccessListRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetIpAccessListRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetIpAccessListRequestDeserializer
      extends JsonDeserializer<GetIpAccessListRequest> {
    @Override
    public GetIpAccessListRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetIpAccessListRequestPb pb = mapper.readValue(p, GetIpAccessListRequestPb.class);
      return GetIpAccessListRequest.fromPb(pb);
    }
  }
}
