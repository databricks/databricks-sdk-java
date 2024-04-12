// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get the personalization request for a listing */
@Generated
public class GetPersonalizationRequestRequest {
  /** */
  private String listingId;

  public GetPersonalizationRequestRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPersonalizationRequestRequest that = (GetPersonalizationRequestRequest) o;
    return Objects.equals(listingId, that.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPersonalizationRequestRequest.class)
        .add("listingId", listingId)
        .toString();
  }
}
