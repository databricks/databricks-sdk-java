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
@JsonSerialize(using = CreateTokenRequest.CreateTokenRequestSerializer.class)
@JsonDeserialize(using = CreateTokenRequest.CreateTokenRequestDeserializer.class)
public class CreateTokenRequest {
  /** Optional description to attach to the token. */
  private String comment;

  /**
   * The lifetime of the token, in seconds.
   *
   * <p>If the lifetime is not specified, this token remains valid indefinitely.
   */
  private Long lifetimeSeconds;

  public CreateTokenRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateTokenRequest setLifetimeSeconds(Long lifetimeSeconds) {
    this.lifetimeSeconds = lifetimeSeconds;
    return this;
  }

  public Long getLifetimeSeconds() {
    return lifetimeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTokenRequest that = (CreateTokenRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(lifetimeSeconds, that.lifetimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, lifetimeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTokenRequest.class)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .toString();
  }

  CreateTokenRequestPb toPb() {
    CreateTokenRequestPb pb = new CreateTokenRequestPb();
    pb.setComment(comment);
    pb.setLifetimeSeconds(lifetimeSeconds);

    return pb;
  }

  static CreateTokenRequest fromPb(CreateTokenRequestPb pb) {
    CreateTokenRequest model = new CreateTokenRequest();
    model.setComment(pb.getComment());
    model.setLifetimeSeconds(pb.getLifetimeSeconds());

    return model;
  }

  public static class CreateTokenRequestSerializer extends JsonSerializer<CreateTokenRequest> {
    @Override
    public void serialize(CreateTokenRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateTokenRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateTokenRequestDeserializer extends JsonDeserializer<CreateTokenRequest> {
    @Override
    public CreateTokenRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateTokenRequestPb pb = mapper.readValue(p, CreateTokenRequestPb.class);
      return CreateTokenRequest.fromPb(pb);
    }
  }
}
