// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ColumnIdentifier {
  /**
   * String representation of the column name or variant expression path. For nested fields, the
   * leaf value is what will be present in materialized tables and expected to match at query time.
   * For example, the leaf node of value:trip_details.location_details.pickup_zip is pickup_zip.
   */
  @JsonProperty("variant_expr_path")
  private String variantExprPath;

  public ColumnIdentifier setVariantExprPath(String variantExprPath) {
    this.variantExprPath = variantExprPath;
    return this;
  }

  public String getVariantExprPath() {
    return variantExprPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ColumnIdentifier that = (ColumnIdentifier) o;
    return Objects.equals(variantExprPath, that.variantExprPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantExprPath);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnIdentifier.class)
        .add("variantExprPath", variantExprPath)
        .toString();
  }
}
