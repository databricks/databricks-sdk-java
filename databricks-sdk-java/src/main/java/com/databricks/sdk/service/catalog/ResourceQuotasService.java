// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Unity Catalog enforces resource quotas on all securable objects, which limits the number of
 * resources that can be created. Quotas are expressed in terms of a resource type and a parent (for
 * example, tables per metastore or schemas per catalog). The resource quota APIs enable you to
 * monitor your current usage and limits. For more information on resource quotas see the [Unity
 * Catalog documentation].
 *
 * <p>[Unity Catalog documentation]:
 * https://docs.databricks.com/en/data-governance/unity-catalog/index.html#resource-quotas
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ResourceQuotasService {
  /**
   * The GetQuota API returns usage information for a single resource quota, defined as a
   * child-parent pair. This API also refreshes the quota count if it is out of date. Refreshes are
   * triggered asynchronously. The updated count might not be returned in the first call.
   */
  GetQuotaResponse getQuota(GetQuotaRequest getQuotaRequest);

  /**
   * ListQuotas returns all quota values under the metastore. There are no SLAs on the freshness of
   * the counts returned. This API does not trigger a refresh of quota counts.
   *
   * <p>PAGINATION BEHAVIOR: The API is by default paginated, a page may contain zero results while
   * still providing a next_page_token. Clients must continue reading pages until next_page_token is
   * absent, which is the only indication that the end of results has been reached.
   */
  ListQuotasResponse listQuotas(ListQuotasRequest listQuotasRequest);
}
