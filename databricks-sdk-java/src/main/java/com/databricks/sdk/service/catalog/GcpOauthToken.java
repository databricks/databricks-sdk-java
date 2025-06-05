// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/**
 * GCP temporary credentials for API authentication. Read more at
 * https://developers.google.com/identity/protocols/oauth2/service-account
 */
@Generated
@JsonSerialize(using = GcpOauthToken.GcpOauthTokenSerializer.class)
@JsonDeserialize(using = GcpOauthToken.GcpOauthTokenDeserializer.class)
public class GcpOauthToken {
  /** */
  private String oauthToken;

  public GcpOauthToken setOauthToken(String oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  public String getOauthToken() {
    return oauthToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpOauthToken that = (GcpOauthToken) o;
    return Objects.equals(oauthToken, that.oauthToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpOauthToken.class).add("oauthToken", oauthToken).toString();
  }

  GcpOauthTokenPb toPb() {
    GcpOauthTokenPb pb = new GcpOauthTokenPb();
    pb.setOauthToken(oauthToken);

    return pb;
  }

  static GcpOauthToken fromPb(GcpOauthTokenPb pb) {
    GcpOauthToken model = new GcpOauthToken();
    model.setOauthToken(pb.getOauthToken());

    return model;
  }

  public static class GcpOauthTokenSerializer extends JsonSerializer<GcpOauthToken> {
    @Override
    public void serialize(GcpOauthToken value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GcpOauthTokenPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GcpOauthTokenDeserializer extends JsonDeserializer<GcpOauthToken> {
    @Override
    public GcpOauthToken deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GcpOauthTokenPb pb = mapper.readValue(p, GcpOauthTokenPb.class);
      return GcpOauthToken.fromPb(pb);
    }
  }
}
