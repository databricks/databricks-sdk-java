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
@JsonSerialize(using = RecipientProfile.RecipientProfileSerializer.class)
@JsonDeserialize(using = RecipientProfile.RecipientProfileDeserializer.class)
public class RecipientProfile {
  /** The token used to authorize the recipient. */
  private String bearerToken;

  /** The endpoint for the share to be used by the recipient. */
  private String endpoint;

  /** The version number of the recipient's credentials on a share. */
  private Long shareCredentialsVersion;

  public RecipientProfile setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  public String getBearerToken() {
    return bearerToken;
  }

  public RecipientProfile setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public RecipientProfile setShareCredentialsVersion(Long shareCredentialsVersion) {
    this.shareCredentialsVersion = shareCredentialsVersion;
    return this;
  }

  public Long getShareCredentialsVersion() {
    return shareCredentialsVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RecipientProfile that = (RecipientProfile) o;
    return Objects.equals(bearerToken, that.bearerToken)
        && Objects.equals(endpoint, that.endpoint)
        && Objects.equals(shareCredentialsVersion, that.shareCredentialsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearerToken, endpoint, shareCredentialsVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(RecipientProfile.class)
        .add("bearerToken", bearerToken)
        .add("endpoint", endpoint)
        .add("shareCredentialsVersion", shareCredentialsVersion)
        .toString();
  }

  RecipientProfilePb toPb() {
    RecipientProfilePb pb = new RecipientProfilePb();
    pb.setBearerToken(bearerToken);
    pb.setEndpoint(endpoint);
    pb.setShareCredentialsVersion(shareCredentialsVersion);

    return pb;
  }

  static RecipientProfile fromPb(RecipientProfilePb pb) {
    RecipientProfile model = new RecipientProfile();
    model.setBearerToken(pb.getBearerToken());
    model.setEndpoint(pb.getEndpoint());
    model.setShareCredentialsVersion(pb.getShareCredentialsVersion());

    return model;
  }

  public static class RecipientProfileSerializer extends JsonSerializer<RecipientProfile> {
    @Override
    public void serialize(RecipientProfile value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RecipientProfilePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RecipientProfileDeserializer extends JsonDeserializer<RecipientProfile> {
    @Override
    public RecipientProfile deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RecipientProfilePb pb = mapper.readValue(p, RecipientProfilePb.class);
      return RecipientProfile.fromPb(pb);
    }
  }
}
