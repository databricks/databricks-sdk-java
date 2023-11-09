// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppServiceStatus {
  /** */
  @JsonProperty("deployment")
  private Object deployment;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("template")
  private Object template;

  public AppServiceStatus setDeployment(Object deployment) {
    this.deployment = deployment;
    return this;
  }

  public Object getDeployment() {
    return deployment;
  }

  public AppServiceStatus setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppServiceStatus setTemplate(Object template) {
    this.template = template;
    return this;
  }

  public Object getTemplate() {
    return template;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppServiceStatus that = (AppServiceStatus) o;
    return Objects.equals(deployment, that.deployment)
        && Objects.equals(name, that.name)
        && Objects.equals(template, that.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, name, template);
  }

  @Override
  public String toString() {
    return new ToStringer(AppServiceStatus.class)
        .add("deployment", deployment)
        .add("name", name)
        .add("template", template)
        .toString();
  }
}
