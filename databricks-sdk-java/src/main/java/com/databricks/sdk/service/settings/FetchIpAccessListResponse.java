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

/** An IP access list was successfully returned. */
@Generated
@JsonSerialize(using = FetchIpAccessListResponse.FetchIpAccessListResponseSerializer.class)
@JsonDeserialize(using = FetchIpAccessListResponse.FetchIpAccessListResponseDeserializer.class)
public class FetchIpAccessListResponse {
  /** Definition of an IP Access list */
  private IpAccessListInfo ipAccessList;

  public FetchIpAccessListResponse setIpAccessList(IpAccessListInfo ipAccessList) {
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
    FetchIpAccessListResponse that = (FetchIpAccessListResponse) o;
    return Objects.equals(ipAccessList, that.ipAccessList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessList);
  }

  @Override
  public String toString() {
    return new ToStringer(FetchIpAccessListResponse.class)
        .add("ipAccessList", ipAccessList)
        .toString();
  }

  FetchIpAccessListResponsePb toPb() {
    FetchIpAccessListResponsePb pb = new FetchIpAccessListResponsePb();
    pb.setIpAccessList(ipAccessList);

    return pb;
  }

  static FetchIpAccessListResponse fromPb(FetchIpAccessListResponsePb pb) {
    FetchIpAccessListResponse model = new FetchIpAccessListResponse();
    model.setIpAccessList(pb.getIpAccessList());

    return model;
  }

  public static class FetchIpAccessListResponseSerializer
      extends JsonSerializer<FetchIpAccessListResponse> {
    @Override
    public void serialize(
        FetchIpAccessListResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FetchIpAccessListResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FetchIpAccessListResponseDeserializer
      extends JsonDeserializer<FetchIpAccessListResponse> {
    @Override
    public FetchIpAccessListResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FetchIpAccessListResponsePb pb = mapper.readValue(p, FetchIpAccessListResponsePb.class);
      return FetchIpAccessListResponse.fromPb(pb);
    }
  }
}
