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
@JsonSerialize(using = CreateCredentialsRequest.CreateCredentialsRequestSerializer.class)
@JsonDeserialize(using = CreateCredentialsRequest.CreateCredentialsRequestDeserializer.class)
public class CreateCredentialsRequest {
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

  public CreateCredentialsRequest setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  public String getGitProvider() {
    return gitProvider;
  }

  public CreateCredentialsRequest setGitUsername(String gitUsername) {
    this.gitUsername = gitUsername;
    return this;
  }

  public String getGitUsername() {
    return gitUsername;
  }

  public CreateCredentialsRequest setPersonalAccessToken(String personalAccessToken) {
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
    CreateCredentialsRequest that = (CreateCredentialsRequest) o;
    return Objects.equals(gitProvider, that.gitProvider)
        && Objects.equals(gitUsername, that.gitUsername)
        && Objects.equals(personalAccessToken, that.personalAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitProvider, gitUsername, personalAccessToken);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialsRequest.class)
        .add("gitProvider", gitProvider)
        .add("gitUsername", gitUsername)
        .add("personalAccessToken", personalAccessToken)
        .toString();
  }

  CreateCredentialsRequestPb toPb() {
    CreateCredentialsRequestPb pb = new CreateCredentialsRequestPb();
    pb.setGitProvider(gitProvider);
    pb.setGitUsername(gitUsername);
    pb.setPersonalAccessToken(personalAccessToken);

    return pb;
  }

  static CreateCredentialsRequest fromPb(CreateCredentialsRequestPb pb) {
    CreateCredentialsRequest model = new CreateCredentialsRequest();
    model.setGitProvider(pb.getGitProvider());
    model.setGitUsername(pb.getGitUsername());
    model.setPersonalAccessToken(pb.getPersonalAccessToken());

    return model;
  }

  public static class CreateCredentialsRequestSerializer
      extends JsonSerializer<CreateCredentialsRequest> {
    @Override
    public void serialize(
        CreateCredentialsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCredentialsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCredentialsRequestDeserializer
      extends JsonDeserializer<CreateCredentialsRequest> {
    @Override
    public CreateCredentialsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCredentialsRequestPb pb = mapper.readValue(p, CreateCredentialsRequestPb.class);
      return CreateCredentialsRequest.fromPb(pb);
    }
  }
}
