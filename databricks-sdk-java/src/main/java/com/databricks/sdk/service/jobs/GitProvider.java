// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum GitProvider {
  @JsonProperty("awsCodeCommit")
  AWSCODECOMMIT,

  @JsonProperty("azureDevOpsServices")
  AZUREDEVOPSSERVICES,

  @JsonProperty("bitbucketCloud")
  BITBUCKETCLOUD,

  @JsonProperty("bitbucketServer")
  BITBUCKETSERVER,

  @JsonProperty("gitHub")
  GITHUB,

  @JsonProperty("gitHubEnterprise")
  GITHUBENTERPRISE,

  @JsonProperty("gitLab")
  GITLAB,

  @JsonProperty("gitLabEnterpriseEdition")
  GITLABENTERPRISEEDITION,
}
