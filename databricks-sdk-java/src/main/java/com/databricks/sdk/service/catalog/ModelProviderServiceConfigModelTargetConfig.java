// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Model target configuration for an external model destination. */
@Generated
public class ModelProviderServiceConfigModelTargetConfig {
  /**
   * Provider-side model identifier, such as `gpt-5` or `claude-opus-4-7`. This identifies a model
   * at the upstream provider; it is not a Unity Catalog model resource.
   */
  @JsonProperty("model")
  private String model;

  /**
   * Provider-native API types supported by this model, such as `openai/v1/chat/completions`. AI
   * Gateway uses these values to translate requests and responses. At most 64 entries of 256
   * characters each are allowed.
   */
  @JsonProperty("native_api_types")
  private Collection<String> nativeApiTypes;

  public ModelProviderServiceConfigModelTargetConfig setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  public ModelProviderServiceConfigModelTargetConfig setNativeApiTypes(
      Collection<String> nativeApiTypes) {
    this.nativeApiTypes = nativeApiTypes;
    return this;
  }

  public Collection<String> getNativeApiTypes() {
    return nativeApiTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigModelTargetConfig that =
        (ModelProviderServiceConfigModelTargetConfig) o;
    return Objects.equals(model, that.model) && Objects.equals(nativeApiTypes, that.nativeApiTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, nativeApiTypes);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigModelTargetConfig.class)
        .add("model", model)
        .add("nativeApiTypes", nativeApiTypes)
        .toString();
  }
}
