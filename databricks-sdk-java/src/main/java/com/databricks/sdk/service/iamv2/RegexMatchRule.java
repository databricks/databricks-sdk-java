// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A rule that matches an identity whose complete display name matches an RE2 regular expression.
 * Matching is case-sensitive. Use .* explicitly when substring matching is desired.
 */
@Generated
public class RegexMatchRule {
  /** The RE2 regular expression matched against the complete display name. */
  @JsonProperty("display_name_regex")
  private String displayNameRegex;

  public RegexMatchRule setDisplayNameRegex(String displayNameRegex) {
    this.displayNameRegex = displayNameRegex;
    return this;
  }

  public String getDisplayNameRegex() {
    return displayNameRegex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegexMatchRule that = (RegexMatchRule) o;
    return Objects.equals(displayNameRegex, that.displayNameRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayNameRegex);
  }

  @Override
  public String toString() {
    return new ToStringer(RegexMatchRule.class)
        .add("displayNameRegex", displayNameRegex)
        .toString();
  }
}
