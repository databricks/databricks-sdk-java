// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Azure OpenAI provider configuration. */
@Generated
public class ModelProviderServiceConfigAzureOpenAiProviderConfig {
  /** */
  @JsonProperty("direct")
  private ModelProviderServiceConfigAzureOpenAiProviderDirectConfig direct;

  public ModelProviderServiceConfigAzureOpenAiProviderConfig setDirect(
      ModelProviderServiceConfigAzureOpenAiProviderDirectConfig direct) {
    this.direct = direct;
    return this;
  }

  public ModelProviderServiceConfigAzureOpenAiProviderDirectConfig getDirect() {
    return direct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigAzureOpenAiProviderConfig that =
        (ModelProviderServiceConfigAzureOpenAiProviderConfig) o;
    return Objects.equals(direct, that.direct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direct);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAzureOpenAiProviderConfig.class)
        .add("direct", direct)
        .toString();
  }
}
