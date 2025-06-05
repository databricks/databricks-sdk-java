// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = CreateCredentialsResponse.CreateCredentialsResponseSerializer.class)
@JsonDeserialize(using = CreateCredentialsResponse.CreateCredentialsResponseDeserializer.class)
public class CreateCredentialsResponse {
  /** ID of the credential object in the workspace. */
  private Long credentialId;

  /** The Git provider associated with the credential. */
  private String gitProvider;

  /**
   * The username or email provided with your Git provider account and associated with the
   * credential.
   */
  private String gitUsername;

  public CreateCredentialsResponse setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  public CreateCredentialsResponse setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public CreateCredentialsResponse setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  public String getGitUsername() {
    return gitUsername;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialsResponse that = (CreateCredentialsResponse) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, gitProvider, gitUsername);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialsResponse.class)
        .add("credentialId", credentialId)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .toString();
  }

  CreateCredentialsResponsePb toPb() {
    CreateCredentialsResponsePb pb = new CreateCredentialsResponsePb();
    pb.setCredentialId(credentialId);
    pb.setGitProvider(gitProvider);
    pb.setGitUsername(gitUsername);

    return pb;
  }

  static CreateCredentialsResponse fromPb(CreateCredentialsResponsePb pb) {
    CreateCredentialsResponse model = new CreateCredentialsResponse();
    model.setCredentialId(pb.getCredentialId());
    model.setGitProvider(pb.getGitProvider());
    model.setGitUsername(pb.getGitUsername());

    return model;
  }

  public static class CreateCredentialsResponseSerializer
      extends JsonSerializer<CreateCredentialsResponse> {
    @Override
    public void serialize(
        CreateCredentialsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCredentialsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCredentialsResponseDeserializer
      extends JsonDeserializer<CreateCredentialsResponse> {
    @Override
    public CreateCredentialsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCredentialsResponsePb pb = mapper.readValue(p, CreateCredentialsResponsePb.class);
      return CreateCredentialsResponse.fromPb(pb);
    }
  }
}
