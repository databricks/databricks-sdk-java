// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class RuleSetUpdateRequestPb {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("grant_rules")
  private Collection<GrantRule> grantRules;

  @JsonProperty("name")
  private String name;

  public RuleSetUpdateRequestPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public RuleSetUpdateRequestPb setGrantRules(Collection<GrantRule> grantRules) {
    this.grantRules = grantRules;
    return this;
  }

  public Collection<GrantRule> getGrantRules() {
    return grantRules;
  }

  public RuleSetUpdateRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RuleSetUpdateRequestPb that = (RuleSetUpdateRequestPb) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(grantRules, that.grantRules)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, grantRules, name);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleSetUpdateRequestPb.class)
        .add("etag", etag)
        .add("grantRules", grantRules)
        .add("name", name)
        .toString();
  }
}
