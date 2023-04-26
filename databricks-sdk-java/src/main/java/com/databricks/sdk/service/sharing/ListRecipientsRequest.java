// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List share recipients
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListRecipientsRequest {
  /**
   * If not provided, all recipients will be returned. If no recipients exist with this ID, no
   * results will be returned.
   */
  @QueryParam("data_recipient_global_metastore_id")
  private String dataRecipientGlobalMetastoreId;

  /**
   * <p>Setter for the field <code>dataRecipientGlobalMetastoreId</code>.</p>
   *
   * @param dataRecipientGlobalMetastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ListRecipientsRequest} object
   */
  public ListRecipientsRequest setDataRecipientGlobalMetastoreId(
      String dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataRecipientGlobalMetastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRecipientsRequest that = (ListRecipientsRequest) o;
    return Objects.equals(dataRecipientGlobalMetastoreId, that.dataRecipientGlobalMetastoreId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dataRecipientGlobalMetastoreId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListRecipientsRequest.class)
        .add("dataRecipientGlobalMetastoreId", dataRecipientGlobalMetastoreId)
        .toString();
  }
}
