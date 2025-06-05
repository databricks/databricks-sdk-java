// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class FederationPolicyPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("oidc_policy")
  private OidcFederationPolicy oidcPolicy;

  @JsonProperty("update_time")
  private String updateTime;

  public FederationPolicyPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public FederationPolicyPb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public FederationPolicyPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public FederationPolicyPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FederationPolicyPb setOidcPolicy(OidcFederationPolicy oidcPolicy) {
    this.oidcPolicy = oidcPolicy;
    return this;
  }

  public OidcFederationPolicy getOidcPolicy() {
    return oidcPolicy;
  }

  public FederationPolicyPb setUpdateTime(String updateTime) {
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
    FederationPolicyPb that = (FederationPolicyPb) o;
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
    return new ToStringer(FederationPolicyPb.class)
        .add("comment", comment)
        .add("createTime", createTime)
        .add("id", id)
        .add("name", name)
        .add("oidcPolicy", oidcPolicy)
        .add("updateTime", updateTime)
        .toString();
  }
}
