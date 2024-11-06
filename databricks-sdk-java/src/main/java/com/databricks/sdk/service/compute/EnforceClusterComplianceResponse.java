// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EnforceClusterComplianceResponse {
  /**
   * A list of changes that have been made to the cluster settings for the cluster to become
   * compliant with its policy.
   */
  @JsonProperty("changes")
  private Collection<ClusterSettingsChange> changes;

  /**
   * Whether any changes have been made to the cluster settings for the cluster to become compliant
   * with its policy.
   */
  @JsonProperty("has_changes")
  private Boolean hasChanges;

  public EnforceClusterComplianceResponse setChanges(Collection<ClusterSettingsChange> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<ClusterSettingsChange> getChanges() {
    return changes;
  }

  public EnforceClusterComplianceResponse setHasChanges(Boolean hasChanges) {
    this.hasChanges = hasChanges;
    return this;
  }

  public Boolean getHasChanges() {
    return hasChanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforceClusterComplianceResponse that = (EnforceClusterComplianceResponse) o;
    return Objects.equals(changes, that.changes) && Objects.equals(hasChanges, that.hasChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, hasChanges);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforceClusterComplianceResponse.class)
        .add("changes", changes)
        .add("hasChanges", hasChanges)
        .toString();
  }
}
