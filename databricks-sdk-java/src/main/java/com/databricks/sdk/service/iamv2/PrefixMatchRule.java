// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A starts-with rule that matches groups whose display name begins with a specified prefix.
 * Matching is case-sensitive. For example, the prefix `data-` matches `data-platform`.
 */
@Generated
public class PrefixMatchRule {
  /**
   * The display-name prefix to match. Must contain at least one non-whitespace character. Leading
   * and trailing whitespace are preserved, and matching is case-sensitive.
   */
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
