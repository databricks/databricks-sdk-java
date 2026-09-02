// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * ---- Provider configuration (nested; see the `provider` oneof below) ---- The customer-owned
 * Unity Catalog service credential a ModelProviderService uses to authenticate to its provider,
 * referenced by name.
 */
@Generated
public class ModelProviderServiceConfigServiceCredential {
  /**
   * Resource name of the bound Unity Catalog service credential, in the form `credentials/{name}`.
   * On Create, supply the name here. On read, this field reflects the credential's current name.
   */
  @JsonProperty("name")
  private String name;

  public ModelProviderServiceConfigServiceCredential setName(String name) {
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
    ModelProviderServiceConfigServiceCredential that =
        (ModelProviderServiceConfigServiceCredential) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigServiceCredential.class)
        .add("name", name)
        .toString();
  }
}
