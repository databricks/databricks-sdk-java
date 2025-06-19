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
@JsonSerialize(using = ListIpAccessListResponse.ListIpAccessListResponseSerializer.class)
@JsonDeserialize(using = ListIpAccessListResponse.ListIpAccessListResponseDeserializer.class)
public class ListIpAccessListResponse {
  /** */
  private Collection<IpAccessListInfo> ipAccessLists;

  public ListIpAccessListResponse setIpAccessLists(Collection<IpAccessListInfo> ipAccessLists) {
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
    ListIpAccessListResponse that = (ListIpAccessListResponse) o;
    return Objects.equals(ipAccessLists, that.ipAccessLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessLists);
  }

  @Override
  public String toString() {
    return new ToStringer(ListIpAccessListResponse.class)
        .add("ipAccessLists", ipAccessLists)
        .toString();
  }

  ListIpAccessListResponsePb toPb() {
    ListIpAccessListResponsePb pb = new ListIpAccessListResponsePb();
    pb.setIpAccessLists(ipAccessLists);

    return pb;
  }

  static ListIpAccessListResponse fromPb(ListIpAccessListResponsePb pb) {
    ListIpAccessListResponse model = new ListIpAccessListResponse();
    model.setIpAccessLists(pb.getIpAccessLists());

    return model;
  }

  public static class ListIpAccessListResponseSerializer
      extends JsonSerializer<ListIpAccessListResponse> {
    @Override
    public void serialize(
        ListIpAccessListResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListIpAccessListResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListIpAccessListResponseDeserializer
      extends JsonDeserializer<ListIpAccessListResponse> {
    @Override
    public ListIpAccessListResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListIpAccessListResponsePb pb = mapper.readValue(p, ListIpAccessListResponsePb.class);
      return ListIpAccessListResponse.fromPb(pb);
    }
  }
}
