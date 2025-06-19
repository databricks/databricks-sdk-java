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

@Generated
@JsonSerialize(using = TokenPermissionsDescription.TokenPermissionsDescriptionSerializer.class)
@JsonDeserialize(using = TokenPermissionsDescription.TokenPermissionsDescriptionDeserializer.class)
public class TokenPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private TokenPermissionLevel permissionLevel;

  public TokenPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public TokenPermissionsDescription setPermissionLevel(TokenPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public TokenPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenPermissionsDescription that = (TokenPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  TokenPermissionsDescriptionPb toPb() {
    TokenPermissionsDescriptionPb pb = new TokenPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static TokenPermissionsDescription fromPb(TokenPermissionsDescriptionPb pb) {
    TokenPermissionsDescription model = new TokenPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class TokenPermissionsDescriptionSerializer
      extends JsonSerializer<TokenPermissionsDescription> {
    @Override
    public void serialize(
        TokenPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TokenPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TokenPermissionsDescriptionDeserializer
      extends JsonDeserializer<TokenPermissionsDescription> {
    @Override
    public TokenPermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TokenPermissionsDescriptionPb pb = mapper.readValue(p, TokenPermissionsDescriptionPb.class);
      return TokenPermissionsDescription.fromPb(pb);
    }
  }
}
