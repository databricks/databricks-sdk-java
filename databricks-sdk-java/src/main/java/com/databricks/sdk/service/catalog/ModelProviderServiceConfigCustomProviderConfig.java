// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Custom provider configuration: arbitrary HTTP endpoint with bearer-token auth. */
@Generated
public class ModelProviderServiceConfigCustomProviderConfig {
  /** */
  @JsonProperty("direct")
  private ModelProviderServiceConfigCustomProviderDirectConfig direct;

  public ModelProviderServiceConfigCustomProviderConfig setDirect(
      ModelProviderServiceConfigCustomProviderDirectConfig direct) {
    this.direct = direct;
    return this;
  }

  public ModelProviderServiceConfigCustomProviderDirectConfig getDirect() {
    return direct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigCustomProviderConfig that =
        (ModelProviderServiceConfigCustomProviderConfig) o;
    return Objects.equals(direct, that.direct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direct);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigCustomProviderConfig.class)
        .add("direct", direct)
        .toString();
  }
}
