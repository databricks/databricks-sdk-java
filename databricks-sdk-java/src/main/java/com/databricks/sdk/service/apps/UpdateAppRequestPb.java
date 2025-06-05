// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update an app */
@Generated
class UpdateAppRequestPb {
  @JsonProperty("app")
  private App app;

  @JsonIgnore private String name;

  public UpdateAppRequestPb setApp(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }

  public UpdateAppRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAppRequestPb that = (UpdateAppRequestPb) o;
    return Objects.equals(app, that.app) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAppRequestPb.class).add("app", app).add("name", name).toString();
  }
}
