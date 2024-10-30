// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create an app */
@Generated
public class CreateAppRequest {
  /** */
  @JsonProperty("app")
  private App app;

  public CreateAppRequest setApp(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAppRequest that = (CreateAppRequest) o;
    return Objects.equals(app, that.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppRequest.class).add("app", app).toString();
  }
}
