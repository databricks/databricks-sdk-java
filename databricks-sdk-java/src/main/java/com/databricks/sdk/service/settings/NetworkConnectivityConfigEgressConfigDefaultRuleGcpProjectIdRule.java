// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class NetworkConnectivityConfigEgressConfigDefaultRuleGcpProjectIdRule {
  /**
   * A list of Databricks internal project IDs from where network access originates for serverless
   * DBSQL, This list is stable and will not change once the NCC object is created.
   */
  @JsonProperty("project_ids")
  private Collection<String> projectIds;

  public NetworkConnectivityConfigEgressConfigDefaultRuleGcpProjectIdRule setProjectIds(
      Collection<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public Collection<String> getProjectIds() {
    return projectIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkConnectivityConfigEgressConfigDefaultRuleGcpProjectIdRule that =
        (NetworkConnectivityConfigEgressConfigDefaultRuleGcpProjectIdRule) o;
    return Objects.equals(projectIds, that.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkConnectivityConfigEgressConfigDefaultRuleGcpProjectIdRule.class)
        .add("projectIds", projectIds)
        .toString();
  }
}
