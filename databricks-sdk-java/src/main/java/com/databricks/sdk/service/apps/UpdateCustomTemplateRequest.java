// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateCustomTemplateRequest {
  /**
   * The name of the template. It must contain only alphanumeric characters, hyphens, underscores,
   * and whitespaces. It must be unique within the workspace.
   */
  @JsonIgnore private String name;

  /** */
  @JsonProperty("template")
  private CustomTemplate template;

  public UpdateCustomTemplateRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateCustomTemplateRequest setTemplate(CustomTemplate template) {
    this.template = template;
    return this;
  }

  public CustomTemplate getTemplate() {
    return template;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCustomTemplateRequest that = (UpdateCustomTemplateRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(template, that.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, template);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCustomTemplateRequest.class)
        .add("name", name)
        .add("template", template)
        .toString();
  }
}
