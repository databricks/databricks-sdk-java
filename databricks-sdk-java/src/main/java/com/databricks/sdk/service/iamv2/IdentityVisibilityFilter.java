// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A rule controlling which externally provisioned identities are visible in the account. Filters
 * are scoped by principal_type: an identity is only ever evaluated against filters whose
 * principal_type matches its own. When the account has no filter for an identity's principal_type,
 * all identities of that type are visible; once it has at least one filter for that type, an
 * identity of that type is visible only if it matches at least one of those filters. So a set of
 * group-only filters gates groups but leaves users and service principals fully visible.
 */
@Generated
public class IdentityVisibilityFilter {
  /** Exact match on the identity's external ID. */
  @JsonProperty("exact")
  private ExactMatchRule exact;

  /**
   * The resource name of the identity-visibility filter. Format:
   * accounts/{account_id}/identity-visibility-filters/{identity_visibility_filter_id}
   */
  @JsonProperty("name")
  private String name;

  /** Prefix match on the identity's display name. */
  @JsonProperty("prefix")
  private PrefixMatchRule prefix;

  /** Which type of principal (user, service principal, or group) this rule applies to. */
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
