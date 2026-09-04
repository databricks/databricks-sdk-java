// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Microsoft Foundry provider configuration. */
@Generated
public class ModelProviderServiceConfigMicrosoftFoundryProviderConfig {
  /** Microsoft Foundry endpoint and authentication configuration. */
  @JsonProperty("direct")
  private ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig direct;

  public ModelProviderServiceConfigMicrosoftFoundryProviderConfig setDirect(
      ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig direct) {
    this.direct = direct;
    return this;
  }

  public ModelProviderServiceConfigMicrosoftFoundryProviderDirectConfig getDirect() {
    return direct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigMicrosoftFoundryProviderConfig that =
        (ModelProviderServiceConfigMicrosoftFoundryProviderConfig) o;
    return Objects.equals(direct, that.direct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direct);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigMicrosoftFoundryProviderConfig.class)
        .add("direct", direct)
        .toString();
  }
}
