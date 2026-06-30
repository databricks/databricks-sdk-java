// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataclassification;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Wrapper message for a list of schema names. */
@Generated
public class CatalogConfigSchemaNames {
  /** */
  @JsonProperty("names")
  private Collection<String> names;

  public CatalogConfigSchemaNames setNames(Collection<String> names) {
    this.names = names;
    return this;
  }

  public Collection<String> getNames() {
    return names;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogConfigSchemaNames that = (CatalogConfigSchemaNames) o;
    return Objects.equals(names, that.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names);
  }

  @Override
  public String toString() {
    return new ToStringer(CatalogConfigSchemaNames.class).add("names", names).toString();
  }
}
