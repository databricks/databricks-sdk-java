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
public class UpdateRuleConfigRequest {
  /**
   * Optimistic-concurrency precondition: if set and it does not match the resource's current
   * `etag`, the update is rejected as a conflict (HTTP 409).
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /** */
  @JsonIgnore private String name;

  /** */
  @JsonProperty("rule_config")
  private RuleConfig ruleConfig;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateRuleConfigRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateRuleConfigRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateRuleConfigRequest setRuleConfig(RuleConfig ruleConfig) {
    this.ruleConfig = ruleConfig;
    return this;
  }

  public RuleConfig getRuleConfig() {
    return ruleConfig;
  }

  public UpdateRuleConfigRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateRuleConfigRequest that = (UpdateRuleConfigRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(ruleConfig, that.ruleConfig)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name, ruleConfig, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRuleConfigRequest.class)
        .add("etag", etag)
        .add("name", name)
        .add("ruleConfig", ruleConfig)
        .add("updateMask", updateMask)
        .toString();
  }
}
