// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Account level policy for ESM */
@Generated
class EsmEnablementAccountPb {
  @JsonProperty("is_enforced")
  private Boolean isEnforced;

  public EsmEnablementAccountPb setIsEnforced(Boolean isEnforced) {
    this.isEnforced = isEnforced;
    return this;
  }

  public Boolean getIsEnforced() {
    return isEnforced;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EsmEnablementAccountPb that = (EsmEnablementAccountPb) o;
    return Objects.equals(isEnforced, that.isEnforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnforced);
  }

  @Override
  public String toString() {
    return new ToStringer(EsmEnablementAccountPb.class).add("isEnforced", isEnforced).toString();
  }
}
