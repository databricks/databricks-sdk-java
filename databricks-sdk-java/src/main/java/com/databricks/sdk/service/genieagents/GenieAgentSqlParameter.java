// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A parameter of a parameterized SQL example. */
@Generated
public class GenieAgentSqlParameter {
  /** The parameter's default value. */
  @JsonProperty("default_value")
  private GenieAgentSqlParameterDefaultValue defaultValue;

  /** Description of the parameter. */
  @JsonProperty("description")
  private String description;

  /** The name of the parameter in the SQL. */
  @JsonProperty("name")
  private String name;

  /** The parameter's data type, for example `STRING` or `INTEGER`. */
  @JsonProperty("type_hint")
  private String typeHint;

  public GenieAgentSqlParameter setDefaultValue(GenieAgentSqlParameterDefaultValue defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public GenieAgentSqlParameterDefaultValue getDefaultValue() {
    return defaultValue;
  }

  public GenieAgentSqlParameter setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieAgentSqlParameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GenieAgentSqlParameter setTypeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

  public String getTypeHint() {
    return typeHint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentSqlParameter that = (GenieAgentSqlParameter) o;
    return Objects.equals(defaultValue, that.defaultValue)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(typeHint, that.typeHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, description, name, typeHint);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentSqlParameter.class)
        .add("defaultValue", defaultValue)
        .add("description", description)
        .add("name", name)
        .add("typeHint", typeHint)
        .toString();
  }
}
