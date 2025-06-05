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

/** Get an access token */
@Generated
@JsonSerialize(using = RetrieveTokenRequest.RetrieveTokenRequestSerializer.class)
@JsonDeserialize(using = RetrieveTokenRequest.RetrieveTokenRequestDeserializer.class)
public class RetrieveTokenRequest {
  /** The one time activation url. It also accepts activation token. */
  private String activationUrl;

  public RetrieveTokenRequest setActivationUrl(String activationUrl) {
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
    RetrieveTokenRequest that = (RetrieveTokenRequest) o;
    return Objects.equals(activationUrl, that.activationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(RetrieveTokenRequest.class)
        .add("activationUrl", activationUrl)
        .toString();
  }

  RetrieveTokenRequestPb toPb() {
    RetrieveTokenRequestPb pb = new RetrieveTokenRequestPb();
    pb.setActivationUrl(activationUrl);

    return pb;
  }

  static RetrieveTokenRequest fromPb(RetrieveTokenRequestPb pb) {
    RetrieveTokenRequest model = new RetrieveTokenRequest();
    model.setActivationUrl(pb.getActivationUrl());

    return model;
  }

  public static class RetrieveTokenRequestSerializer extends JsonSerializer<RetrieveTokenRequest> {
    @Override
    public void serialize(
        RetrieveTokenRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RetrieveTokenRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RetrieveTokenRequestDeserializer
      extends JsonDeserializer<RetrieveTokenRequest> {
    @Override
    public RetrieveTokenRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RetrieveTokenRequestPb pb = mapper.readValue(p, RetrieveTokenRequestPb.class);
      return RetrieveTokenRequest.fromPb(pb);
    }
  }
}
