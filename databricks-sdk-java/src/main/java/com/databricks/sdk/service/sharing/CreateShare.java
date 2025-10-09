// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateShare {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the share. */
  @JsonProperty("name")
  private String name;

  /**
   * Serverless budget policy id (can only be created/updated when calling data-sharing service)
   * [Create,Update:IGN]
   */
  @JsonProperty("serverless_budget_policy_id")
  private String serverlessBudgetPolicyId;

  /** Storage root URL for the share. */
  @JsonProperty("storage_root")
  private String storageRoot;

  public CreateShare setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateShare setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateShare setServerlessBudgetPolicyId(String serverlessBudgetPolicyId) {
    this.serverlessBudgetPolicyId = serverlessBudgetPolicyId;
    return this;
  }

  public String getServerlessBudgetPolicyId() {
    return serverlessBudgetPolicyId;
  }

  public CreateShare setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateShare that = (CreateShare) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(serverlessBudgetPolicyId, that.serverlessBudgetPolicyId)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, serverlessBudgetPolicyId, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateShare.class)
        .add("comment", comment)
        .add("name", name)
        .add("serverlessBudgetPolicyId", serverlessBudgetPolicyId)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
