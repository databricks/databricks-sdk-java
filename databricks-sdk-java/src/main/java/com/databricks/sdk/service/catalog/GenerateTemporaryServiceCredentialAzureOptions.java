// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The Azure cloud options to customize the requested temporary credential */
@Generated
public class GenerateTemporaryServiceCredentialAzureOptions {
  /**
   * The resources to which the temporary Azure credential should apply. These resources are the
   * scopes that are passed to the token provider (see
   * https://learn.microsoft.com/python/api/azure-core/azure.core.credentials.tokencredential?view=azure-python)
   */
  @JsonProperty("resources")
  private Collection<String> resources;

  public GenerateTemporaryServiceCredentialAzureOptions setResources(Collection<String> resources) {
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
    GenerateTemporaryServiceCredentialAzureOptions that =
        (GenerateTemporaryServiceCredentialAzureOptions) o;
    return Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryServiceCredentialAzureOptions.class)
        .add("resources", resources)
        .toString();
  }
}
