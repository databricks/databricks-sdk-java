// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An account-level rule that controls which groups from your identity provider (IdP) can be found
 * in directory search and group pickers when automatic identity management is on. Filters apply to
 * every workspace in the account.
 *
 * <p>If you have no group filters, all groups are visible. Otherwise, a group is visible if it or
 * any of its parent groups matches at least one filter. A group is also visible if it or any of its
 * parent groups is already in your account. Local Databricks groups are always visible.
 *
 * <p>You can only create group filters. Filters don't affect provisioning or sign-in for users and
 * service principals. You can't change a filter: to change a rule, delete it and create a new one.
 */
@Generated
public class IdentityVisibilityFilter {
  /** Matches a group by its ID in your IdP. */
  @JsonProperty("exact")
  private ExactMatchRule exact;

  /**
   * The resource name of the filter, in the format
   * `accounts/{account_id}/identity-visibility-filters/{identity_visibility_filter_id}`.
   */
  @JsonProperty("name")
  private String name;

  /** Matches groups whose display name starts with a prefix. */
  @JsonProperty("prefix")
  private PrefixMatchRule prefix;

  /**
   * The type of principal the filter applies to. Set it to `GROUP`. Other types aren't supported.
   */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  /** Matches groups whose display name matches a regular expression. */
  @JsonProperty("regex")
  private RegexMatchRule regex;

  public IdentityVisibilityFilter setExact(ExactMatchRule exact) {
    this.exact = exact;
    return this;
  }

  public ExactMatchRule getExact() {
    return exact;
  }

  public IdentityVisibilityFilter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public IdentityVisibilityFilter setPrefix(PrefixMatchRule prefix) {
    this.prefix = prefix;
    return this;
  }

  public PrefixMatchRule getPrefix() {
    return prefix;
  }

  public IdentityVisibilityFilter setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public PrincipalType getPrincipalType() {
    return principalType;
  }

  public IdentityVisibilityFilter setRegex(RegexMatchRule regex) {
    this.regex = regex;
    return this;
  }

  public RegexMatchRule getRegex() {
    return regex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IdentityVisibilityFilter that = (IdentityVisibilityFilter) o;
    return Objects.equals(exact, that.exact)
        && Objects.equals(name, that.name)
        && Objects.equals(prefix, that.prefix)
        && Objects.equals(principalType, that.principalType)
        && Objects.equals(regex, that.regex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exact, name, prefix, principalType, regex);
  }

  @Override
  public String toString() {
    return new ToStringer(IdentityVisibilityFilter.class)
        .add("exact", exact)
        .add("name", name)
        .add("prefix", prefix)
        .add("principalType", principalType)
        .add("regex", regex)
        .toString();
  }
}
