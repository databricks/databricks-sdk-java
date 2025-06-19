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

@Generated
@JsonSerialize(using = GetIpAccessListResponse.GetIpAccessListResponseSerializer.class)
@JsonDeserialize(using = GetIpAccessListResponse.GetIpAccessListResponseDeserializer.class)
public class GetIpAccessListResponse {
  /** Definition of an IP Access list */
  private IpAccessListInfo ipAccessList;

  public GetIpAccessListResponse setIpAccessList(IpAccessListInfo ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessListInfo getIpAccessList() {
    return ipAccessList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIpAccessListResponse that = (GetIpAccessListResponse) o;
    return Objects.equals(ipAccessList, that.ipAccessList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessList);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIpAccessListResponse.class)
        .add("ipAccessList", ipAccessList)
        .toString();
  }

  GetIpAccessListResponsePb toPb() {
    GetIpAccessListResponsePb pb = new GetIpAccessListResponsePb();
    pb.setIpAccessList(ipAccessList);

    return pb;
  }

  static GetIpAccessListResponse fromPb(GetIpAccessListResponsePb pb) {
    GetIpAccessListResponse model = new GetIpAccessListResponse();
    model.setIpAccessList(pb.getIpAccessList());

    return model;
  }

  public static class GetIpAccessListResponseSerializer
      extends JsonSerializer<GetIpAccessListResponse> {
    @Override
    public void serialize(
        GetIpAccessListResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetIpAccessListResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetIpAccessListResponseDeserializer
      extends JsonDeserializer<GetIpAccessListResponse> {
    @Override
    public GetIpAccessListResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetIpAccessListResponsePb pb = mapper.readValue(p, GetIpAccessListResponsePb.class);
      return GetIpAccessListResponse.fromPb(pb);
    }
  }
}
