// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ViewItem {
  /** Content of the view. */
  @JsonProperty("content")
  private String content;

  /**
   * Name of the view item. In the case of code view, it would be the notebook’s name. In the case
   * of dashboard view, it would be the dashboard’s name.
   */
  @JsonProperty("name")
  private String name;

  /** Type of the view item. */
  @JsonProperty("type")
  private ViewType typeValue;

  public ViewItem setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ViewItem setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ViewItem setType(ViewType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public ViewType getType() {
    return typeValue;
  }
}
