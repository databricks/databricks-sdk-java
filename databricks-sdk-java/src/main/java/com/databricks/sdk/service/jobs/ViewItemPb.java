// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ViewItemPb {
  @JsonProperty("content")
  private String content;

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private ViewType typeValue;

  public ViewItemPb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ViewItemPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ViewItemPb setType(ViewType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public ViewType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ViewItemPb that = (ViewItemPb) o;
    return Objects.equals(content, that.content)
        && Objects.equals(name, that.name)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, name, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ViewItemPb.class)
        .add("content", content)
        .add("name", name)
        .add("typeValue", typeValue)
        .toString();
  }
}
