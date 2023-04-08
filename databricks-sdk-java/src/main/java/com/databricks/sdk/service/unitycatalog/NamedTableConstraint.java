// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NamedTableConstraint {
  /** The name of the constraint. */
  @JsonProperty("name")
  private String name;

  public NamedTableConstraint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
