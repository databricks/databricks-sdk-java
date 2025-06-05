// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = BearerTokenAuth.BearerTokenAuthSerializer.class)
@JsonDeserialize(using = BearerTokenAuth.BearerTokenAuthDeserializer.class)
public class BearerTokenAuth {
  /**
   * The Databricks secret key reference for a token. If you prefer to paste your token directly,
   * see `token_plaintext`.
   */
  private String token;

  /**
   * The token provided as a plaintext string. If you prefer to reference your token using
   * Databricks Secrets, see `token`.
   */
  private String tokenPlaintext;

  public BearerTokenAuth setToken(String token) {
    this.token = token;
    return this;
  }

  public String getToken() {
    return token;
  }

  public BearerTokenAuth setTokenPlaintext(String tokenPlaintext) {
    this.tokenPlaintext = tokenPlaintext;
    return this;
  }

  public String getTokenPlaintext() {
    return tokenPlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BearerTokenAuth that = (BearerTokenAuth) o;
    return Objects.equals(token, that.token) && Objects.equals(tokenPlaintext, that.tokenPlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tokenPlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(BearerTokenAuth.class)
        .add("token", token)
        .add("tokenPlaintext", tokenPlaintext)
        .toString();
  }

  BearerTokenAuthPb toPb() {
    BearerTokenAuthPb pb = new BearerTokenAuthPb();
    pb.setToken(token);
    pb.setTokenPlaintext(tokenPlaintext);

    return pb;
  }

  static BearerTokenAuth fromPb(BearerTokenAuthPb pb) {
    BearerTokenAuth model = new BearerTokenAuth();
    model.setToken(pb.getToken());
    model.setTokenPlaintext(pb.getTokenPlaintext());

    return model;
  }

  public static class BearerTokenAuthSerializer extends JsonSerializer<BearerTokenAuth> {
    @Override
    public void serialize(BearerTokenAuth value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BearerTokenAuthPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BearerTokenAuthDeserializer extends JsonDeserializer<BearerTokenAuth> {
    @Override
    public BearerTokenAuth deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BearerTokenAuthPb pb = mapper.readValue(p, BearerTokenAuthPb.class);
      return BearerTokenAuth.fromPb(pb);
    }
  }
}
