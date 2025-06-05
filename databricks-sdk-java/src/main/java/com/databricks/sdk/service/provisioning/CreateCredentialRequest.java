// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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
@JsonSerialize(using = CreateCredentialRequest.CreateCredentialRequestSerializer.class)
@JsonDeserialize(using = CreateCredentialRequest.CreateCredentialRequestDeserializer.class)
public class CreateCredentialRequest {
  /** */
  private CreateCredentialAwsCredentials awsCredentials;

  /** The human-readable name of the credential configuration object. */
  private String credentialsName;

  public CreateCredentialRequest setAwsCredentials(CreateCredentialAwsCredentials awsCredentials) {
    this.awsCredentials = awsCredentials;
    return this;
  }

  public CreateCredentialAwsCredentials getAwsCredentials() {
    return awsCredentials;
  }

  public CreateCredentialRequest setCredentialsName(String credentialsName) {
    this.credentialsName = credentialsName;
    return this;
  }

  public String getCredentialsName() {
    return credentialsName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialRequest that = (CreateCredentialRequest) o;
    return Objects.equals(awsCredentials, that.awsCredentials)
        && Objects.equals(credentialsName, that.credentialsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsCredentials, credentialsName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialRequest.class)
        .add("awsCredentials", awsCredentials)
        .add("credentialsName", credentialsName)
        .toString();
  }

  CreateCredentialRequestPb toPb() {
    CreateCredentialRequestPb pb = new CreateCredentialRequestPb();
    pb.setAwsCredentials(awsCredentials);
    pb.setCredentialsName(credentialsName);

    return pb;
  }

  static CreateCredentialRequest fromPb(CreateCredentialRequestPb pb) {
    CreateCredentialRequest model = new CreateCredentialRequest();
    model.setAwsCredentials(pb.getAwsCredentials());
    model.setCredentialsName(pb.getCredentialsName());

    return model;
  }

  public static class CreateCredentialRequestSerializer
      extends JsonSerializer<CreateCredentialRequest> {
    @Override
    public void serialize(
        CreateCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCredentialRequestDeserializer
      extends JsonDeserializer<CreateCredentialRequest> {
    @Override
    public CreateCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCredentialRequestPb pb = mapper.readValue(p, CreateCredentialRequestPb.class);
      return CreateCredentialRequest.fromPb(pb);
    }
  }
}
