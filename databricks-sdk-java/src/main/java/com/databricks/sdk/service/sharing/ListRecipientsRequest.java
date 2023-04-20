// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List share recipients */
public class ListRecipientsRequest {
  /**
   * If not provided, all recipients will be returned. If no recipients exist with this ID, no
   * results will be returned.
   */
  @QueryParam("data_recipient_global_metastore_id")
  private String dataRecipientGlobalMetastoreId;

  public ListRecipientsRequest setDataRecipientGlobalMetastoreId(
      String dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  public String getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRecipientsRequest that = (ListRecipientsRequest) o;
    return Objects.equals(dataRecipientGlobalMetastoreId, that.dataRecipientGlobalMetastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataRecipientGlobalMetastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRecipientsRequest.class)
        .add("dataRecipientGlobalMetastoreId", dataRecipientGlobalMetastoreId)
        .toString();
  }
}
