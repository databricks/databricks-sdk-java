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
@JsonSerialize(using = UpdateCredentialsRequest.UpdateCredentialsRequestSerializer.class)
@JsonDeserialize(using = UpdateCredentialsRequest.UpdateCredentialsRequestDeserializer.class)
public class UpdateCredentialsRequest {
  /** The ID for the corresponding credential to access. */
  private Long credentialId;

  /**
   * Git provider. This field is case-insensitive. The available Git providers are `gitHub`,
   * `bitbucketCloud`, `gitLab`, `azureDevOpsServices`, `gitHubEnterprise`, `bitbucketServer`,
   * `gitLabEnterpriseEdition` and `awsCodeCommit`.
   */
  private String gitProvider;

  /**
   * The username or email provided with your Git provider account, depending on which provider you
   * are using. For GitHub, GitHub Enterprise Server, or Azure DevOps Services, either email or
   * username may be used. For GitLab, GitLab Enterprise Edition, email must be used. For AWS
   * CodeCommit, BitBucket or BitBucket Server, username must be used. For all other providers
   * please see your provider's Personal Access Token authentication documentation to see what is
   * supported.
   */
  private String gitUsername;

  /**
   * The personal access token used to authenticate to the corresponding Git provider. For certain
   * providers, support may exist for other types of scoped access tokens. [Learn more].
   *
   * <p>[Learn more]: https://docs.databricks.com/repos/get-access-tokens-from-git-provider.html
   */
  private String personalAccessToken;

  public UpdateCredentialsRequest setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  public UpdateCredentialsRequest setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public UpdateCredentialsRequest setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  public String getGitUsername() {
    return gitUsername;
  }

  public UpdateCredentialsRequest setPersonalAccessToken(String personalAccessToken) {
    this.personalAccessToken = personalAccessToken;
    return this;
  }

  public String getPersonalAccessToken() {
    return personalAccessToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCredentialsRequest that = (UpdateCredentialsRequest) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername)
        && Objects.equals(personalAccessToken, that.personalAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, gitProvider, gitUsername, personalAccessToken);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCredentialsRequest.class)
        .add("credentialId", credentialId)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .add("personalAccessToken", personalAccessToken)
        .toString();
  }

  UpdateCredentialsRequestPb toPb() {
    UpdateCredentialsRequestPb pb = new UpdateCredentialsRequestPb();
    pb.setCredentialId(credentialId);
    pb.setGitProvider(gitProvider);
    pb.setGitUsername(gitUsername);
    pb.setPersonalAccessToken(personalAccessToken);

    return pb;
  }

  static UpdateCredentialsRequest fromPb(UpdateCredentialsRequestPb pb) {
    UpdateCredentialsRequest model = new UpdateCredentialsRequest();
    model.setCredentialId(pb.getCredentialId());
    model.setGitProvider(pb.getGitProvider());
    model.setGitUsername(pb.getGitUsername());
    model.setPersonalAccessToken(pb.getPersonalAccessToken());

    return model;
  }

  public static class UpdateCredentialsRequestSerializer
      extends JsonSerializer<UpdateCredentialsRequest> {
    @Override
    public void serialize(
        UpdateCredentialsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCredentialsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCredentialsRequestDeserializer
      extends JsonDeserializer<UpdateCredentialsRequest> {
    @Override
    public UpdateCredentialsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCredentialsRequestPb pb = mapper.readValue(p, UpdateCredentialsRequestPb.class);
      return UpdateCredentialsRequest.fromPb(pb);
    }
  }
}
