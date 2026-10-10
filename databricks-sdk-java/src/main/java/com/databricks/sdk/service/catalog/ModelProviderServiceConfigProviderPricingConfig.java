// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Pricing adjustments applied to this provider service's external-model spend estimates. */
@Generated
public class ModelProviderServiceConfigProviderPricingConfig {
  /**
   * Provider-wide adjustment to external-model spend estimates in basis points: 2000 = 20% off;
   * -2000 = a 20% markup. Negative values have no lower bound beyond the int32 range. Values cannot
   * exceed 10000 (100% off). An omitted value or zero leaves the estimate unchanged.
   */
  @JsonProperty("default_discount_basis_points")
  private Long defaultDiscountBasisPoints;

  public ModelProviderServiceConfigProviderPricingConfig setDefaultDiscountBasisPoints(
      Long defaultDiscountBasisPoints) {
    this.defaultDiscountBasisPoints = defaultDiscountBasisPoints;
    return this;
  }

  public Long getDefaultDiscountBasisPoints() {
    return defaultDiscountBasisPoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigProviderPricingConfig that =
        (ModelProviderServiceConfigProviderPricingConfig) o;
    return Objects.equals(defaultDiscountBasisPoints, that.defaultDiscountBasisPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultDiscountBasisPoints);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigProviderPricingConfig.class)
        .add("defaultDiscountBasisPoints", defaultDiscountBasisPoints)
        .toString();
  }
}
