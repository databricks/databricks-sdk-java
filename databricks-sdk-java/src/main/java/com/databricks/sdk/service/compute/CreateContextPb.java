// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateContextPb {
  @JsonProperty("clusterId")
  private String clusterId;

  @JsonProperty("language")
  private Language language;

  public CreateContextPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public CreateContextPb setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateContextPb that = (CreateContextPb) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(language, that.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, language);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateContextPb.class)
        .add("clusterId", clusterId)
        .add("language", language)
        .toString();
  }
}
