// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Reference to a customer-owned UC Secret backing a secret-bearing provider field, in the
 * `ProviderSecret.secret_reference` arm.
 */
@Generated
public class ModelProviderServiceConfigSecretReference {
  /**
   * Resource name of the bound UC Secret, in the form `secrets/{catalog}.{schema}.{secret}`. On
   * Create the caller supplies the name here. On read it reflects the secret's current name at read
   * time.
   */
  @JsonProperty("name")
  private String name;

  public ModelProviderServiceConfigSecretReference setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigSecretReference that = (ModelProviderServiceConfigSecretReference) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigSecretReference.class)
        .add("name", name)
        .toString();
  }
}
