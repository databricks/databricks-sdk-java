// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ON: Grants all users in all workspaces access to the Personal Compute default policy, allowing
 * all users to create single-machine compute resources. DELEGATE: Moves access control for the
 * Personal Compute default policy to individual workspaces and requires a workspace’s users or
 * groups to be added to the ACLs of that workspace’s Personal Compute default policy before they
 * will be able to create compute resources through that policy.
 */
@Generated
public enum PersonalComputeMessageEnum {
  @JsonProperty("DELEGATE")
  DELEGATE,

  @JsonProperty("ON")
  ON,
}
