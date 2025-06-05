// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The Azure cloud options to customize the requested temporary credential */
@Generated
class GenerateTemporaryServiceCredentialAzureOptionsPb {
  @JsonProperty("resources")
  private Collection<String> resources;

  public GenerateTemporaryServiceCredentialAzureOptionsPb setResources(
      Collection<String> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<String> getResources() {
    return resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryServiceCredentialAzureOptionsPb that =
        (GenerateTemporaryServiceCredentialAzureOptionsPb) o;
    return Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryServiceCredentialAzureOptionsPb.class)
        .add("resources", resources)
        .toString();
  }
}
