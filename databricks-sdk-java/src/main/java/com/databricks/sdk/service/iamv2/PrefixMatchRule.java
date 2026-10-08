// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A rule that matches an identity whose display name starts with the value. */
@Generated
public class PrefixMatchRule {
  /** The display-name prefix to match. */
  @JsonProperty("display_name_prefix")
  private String displayNamePrefix;

  public PrefixMatchRule setDisplayNamePrefix(String displayNamePrefix) {
    this.displayNamePrefix = displayNamePrefix;
    return this;
  }

  public String getDisplayNamePrefix() {
    return displayNamePrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrefixMatchRule that = (PrefixMatchRule) o;
    return Objects.equals(displayNamePrefix, that.displayNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayNamePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(PrefixMatchRule.class)
        .add("displayNamePrefix", displayNamePrefix)
        .toString();
  }
}
