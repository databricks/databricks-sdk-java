// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateRuleRequest {
  /**
   * Optimistic-concurrency token from the latest read. A non-empty token that does not match the
   * current `etag` rejects the update as a conflict (HTTP 409). Omit this field or provide an empty
   * string to update unconditionally.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * Resource name, in the form `rules/{rule_id}`. Assigned by the server on create; required on
   * update.
   */
  @JsonIgnore private String name;

  /** The rule with its new field values. `rule.name` identifies the rule to update. */
  @JsonProperty("rule")
  private Rule rule;

  /** The set of fields to update. Only fields named in the mask are modified. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateRuleRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateRuleRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateRuleRequest setRule(Rule rule) {
    this.rule = rule;
    return this;
  }

  public Rule getRule() {
    return rule;
  }

  public UpdateRuleRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRuleRequest that = (UpdateRuleRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(rule, that.rule)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name, rule, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRuleRequest.class)
        .add("etag", etag)
        .add("name", name)
        .add("rule", rule)
        .add("updateMask", updateMask)
        .toString();
  }
}
