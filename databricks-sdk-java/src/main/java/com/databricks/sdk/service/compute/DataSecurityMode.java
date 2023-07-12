// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum DataSecurityMode {
  @JsonProperty("LEGACY_PASSTHROUGH")
  LEGACY_PASSTHROUGH, // This mode is for users migrating from legacy Passthrough on high
  // concurrency
  // clusters.

  @JsonProperty("LEGACY_SINGLE_USER")
  LEGACY_SINGLE_USER, // This mode is for users migrating from legacy Passthrough on standard
  // clusters.

  @JsonProperty("LEGACY_TABLE_ACL")
  LEGACY_TABLE_ACL, // This mode is for users migrating from legacy Table ACL clusters.

  @JsonProperty("NONE")
  NONE, // No security isolation for multiple users sharing the cluster. Data governance
  // features are not available in this mode.

  @JsonProperty("SINGLE_USER")
  SINGLE_USER, // A secure cluster that can only be exclusively used by a single user specified
  // in `single_user_name`. Most programming languages, cluster features and data
  // governance features are available in this mode.

  @JsonProperty("USER_ISOLATION")
  USER_ISOLATION, // A secure cluster that can be shared by multiple users. Cluster users are
  // fully isolated so that they cannot see each other's data and credentials.
  // Most data governance features are supported in this mode. But programming
  // languages and cluster features might be limited.

}
