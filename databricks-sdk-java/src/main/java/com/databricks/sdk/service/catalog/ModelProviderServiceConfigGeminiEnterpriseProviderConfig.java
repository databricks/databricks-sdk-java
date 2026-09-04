// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Gemini Enterprise provider configuration. */
@Generated
public class ModelProviderServiceConfigGeminiEnterpriseProviderConfig {
  /** Gemini Enterprise project, region, and authentication configuration. */
  @JsonProperty("direct")
  private ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig direct;

  public ModelProviderServiceConfigGeminiEnterpriseProviderConfig setDirect(
      ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig direct) {
    this.direct = direct;
    return this;
  }

  public ModelProviderServiceConfigGeminiEnterpriseProviderDirectConfig getDirect() {
    return direct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigGeminiEnterpriseProviderConfig that =
        (ModelProviderServiceConfigGeminiEnterpriseProviderConfig) o;
    return Objects.equals(direct, that.direct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direct);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigGeminiEnterpriseProviderConfig.class)
        .add("direct", direct)
        .toString();
  }
}
