// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Per-principal threshold override on a PER_USER alert: bumps the alert's quantity_threshold for
 * one principal_id.
 */
@Generated
public class PrincipalOverride {
  /** Dollar amount that overrides the parent alert's quantity_threshold for this principal. */
  @JsonProperty("override_threshold")
  private String overrideThreshold;

  /** Account-level principal id (user, group, or service principal). */
  @JsonProperty("principal_id")
  private Long principalId;

  public PrincipalOverride setOverrideThreshold(String overrideThreshold) {
    this.overrideThreshold = overrideThreshold;
    return this;
  }

  public String getOverrideThreshold() {
    return overrideThreshold;
  }

  public PrincipalOverride setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrincipalOverride that = (PrincipalOverride) o;
    return Objects.equals(overrideThreshold, that.overrideThreshold)
        && Objects.equals(principalId, that.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideThreshold, principalId);
  }

  @Override
  public String toString() {
    return new ToStringer(PrincipalOverride.class)
        .add("overrideThreshold", overrideThreshold)
        .add("principalId", principalId)
        .toString();
  }
}
