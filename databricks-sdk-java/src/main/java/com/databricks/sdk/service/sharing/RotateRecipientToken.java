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

@Generated
@JsonSerialize(using = RotateRecipientToken.RotateRecipientTokenSerializer.class)
@JsonDeserialize(using = RotateRecipientToken.RotateRecipientTokenDeserializer.class)
public class RotateRecipientToken {
  /**
   * The expiration time of the bearer token in ISO 8601 format. This will set the expiration_time
   * of existing token only to a smaller timestamp, it cannot extend the expiration_time. Use 0 to
   * expire the existing token immediately, negative number will return an error.
   */
  private Long existingTokenExpireInSeconds;

  /** The name of the Recipient. */
  private String name;

  public RotateRecipientToken setExistingTokenExpireInSeconds(Long existingTokenExpireInSeconds) {
    this.existingTokenExpireInSeconds = existingTokenExpireInSeconds;
    return this;
  }

  public Long getExistingTokenExpireInSeconds() {
    return existingTokenExpireInSeconds;
  }

  public RotateRecipientToken setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RotateRecipientToken that = (RotateRecipientToken) o;
    return Objects.equals(existingTokenExpireInSeconds, that.existingTokenExpireInSeconds)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingTokenExpireInSeconds, name);
  }

  @Override
  public String toString() {
    return new ToStringer(RotateRecipientToken.class)
        .add("existingTokenExpireInSeconds", existingTokenExpireInSeconds)
        .add("name", name)
        .toString();
  }

  RotateRecipientTokenPb toPb() {
    RotateRecipientTokenPb pb = new RotateRecipientTokenPb();
    pb.setExistingTokenExpireInSeconds(existingTokenExpireInSeconds);
    pb.setName(name);

    return pb;
  }

  static RotateRecipientToken fromPb(RotateRecipientTokenPb pb) {
    RotateRecipientToken model = new RotateRecipientToken();
    model.setExistingTokenExpireInSeconds(pb.getExistingTokenExpireInSeconds());
    model.setName(pb.getName());

    return model;
  }

  public static class RotateRecipientTokenSerializer extends JsonSerializer<RotateRecipientToken> {
    @Override
    public void serialize(
        RotateRecipientToken value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RotateRecipientTokenPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RotateRecipientTokenDeserializer
      extends JsonDeserializer<RotateRecipientToken> {
    @Override
    public RotateRecipientToken deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RotateRecipientTokenPb pb = mapper.readValue(p, RotateRecipientTokenPb.class);
      return RotateRecipientToken.fromPb(pb);
    }
  }
}
