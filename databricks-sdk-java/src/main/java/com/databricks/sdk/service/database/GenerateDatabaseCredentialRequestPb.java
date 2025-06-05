// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Generates a credential that can be used to access database instances */
@Generated
class GenerateDatabaseCredentialRequestPb {
  @JsonProperty("instance_names")
  private Collection<String> instanceNames;

  @JsonProperty("request_id")
  private String requestId;

  public GenerateDatabaseCredentialRequestPb setInstanceNames(Collection<String> instanceNames) {
    this.instanceNames = instanceNames;
    return this;
  }

  public Collection<String> getInstanceNames() {
    return instanceNames;
  }

  public GenerateDatabaseCredentialRequestPb setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateDatabaseCredentialRequestPb that = (GenerateDatabaseCredentialRequestPb) o;
    return Objects.equals(instanceNames, that.instanceNames)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceNames, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateDatabaseCredentialRequestPb.class)
        .add("instanceNames", instanceNames)
        .add("requestId", requestId)
        .toString();
  }
}
