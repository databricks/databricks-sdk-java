// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.domains;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Manage domains for organizing and discovering data assets. */
@Generated
public class DomainsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DomainsAPI.class);

  private final DomainsService impl;

  /** Regular-use constructor */
  public DomainsAPI(ApiClient apiClient) {
    impl = new DomainsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DomainsAPI(DomainsService mock) {
    impl = mock;
  }

  /** Create a domain. If `domain_id` is omitted, the server generates one. */
  public Domain createDomain(CreateDomainRequest request) {
    return impl.createDomain(request);
  }

  public void deleteDomain(String name) {
    deleteDomain(new DeleteDomainRequest().setName(name));
  }

  /**
   * Delete a domain. By default the request fails if the domain still has Glossary pages; set
   * `force` to delete those pages along with the domain.
   */
  public void deleteDomain(DeleteDomainRequest request) {
    impl.deleteDomain(request);
  }

  public Domain getDomain(String name) {
    return getDomain(new GetDomainRequest().setName(name));
  }

  /**
   * Get a domain by resource name.
   *
   * <p>Authorization: external callers must have the `MANAGE DISCOVERY` permission.
   */
  public Domain getDomain(GetDomainRequest request) {
    return impl.getDomain(request);
  }

  /**
   * List domains in the account. Set `parent_domain_id` to return only the direct subdomains of a
   * given domain.
   *
   * <p>Authorization: external callers must have the `MANAGE DISCOVERY` permission; only domains
   * the caller is authorized to read are returned.
   */
  public Iterable<Domain> listDomains(ListDomainsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listDomains,
        ListDomainsResponse::getDomains,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Update a domain. `update_mask` selects which fields to modify; the domain is identified by its
   * resource `name`.
   */
  public Domain updateDomain(UpdateDomainRequest request) {
    return impl.updateDomain(request);
  }

  public DomainsService impl() {
    return impl;
  }
}
