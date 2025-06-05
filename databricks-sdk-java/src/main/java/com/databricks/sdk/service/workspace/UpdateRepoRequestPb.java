// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateRepoRequestPb {
  @JsonProperty("branch")
  private String branch;

  @JsonIgnore private Long repoId;

  @JsonProperty("sparse_checkout")
  private SparseCheckoutUpdate sparseCheckout;

  @JsonProperty("tag")
  private String tag;

  public UpdateRepoRequestPb setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public UpdateRepoRequestPb setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  public Long getRepoId() {
    return repoId;
  }

  public UpdateRepoRequestPb setSparseCheckout(SparseCheckoutUpdate sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckoutUpdate getSparseCheckout() {
    return sparseCheckout;
  }

  public UpdateRepoRequestPb setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public String getTag() {
    return tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRepoRequestPb that = (UpdateRepoRequestPb) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(repoId, that.repoId)
        && Objects.equals(sparseCheckout, that.sparseCheckout)
        && Objects.equals(tag, that.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, repoId, sparseCheckout, tag);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRepoRequestPb.class)
        .add("branch", branch)
        .add("repoId", repoId)
        .add("sparseCheckout", sparseCheckout)
        .add("tag", tag)
        .toString();
  }
}
