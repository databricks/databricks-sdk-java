// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class FinalizeSkillRequest {
  /**
   * Full resource name of the skill. Format: `skills/{catalog}.{schema}.{skill}`. Each `{...}`
   * component is capped at 255 characters individually.
   */
  @JsonIgnore private String name;

  public FinalizeSkillRequest setName(String name) {
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
    FinalizeSkillRequest that = (FinalizeSkillRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(FinalizeSkillRequest.class).add("name", name).toString();
  }
}
