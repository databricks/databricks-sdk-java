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

/** Configuration details for creating on-behalf tokens. */
@Generated
@JsonSerialize(using = CreateOboTokenRequest.CreateOboTokenRequestSerializer.class)
@JsonDeserialize(using = CreateOboTokenRequest.CreateOboTokenRequestDeserializer.class)
public class CreateOboTokenRequest {
  /** Application ID of the service principal. */
  private String applicationId;

  /** Comment that describes the purpose of the token. */
  private String comment;

  /** The number of seconds before the token expires. */
  private Long lifetimeSeconds;

  public CreateOboTokenRequest setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public CreateOboTokenRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateOboTokenRequest setLifetimeSeconds(Long lifetimeSeconds) {
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
    CreateOboTokenRequest that = (CreateOboTokenRequest) o;
    return Objects.equals(applicationId, that.applicationId)
        && Objects.equals(comment, that.comment)
        && Objects.equals(lifetimeSeconds, that.lifetimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, comment, lifetimeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOboTokenRequest.class)
        .add("applicationId", applicationId)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .toString();
  }

  CreateOboTokenRequestPb toPb() {
    CreateOboTokenRequestPb pb = new CreateOboTokenRequestPb();
    pb.setApplicationId(applicationId);
    pb.setComment(comment);
    pb.setLifetimeSeconds(lifetimeSeconds);

    return pb;
  }

  static CreateOboTokenRequest fromPb(CreateOboTokenRequestPb pb) {
    CreateOboTokenRequest model = new CreateOboTokenRequest();
    model.setApplicationId(pb.getApplicationId());
    model.setComment(pb.getComment());
    model.setLifetimeSeconds(pb.getLifetimeSeconds());

    return model;
  }

  public static class CreateOboTokenRequestSerializer
      extends JsonSerializer<CreateOboTokenRequest> {
    @Override
    public void serialize(
        CreateOboTokenRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateOboTokenRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateOboTokenRequestDeserializer
      extends JsonDeserializer<CreateOboTokenRequest> {
    @Override
    public CreateOboTokenRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateOboTokenRequestPb pb = mapper.readValue(p, CreateOboTokenRequestPb.class);
      return CreateOboTokenRequest.fromPb(pb);
    }
  }
}
