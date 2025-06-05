// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create an app */
@Generated
class CreateAppRequestPb {
  @JsonProperty("app")
  private App app;

  @JsonIgnore
  @QueryParam("no_compute")
  private Boolean noCompute;

  public CreateAppRequestPb setApp(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }

  public CreateAppRequestPb setNoCompute(Boolean noCompute) {
    this.noCompute = noCompute;
    return this;
  }

  public Boolean getNoCompute() {
    return noCompute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAppRequestPb that = (CreateAppRequestPb) o;
    return Objects.equals(app, that.app) && Objects.equals(noCompute, that.noCompute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, noCompute);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppRequestPb.class)
        .add("app", app)
        .add("noCompute", noCompute)
        .toString();
  }
}
