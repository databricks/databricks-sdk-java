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

/** An IP access list was successfully created. */
@Generated
@JsonSerialize(using = CreateIpAccessListResponse.CreateIpAccessListResponseSerializer.class)
@JsonDeserialize(using = CreateIpAccessListResponse.CreateIpAccessListResponseDeserializer.class)
public class CreateIpAccessListResponse {
  /** Definition of an IP Access list */
  private IpAccessListInfo ipAccessList;

  public CreateIpAccessListResponse setIpAccessList(IpAccessListInfo ipAccessList) {
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
    CreateIpAccessListResponse that = (CreateIpAccessListResponse) o;
    return Objects.equals(ipAccessList, that.ipAccessList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessList);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateIpAccessListResponse.class)
        .add("ipAccessList", ipAccessList)
        .toString();
  }

  CreateIpAccessListResponsePb toPb() {
    CreateIpAccessListResponsePb pb = new CreateIpAccessListResponsePb();
    pb.setIpAccessList(ipAccessList);

    return pb;
  }

  static CreateIpAccessListResponse fromPb(CreateIpAccessListResponsePb pb) {
    CreateIpAccessListResponse model = new CreateIpAccessListResponse();
    model.setIpAccessList(pb.getIpAccessList());

    return model;
  }

  public static class CreateIpAccessListResponseSerializer
      extends JsonSerializer<CreateIpAccessListResponse> {
    @Override
    public void serialize(
        CreateIpAccessListResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateIpAccessListResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateIpAccessListResponseDeserializer
      extends JsonDeserializer<CreateIpAccessListResponse> {
    @Override
    public CreateIpAccessListResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateIpAccessListResponsePb pb = mapper.readValue(p, CreateIpAccessListResponsePb.class);
      return CreateIpAccessListResponse.fromPb(pb);
    }
  }
}
