// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The sub-resource type (group ID) of the target resource. Note that to connect to workspace root
 * storage (root DBFS), you need two endpoints, one for `blob` and one for `dfs`.
 */
@Generated
public enum NccAzurePrivateEndpointRuleGroupId {
  @JsonProperty("blob")
  BLOB,

  @JsonProperty("dfs")
  DFS,

  @JsonProperty("mysqlServer")
  MYSQL_SERVER,

  @JsonProperty("sqlServer")
  SQL_SERVER,
}
