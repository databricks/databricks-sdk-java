// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateAppRequest {
  /** */
  @JsonProperty("app")
  private App app;

  /** If true, the app will not be started after creation. */
  @JsonIgnore
  @QueryParam("no_compute")
  private Boolean noCompute;

  public CreateAppRequest setApp(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }

  public CreateAppRequest setNoCompute(Boolean noCompute) {
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
    CreateAppRequest that = (CreateAppRequest) o;
    return Objects.equals(app, that.app) && Objects.equals(noCompute, that.noCompute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, noCompute);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppRequest.class)
        .add("app", app)
        .add("noCompute", noCompute)
        .toString();
  }
}
