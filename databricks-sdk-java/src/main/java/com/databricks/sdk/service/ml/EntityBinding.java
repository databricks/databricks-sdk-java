// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Binds one entity column of a Lookup's upstream Feature to the input that supplies its values. */
@Generated
public class EntityBinding {
  /** Specifies the entity column of the upstream Feature. */
  @JsonProperty("entity")
  private String entity;

  /** Specifies where the column's values come from. */
  @JsonProperty("input")
  private InputReference input;

  public EntityBinding setEntity(String entity) {
    this.entity = entity;
    return this;
  }

  public String getEntity() {
    return entity;
  }

  public EntityBinding setInput(InputReference input) {
    this.input = input;
    return this;
  }

  public InputReference getInput() {
    return input;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EntityBinding that = (EntityBinding) o;
    return Objects.equals(entity, that.entity) && Objects.equals(input, that.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, input);
  }

  @Override
  public String toString() {
    return new ToStringer(EntityBinding.class).add("entity", entity).add("input", input).toString();
  }
}
