// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FederationPolicy {
  /** Description of the policy. This is a user-provided description. */
  @JsonProperty("comment")
  private String comment;

  /** System-generated timestamp indicating when the policy was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** Unique, immutable system-generated identifier for the federation policy. */
  @JsonProperty("id")
  private String id;

  /**
   * Name of the federation policy. A recipient can have multiple policies with different names. The
   * name must contain only lowercase alphanumeric characters, numbers, and hyphens.
   */
  @JsonProperty("name")
  private String name;

  /** Specifies the policy to use for validating OIDC claims in the federated tokens. */
  @JsonProperty("oidc_policy")
  private OidcFederationPolicy oidcPolicy;

  /** System-generated timestamp indicating when the policy was last updated. */
  @JsonProperty("update_time")
  private String updateTime;

  public FederationPolicy setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public FederationPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public FederationPolicy setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public FederationPolicy setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FederationPolicy setOidcPolicy(OidcFederationPolicy oidcPolicy) {
    this.oidcPolicy = oidcPolicy;
    return this;
  }

  public OidcFederationPolicy getOidcPolicy() {
    return oidcPolicy;
  }

  public FederationPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FederationPolicy that = (FederationPolicy) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(oidcPolicy, that.oidcPolicy)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, createTime, id, name, oidcPolicy, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(FederationPolicy.class)
        .add("comment", comment)
        .add("createTime", createTime)
        .add("id", id)
        .add("name", name)
        .add("oidcPolicy", oidcPolicy)
        .add("updateTime", updateTime)
        .toString();
  }
}
