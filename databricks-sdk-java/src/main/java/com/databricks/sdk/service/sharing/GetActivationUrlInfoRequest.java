// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** Get a share activation URL */
@Generated
@JsonSerialize(using = GetActivationUrlInfoRequest.GetActivationUrlInfoRequestSerializer.class)
@JsonDeserialize(using = GetActivationUrlInfoRequest.GetActivationUrlInfoRequestDeserializer.class)
public class GetActivationUrlInfoRequest {
  /** The one time activation url. It also accepts activation token. */
  private String activationUrl;

  public GetActivationUrlInfoRequest setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  public String getActivationUrl() {
    return activationUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetActivationUrlInfoRequest that = (GetActivationUrlInfoRequest) o;
    return Objects.equals(activationUrl, that.activationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(GetActivationUrlInfoRequest.class)
        .add("activationUrl", activationUrl)
        .toString();
  }

  GetActivationUrlInfoRequestPb toPb() {
    GetActivationUrlInfoRequestPb pb = new GetActivationUrlInfoRequestPb();
    pb.setActivationUrl(activationUrl);

    return pb;
  }

  static GetActivationUrlInfoRequest fromPb(GetActivationUrlInfoRequestPb pb) {
    GetActivationUrlInfoRequest model = new GetActivationUrlInfoRequest();
    model.setActivationUrl(pb.getActivationUrl());

    return model;
  }

  public static class GetActivationUrlInfoRequestSerializer
      extends JsonSerializer<GetActivationUrlInfoRequest> {
    @Override
    public void serialize(
        GetActivationUrlInfoRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetActivationUrlInfoRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetActivationUrlInfoRequestDeserializer
      extends JsonDeserializer<GetActivationUrlInfoRequest> {
    @Override
    public GetActivationUrlInfoRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetActivationUrlInfoRequestPb pb = mapper.readValue(p, GetActivationUrlInfoRequestPb.class);
      return GetActivationUrlInfoRequest.fromPb(pb);
    }
  }
}
