// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a repo */
public class Get {
  /** The ID for the corresponding repo to access. */
  private Long repoId;

  public Get setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  public Long getRepoId() {
    return repoId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Get that = (Get) o;
    return Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(Get.class).add("repoId", repoId).toString();
  }
}
