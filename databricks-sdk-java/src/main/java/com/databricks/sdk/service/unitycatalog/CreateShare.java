// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateShare {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the share. */
  @JsonProperty("name")
  private String name;

  public CreateShare setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateShare setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
