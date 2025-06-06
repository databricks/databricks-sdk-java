// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Generates a credential that can be used to access database instances */
@Generated
public class GenerateDatabaseCredentialRequest {
  /** Instances to which the token will be scoped. */
  @JsonProperty("instance_names")
  private Collection<String> instanceNames;

  /** */
  @JsonProperty("request_id")
  private String requestId;

  public GenerateDatabaseCredentialRequest setInstanceNames(Collection<String> instanceNames) {
    this.instanceNames = instanceNames;
    return this;
  }

  public Collection<String> getInstanceNames() {
    return instanceNames;
  }

  public GenerateDatabaseCredentialRequest setRequestId(String requestId) {
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
    GenerateDatabaseCredentialRequest that = (GenerateDatabaseCredentialRequest) o;
    return Objects.equals(instanceNames, that.instanceNames)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceNames, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateDatabaseCredentialRequest.class)
        .add("instanceNames", instanceNames)
        .add("requestId", requestId)
        .toString();
  }
}
