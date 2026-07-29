// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** OpenAI provider configuration. */
@Generated
public class ModelProviderServiceConfigOpenAiProviderConfig {
  /** */
  @JsonProperty("direct")
  private ModelProviderServiceConfigOpenAiProviderDirectConfig direct;

  public ModelProviderServiceConfigOpenAiProviderConfig setDirect(
      ModelProviderServiceConfigOpenAiProviderDirectConfig direct) {
    this.direct = direct;
    return this;
  }

  public ModelProviderServiceConfigOpenAiProviderDirectConfig getDirect() {
    return direct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigOpenAiProviderConfig that =
        (ModelProviderServiceConfigOpenAiProviderConfig) o;
    return Objects.equals(direct, that.direct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direct);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigOpenAiProviderConfig.class)
        .add("direct", direct)
        .toString();
  }
}
