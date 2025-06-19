// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Get a private access settings object */
@Generated
@JsonSerialize(using = GetPrivateAccesRequest.GetPrivateAccesRequestSerializer.class)
@JsonDeserialize(using = GetPrivateAccesRequest.GetPrivateAccesRequestDeserializer.class)
public class GetPrivateAccesRequest {
  /** Databricks Account API private access settings ID. */
  private String privateAccessSettingsId;

  public GetPrivateAccesRequest setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPrivateAccesRequest that = (GetPrivateAccesRequest) o;
    return Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateAccessSettingsId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPrivateAccesRequest.class)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .toString();
  }

  GetPrivateAccesRequestPb toPb() {
    GetPrivateAccesRequestPb pb = new GetPrivateAccesRequestPb();
    pb.setPrivateAccessSettingsId(privateAccessSettingsId);

    return pb;
  }

  static GetPrivateAccesRequest fromPb(GetPrivateAccesRequestPb pb) {
    GetPrivateAccesRequest model = new GetPrivateAccesRequest();
    model.setPrivateAccessSettingsId(pb.getPrivateAccessSettingsId());

    return model;
  }

  public static class GetPrivateAccesRequestSerializer
      extends JsonSerializer<GetPrivateAccesRequest> {
    @Override
    public void serialize(
        GetPrivateAccesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPrivateAccesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPrivateAccesRequestDeserializer
      extends JsonDeserializer<GetPrivateAccesRequest> {
    @Override
    public GetPrivateAccesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPrivateAccesRequestPb pb = mapper.readValue(p, GetPrivateAccesRequestPb.class);
      return GetPrivateAccesRequest.fromPb(pb);
    }
  }
}
