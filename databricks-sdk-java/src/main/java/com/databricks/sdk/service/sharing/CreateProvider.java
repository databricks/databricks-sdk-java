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
@JsonSerialize(using = CreateProvider.CreateProviderSerializer.class)
@JsonDeserialize(using = CreateProvider.CreateProviderDeserializer.class)
public class CreateProvider {
  /** The delta sharing authentication type. */
  private AuthenticationType authenticationType;

  /** Description about the provider. */
  private String comment;

  /** The name of the Provider. */
  private String name;

  /**
   * This field is required when the __authentication_type__ is **TOKEN**,
   * **OAUTH_CLIENT_CREDENTIALS** or not provided.
   */
  private String recipientProfileStr;

  public CreateProvider setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  public CreateProvider setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateProvider setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateProvider setRecipientProfileStr(String recipientProfileStr) {
    this.recipientProfileStr = recipientProfileStr;
    return this;
  }

  public String getRecipientProfileStr() {
    return recipientProfileStr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateProvider that = (CreateProvider) o;
    return Objects.equals(authenticationType, that.authenticationType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(recipientProfileStr, that.recipientProfileStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, comment, name, recipientProfileStr);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateProvider.class)
        .add("authenticationType", authenticationType)
        .add("comment", comment)
        .add("name", name)
        .add("recipientProfileStr", recipientProfileStr)
        .toString();
  }

  CreateProviderPb toPb() {
    CreateProviderPb pb = new CreateProviderPb();
    pb.setAuthenticationType(authenticationType);
    pb.setComment(comment);
    pb.setName(name);
    pb.setRecipientProfileStr(recipientProfileStr);

    return pb;
  }

  static CreateProvider fromPb(CreateProviderPb pb) {
    CreateProvider model = new CreateProvider();
    model.setAuthenticationType(pb.getAuthenticationType());
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setRecipientProfileStr(pb.getRecipientProfileStr());

    return model;
  }

  public static class CreateProviderSerializer extends JsonSerializer<CreateProvider> {
    @Override
    public void serialize(CreateProvider value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateProviderPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateProviderDeserializer extends JsonDeserializer<CreateProvider> {
    @Override
    public CreateProvider deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateProviderPb pb = mapper.readValue(p, CreateProviderPb.class);
      return CreateProvider.fromPb(pb);
    }
  }
}
