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
import java.util.Collection;
import java.util.Objects;

/** IP access lists were successfully returned. */
@Generated
@JsonSerialize(using = GetIpAccessListsResponse.GetIpAccessListsResponseSerializer.class)
@JsonDeserialize(using = GetIpAccessListsResponse.GetIpAccessListsResponseDeserializer.class)
public class GetIpAccessListsResponse {
  /** */
  private Collection<IpAccessListInfo> ipAccessLists;

  public GetIpAccessListsResponse setIpAccessLists(Collection<IpAccessListInfo> ipAccessLists) {
    this.ipAccessLists = ipAccessLists;
    return this;
  }

  public Collection<IpAccessListInfo> getIpAccessLists() {
    return ipAccessLists;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIpAccessListsResponse that = (GetIpAccessListsResponse) o;
    return Objects.equals(ipAccessLists, that.ipAccessLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessLists);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIpAccessListsResponse.class)
        .add("ipAccessLists", ipAccessLists)
        .toString();
  }

  GetIpAccessListsResponsePb toPb() {
    GetIpAccessListsResponsePb pb = new GetIpAccessListsResponsePb();
    pb.setIpAccessLists(ipAccessLists);

    return pb;
  }

  static GetIpAccessListsResponse fromPb(GetIpAccessListsResponsePb pb) {
    GetIpAccessListsResponse model = new GetIpAccessListsResponse();
    model.setIpAccessLists(pb.getIpAccessLists());

    return model;
  }

  public static class GetIpAccessListsResponseSerializer
      extends JsonSerializer<GetIpAccessListsResponse> {
    @Override
    public void serialize(
        GetIpAccessListsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetIpAccessListsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetIpAccessListsResponseDeserializer
      extends JsonDeserializer<GetIpAccessListsResponse> {
    @Override
    public GetIpAccessListsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetIpAccessListsResponsePb pb = mapper.readValue(p, GetIpAccessListsResponsePb.class);
      return GetIpAccessListsResponse.fromPb(pb);
    }
  }
}
