// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An account-level rule that controls which identity provider groups are discoverable in directory
 * search and group pickers when automatic identity management is enabled. Filters apply across all
 * workspaces in the account.
 *
 * <p>If no group filters are configured, all groups are visible. Otherwise, a group is visible if
 * it or any of its transitive parent groups matches at least one rule. A group is also visible if
 * it or any transitive parent group is already provisioned in the account. Local Databricks groups
 * remain visible regardless of the filters.
 *
 * <p>Only group filters can be created. Filters do not change provisioning or sign-in for users and
 * service principals. Filters are immutable: to change a rule, delete it and create a new one.
 */
@Generated
public class IdentityVisibilityFilter {
  /** Exact match on the group's external ID from the identity provider. */
  @JsonProperty("exact")
  private ExactMatchRule exact;

  /**
   * The resource name of the identity-visibility filter. Format:
   * accounts/{account_id}/identity-visibility-filters/{identity_visibility_filter_id}
   */
  @JsonProperty("name")
  private String name;

  /** Case-sensitive starts-with match on the group's display name. */
  @JsonProperty("prefix")
  private PrefixMatchRule prefix;

  /**
   * The type of principal this rule applies to. Set to `GROUP` when creating a filter. Other
   * principal types are not supported for creation.
   */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IdentityVisibilityFilter that = (IdentityVisibilityFilter) o;
    return Objects.equals(exact, that.exact)
        && Objects.equals(name, that.name)
        && Objects.equals(prefix, that.prefix)
        && Objects.equals(principalType, that.principalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exact, name, prefix, principalType);
  }

  @Override
  public String toString() {
    return new ToStringer(IdentityVisibilityFilter.class)
        .add("exact", exact)
        .add("name", name)
        .add("prefix", prefix)
        .add("principalType", principalType)
        .toString();
  }
}
