// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unity Catalog enforces resource quotas on all securable objects, which limits the number of
 * resources that can be created. Quotas are expressed in terms of a resource type and a parent (for
 * example, tables per metastore or schemas per catalog). The resource quota APIs enable you to
 * monitor your current usage and limits. For more information on resource quotas see the [Unity
 * Catalog documentation].
 *
 * <p>[Unity Catalog documentation]:
 * https://docs.databricks.com/en/data-governance/unity-catalog/index.html#resource-quotas
 */
@Generated
public class ResourceQuotasAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ResourceQuotasAPI.class);

  private final ResourceQuotasService impl;

  /** Regular-use constructor */
  public ResourceQuotasAPI(ApiClient apiClient) {
    impl = new ResourceQuotasImpl(apiClient);
  }

  /** Constructor for mocks */
  public ResourceQuotasAPI(ResourceQuotasService mock) {
    impl = mock;
  }

  public GetQuotaResponse getQuota(
      String parentSecurableType, String parentFullName, String quotaName) {
    return getQuota(
        new GetQuotaRequest()
            .setParentSecurableType(parentSecurableType)
            .setParentFullName(parentFullName)
            .setQuotaName(quotaName));
  }

  /**
   * The GetQuota API returns usage information for a single resource quota, defined as a
   * child-parent pair. This API also refreshes the quota count if it is out of date. Refreshes are
   * triggered asynchronously. The updated count might not be returned in the first call.
   */
  public GetQuotaResponse getQuota(GetQuotaRequest request) {
    return impl.getQuota(request);
  }

  /**
   * ListQuotas returns all quota values under the metastore. There are no SLAs on the freshness of
   * the counts returned. This API does not trigger a refresh of quota counts.
   *
   * <p>PAGINATION BEHAVIOR: The API is by default paginated, a page may contain zero results while
   * still providing a next_page_token. Clients must continue reading pages until next_page_token is
   * absent, which is the only indication that the end of results has been reached.
   */
  public Iterable<QuotaInfo> listQuotas(ListQuotasRequest request) {
    return new Paginator<>(
        request,
        impl::listQuotas,
        ListQuotasResponse::getQuotas,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ResourceQuotasService impl() {
    return impl;
  }
}
