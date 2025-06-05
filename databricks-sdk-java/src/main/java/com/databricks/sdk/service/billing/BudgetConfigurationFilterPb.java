// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class BudgetConfigurationFilterPb {
  @JsonProperty("tags")
  private Collection<BudgetConfigurationFilterTagClause> tags;

  @JsonProperty("workspace_id")
  private BudgetConfigurationFilterWorkspaceIdClause workspaceId;

  public BudgetConfigurationFilterPb setTags(Collection<BudgetConfigurationFilterTagClause> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<BudgetConfigurationFilterTagClause> getTags() {
    return tags;
  }

  public BudgetConfigurationFilterPb setWorkspaceId(
      BudgetConfigurationFilterWorkspaceIdClause workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public BudgetConfigurationFilterWorkspaceIdClause getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationFilterPb that = (BudgetConfigurationFilterPb) o;
    return Objects.equals(tags, that.tags) && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilterPb.class)
        .add("tags", tags)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
