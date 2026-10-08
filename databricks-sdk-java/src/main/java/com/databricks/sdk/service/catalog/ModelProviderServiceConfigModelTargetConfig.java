// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Model target configuration shared by model provider service targets and external model
 * destinations on model services.
 */
@Generated
public class ModelProviderServiceConfigModelTargetConfig {
  /**
   * Relative path appended to a custom provider's `base_url` for this model, such as
   * `serve/openai/chat`. Only custom model provider service targets use this field; other provider
   * types ignore it, and model service destinations reject it. Do not include URI templates,
   * queries, or fragments. When empty, `base_url` is used unchanged.
   */
  @JsonProperty("endpoint_route")
  private String endpointRoute;

  /**
   * Provider-side model identifier, such as `gpt-5` or `claude-opus-4-7`. This identifies a model
   * at the upstream provider; it is not a Unity Catalog model resource.
   */
  @JsonProperty("model")
  private String model;

  /**
   * Provider-native API types supported by this model, such as `openai/v1/chat/completions`. A
   * model provider service target requires at least one value. A model service destination may omit
   * the list to use the matching provider service target's types when available. AI Gateway uses
   * the selected types for translation. At most 64 entries of 256 characters each are allowed.
   */
  @JsonProperty("native_api_types")
  private Collection<String> nativeApiTypes;

  public ModelProviderServiceConfigModelTargetConfig setEndpointRoute(String endpointRoute) {
    this.endpointRoute = endpointRoute;
    return this;
  }

  public String getEndpointRoute() {
    return endpointRoute;
  }

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
    return Objects.equals(endpointRoute, that.endpointRoute)
        && Objects.equals(model, that.model)
        && Objects.equals(nativeApiTypes, that.nativeApiTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointRoute, model, nativeApiTypes);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigModelTargetConfig.class)
        .add("endpointRoute", endpointRoute)
        .add("model", model)
        .add("nativeApiTypes", nativeApiTypes)
        .toString();
  }
}
