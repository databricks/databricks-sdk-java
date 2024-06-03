// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/** Get one batch of providers. One may specify up to 50 IDs per request. */
@Generated
public class BatchGetProvidersRequest {
  /** */
  @QueryParam("ids")
  private Collection<String> ids;

  public BatchGetProvidersRequest setIds(Collection<String> ids) {
    this.ids = ids;
    return this;
  }

  public Collection<String> getIds() {
    return ids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BatchGetProvidersRequest that = (BatchGetProvidersRequest) o;
    return Objects.equals(ids, that.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchGetProvidersRequest.class).add("ids", ids).toString();
  }
}
