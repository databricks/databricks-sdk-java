// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Unique identifier of the service used to host the Git repository. The value
 * is case insensitive.
 */
public enum GitSourceGitProvider{
    awsCodeCommit,
    azureDevOpsServices,
    bitbucketCloud,
    bitbucketServer,
    gitHub,
    gitHubEnterprise,
    gitLab,
    gitLabEnterpriseEdition,
    
}