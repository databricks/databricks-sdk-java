// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;

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
}
