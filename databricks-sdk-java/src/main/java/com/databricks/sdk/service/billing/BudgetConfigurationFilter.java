// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class BudgetConfigurationFilter {
  /**
   * A list of tag keys and values that will limit the budget to usage that includes those specific
   * custom tags. Tags are case-sensitive and should be entered exactly as they appear in your usage
   * data.
   */
  @JsonProperty("tags")
  private Collection<BudgetConfigurationFilterTagClause> tags;

  /** If provided, usage must match with the provided Databricks workspace IDs. */
  @JsonProperty("workspace_id")
  private BudgetConfigurationFilterWorkspaceIdClause workspaceId;

  public BudgetConfigurationFilter setTags(Collection<BudgetConfigurationFilterTagClause> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<BudgetConfigurationFilterTagClause> getTags() {
    return tags;
  }

  public BudgetConfigurationFilter setWorkspaceId(
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
    BudgetConfigurationFilter that = (BudgetConfigurationFilter) o;
    return Objects.equals(tags, that.tags) && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilter.class)
        .add("tags", tags)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
