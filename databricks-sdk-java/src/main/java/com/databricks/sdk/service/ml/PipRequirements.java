// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Pip requirements to install in a serving container. */
@Generated
public class PipRequirements {
  /** Pip requirement strings (PEP 508) or UC Volume whl paths (/Volumes/...). */
  @JsonProperty("requirements")
  private Collection<String> requirements;

  public PipRequirements setRequirements(Collection<String> requirements) {
    this.requirements = requirements;
    return this;
  }

  public Collection<String> getRequirements() {
    return requirements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipRequirements that = (PipRequirements) o;
    return Objects.equals(requirements, that.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirements);
  }

  @Override
  public String toString() {
    return new ToStringer(PipRequirements.class).add("requirements", requirements).toString();
  }
}
