// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Compute products allowed by a policy and their product-specific constraints. At least one product
 * must be set.
 */
@Generated
public class AllowedComputeProducts {
  /** Constraints for serverless automated compute. Absence disallows automated compute. */
  @JsonProperty("automated")
  private AutomatedConstraints automated;

  /** Constraints for Lakebase instances. Absence disallows Lakebase. */
  @JsonProperty("lakebase")
  private LakebaseConstraints lakebase;

  public AllowedComputeProducts setAutomated(AutomatedConstraints automated) {
    this.automated = automated;
    return this;
  }

  public AutomatedConstraints getAutomated() {
    return automated;
  }

  public AllowedComputeProducts setLakebase(LakebaseConstraints lakebase) {
    this.lakebase = lakebase;
    return this;
  }

  public LakebaseConstraints getLakebase() {
    return lakebase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AllowedComputeProducts that = (AllowedComputeProducts) o;
    return Objects.equals(automated, that.automated) && Objects.equals(lakebase, that.lakebase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automated, lakebase);
  }

  @Override
  public String toString() {
    return new ToStringer(AllowedComputeProducts.class)
        .add("automated", automated)
        .add("lakebase", lakebase)
        .toString();
  }
}
