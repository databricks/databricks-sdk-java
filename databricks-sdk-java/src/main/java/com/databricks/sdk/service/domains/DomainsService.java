// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.domains;

import com.databricks.sdk.support.Generated;

/**
 * Manage domains for organizing and discovering data assets.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DomainsService {
  /** Create a domain. If `domain_id` is omitted, the server generates one. */
  Domain createDomain(CreateDomainRequest createDomainRequest);

  /**
   * Delete a domain. By default the request fails if the domain still has Glossary pages; set
   * `force` to delete those pages along with the domain.
   */
  void deleteDomain(DeleteDomainRequest deleteDomainRequest);

  /**
   * Get a domain by resource name.
   *
   * <p>Authorization: external callers must have the `MANAGE DISCOVERY` permission.
   */
  Domain getDomain(GetDomainRequest getDomainRequest);

  /**
   * List domains in the account. Set `parent_domain_id` to return only the direct subdomains of a
   * given domain.
   *
   * <p>Authorization: external callers must have the `MANAGE DISCOVERY` permission; only domains
   * the caller is authorized to read are returned.
   */
  ListDomainsResponse listDomains(ListDomainsRequest listDomainsRequest);

  /**
   * Update a domain. `update_mask` selects which fields to modify; the domain is identified by its
   * resource `name`.
   */
  Domain updateDomain(UpdateDomainRequest updateDomainRequest);
}
