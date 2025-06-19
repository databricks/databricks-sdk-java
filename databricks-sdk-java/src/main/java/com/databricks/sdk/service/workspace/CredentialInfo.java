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
@JsonSerialize(using = CredentialInfo.CredentialInfoSerializer.class)
@JsonDeserialize(using = CredentialInfo.CredentialInfoDeserializer.class)
public class CredentialInfo {
  /** ID of the credential object in the workspace. */
  private Long credentialId;

  /** The Git provider associated with the credential. */
  private String gitProvider;

  /**
   * The username or email provided with your Git provider account and associated with the
   * credential.
   */
  private String gitUsername;

  public CredentialInfo setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  public CredentialInfo setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public CredentialInfo setGitUsername(String gitUsername) {
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
    CredentialInfo that = (CredentialInfo) o;
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
    return new ToStringer(CredentialInfo.class)
        .add("credentialId", credentialId)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .toString();
  }

  CredentialInfoPb toPb() {
    CredentialInfoPb pb = new CredentialInfoPb();
    pb.setCredentialId(credentialId);
    pb.setGitProvider(gitProvider);
    pb.setGitUsername(gitUsername);

    return pb;
  }

  static CredentialInfo fromPb(CredentialInfoPb pb) {
    CredentialInfo model = new CredentialInfo();
    model.setCredentialId(pb.getCredentialId());
    model.setGitProvider(pb.getGitProvider());
    model.setGitUsername(pb.getGitUsername());

    return model;
  }

  public static class CredentialInfoSerializer extends JsonSerializer<CredentialInfo> {
    @Override
    public void serialize(CredentialInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CredentialInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CredentialInfoDeserializer extends JsonDeserializer<CredentialInfo> {
    @Override
    public CredentialInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CredentialInfoPb pb = mapper.readValue(p, CredentialInfoPb.class);
      return CredentialInfo.fromPb(pb);
    }
  }
}
