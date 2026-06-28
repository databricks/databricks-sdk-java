// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateProviderAnalyticsDashboardRequest {
  /** id is immutable property and can't be updated. */
  @JsonIgnore private String id;

  /**
   * this is the version of the dashboard template we want to update our user to current expectation
   * is that it should be equal to latest version of the dashboard template
   */
  @JsonProperty("version")
  private Long version;

  public UpdateProviderAnalyticsDashboardRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateProviderAnalyticsDashboardRequest setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateProviderAnalyticsDashboardRequest that = (UpdateProviderAnalyticsDashboardRequest) o;
    return Objects.equals(id, that.id) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProviderAnalyticsDashboardRequest.class)
        .add("id", id)
        .add("version", version)
        .toString();
  }
}
