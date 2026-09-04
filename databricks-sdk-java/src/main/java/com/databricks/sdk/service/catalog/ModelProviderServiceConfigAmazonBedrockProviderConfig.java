// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Amazon Bedrock provider configuration. */
@Generated
public class ModelProviderServiceConfigAmazonBedrockProviderConfig {
  /** Amazon Bedrock region and authentication configuration. */
  @JsonProperty("direct")
  private ModelProviderServiceConfigAmazonBedrockProviderDirectConfig direct;

  public ModelProviderServiceConfigAmazonBedrockProviderConfig setDirect(
      ModelProviderServiceConfigAmazonBedrockProviderDirectConfig direct) {
    this.direct = direct;
    return this;
  }

  public ModelProviderServiceConfigAmazonBedrockProviderDirectConfig getDirect() {
    return direct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigAmazonBedrockProviderConfig that =
        (ModelProviderServiceConfigAmazonBedrockProviderConfig) o;
    return Objects.equals(direct, that.direct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direct);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAmazonBedrockProviderConfig.class)
        .add("direct", direct)
        .toString();
  }
}
