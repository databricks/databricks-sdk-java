// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An exact-match rule that matches a group's external ID from the identity provider. */
@Generated
public class ExactMatchRule {
  /**
   * The identity provider's external ID for the group to match. This is not the Databricks group
   * ID. The value must be non-empty and is matched exactly, including case.
   */
  @JsonProperty("external_id")
  private String externalId;

  public ExactMatchRule setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExactMatchRule that = (ExactMatchRule) o;
    return Objects.equals(externalId, that.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExactMatchRule.class).add("externalId", externalId).toString();
  }
}
