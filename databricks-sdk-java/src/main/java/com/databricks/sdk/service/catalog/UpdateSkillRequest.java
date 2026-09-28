// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSkillRequest {
  /**
   * Optimistic concurrency token from the most recent read. When set, the update succeeds only if
   * the resource has not changed. Leave unset for an unconditional update. For REST requests,
   * URL-encode the base64 string returned by the API when setting the `etag` query parameter.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * Resource name of the skill. Format: `skills/{catalog}.{schema}.{skill}`. Each `{...}` component
   * is capped at 255 characters individually. Server-derived on Create from `parent` + `skill_id`;
   * required and immutable on Update/Get/Delete.
   */
  @JsonIgnore private String name;

  /**
   * The skill with the updated field values. `name` identifies the resource
   * (`skills/{catalog}.{schema}.{skill}`); only fields listed in `update_mask` are applied.
   */
  @JsonProperty("skill")
  private Skill skill;

  /**
   * Fields to update; validated against `skill`. REQUIRED, matching the sibling Update RPCs.
   * `comment` is the only mutable field.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSkillRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateSkillRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSkillRequest setSkill(Skill skill) {
    this.skill = skill;
    return this;
  }

  public Skill getSkill() {
    return skill;
  }

  public UpdateSkillRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateSkillRequest that = (UpdateSkillRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(skill, that.skill)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name, skill, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSkillRequest.class)
        .add("etag", etag)
        .add("name", name)
        .add("skill", skill)
        .add("updateMask", updateMask)
        .toString();
  }
}
