// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCustomTemplateRequest {
  /** */
  @JsonProperty("template")
  private CustomTemplate template;

  public CreateCustomTemplateRequest setTemplate(CustomTemplate template) {
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
    CreateCustomTemplateRequest that = (CreateCustomTemplateRequest) o;
    return Objects.equals(template, that.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCustomTemplateRequest.class).add("template", template).toString();
  }
}
