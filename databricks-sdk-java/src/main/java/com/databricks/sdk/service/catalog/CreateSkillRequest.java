// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSkillRequest {
  /**
   * Name of the parent schema. Format: `schemas/{catalog}.{schema}`. Each `{...}` component is
   * capped at 255 characters individually.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  /**
   * The skill to create. `comment` is the only accepted client input and may be omitted. Do not set
   * `name`; the server derives it from `parent` and `skill_id`.
   */
  @JsonProperty("skill")
  private Skill skill;

  /**
   * Name for the skill, e.g. "basic-math". The server normalizes this identifier to lowercase. It
   * is independent of the bundle name read from SKILL.md.
   */
  @JsonIgnore
  @QueryParam("skill_id")
  private String skillId;

  public CreateSkillRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateSkillRequest setSkill(Skill skill) {
    this.skill = skill;
    return this;
  }

  public Skill getSkill() {
    return skill;
  }

  public CreateSkillRequest setSkillId(String skillId) {
    this.skillId = skillId;
    return this;
  }

  public String getSkillId() {
    return skillId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSkillRequest that = (CreateSkillRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(skill, that.skill)
        && Objects.equals(skillId, that.skillId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, skill, skillId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSkillRequest.class)
        .add("parent", parent)
        .add("skill", skill)
        .add("skillId", skillId)
        .toString();
  }
}
