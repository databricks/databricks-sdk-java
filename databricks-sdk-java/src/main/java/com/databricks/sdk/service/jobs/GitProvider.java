// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum GitProvider {
  @JsonProperty("awsCodeCommit")
  AWS_CODE_COMMIT,

  @JsonProperty("azureDevOpsServices")
  AZURE_DEV_OPS_SERVICES,

  @JsonProperty("bitbucketCloud")
  BITBUCKET_CLOUD,

  @JsonProperty("bitbucketServer")
  BITBUCKET_SERVER,

  @JsonProperty("gitHub")
  GIT_HUB,

  @JsonProperty("gitHubEnterprise")
  GIT_HUB_ENTERPRISE,

  @JsonProperty("gitLab")
  GIT_LAB,

  @JsonProperty("gitLabEnterpriseEdition")
  GIT_LAB_ENTERPRISE_EDITION,
}
