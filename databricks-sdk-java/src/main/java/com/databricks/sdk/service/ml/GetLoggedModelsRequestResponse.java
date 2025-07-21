// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetLoggedModelsRequestResponse {
  /** The retrieved logged models. */
  @JsonProperty("models")
  private Collection<LoggedModel> models;

  public GetLoggedModelsRequestResponse setModels(Collection<LoggedModel> models) {
    this.models = models;
    return this;
  }

  public Collection<LoggedModel> getModels() {
    return models;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLoggedModelsRequestResponse that = (GetLoggedModelsRequestResponse) o;
    return Objects.equals(models, that.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLoggedModelsRequestResponse.class).add("models", models).toString();
  }
}
