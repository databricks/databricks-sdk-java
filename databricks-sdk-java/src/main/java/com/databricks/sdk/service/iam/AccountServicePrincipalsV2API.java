// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
 * platforms. Databricks recommends creating service principals to run production jobs or modify
 * production data. If all processes that act on production data run with service principals,
 * interactive users do not need any write, delete, or modify privileges in production. This
 * eliminates the risk of a user overwriting production data by accident.
 */
@Generated
public class AccountServicePrincipalsV2API {
  private static final Logger LOG = LoggerFactory.getLogger(AccountServicePrincipalsV2API.class);

  private final AccountServicePrincipalsV2Service impl;

  /** Regular-use constructor */
  public AccountServicePrincipalsV2API(ApiClient apiClient) {
    impl = new AccountServicePrincipalsV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public AccountServicePrincipalsV2API(AccountServicePrincipalsV2Service mock) {
    impl = mock;
  }

  /** Creates a new service principal in the Databricks account. */
  public AccountServicePrincipal create(CreateAccountServicePrincipalRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteAccountServicePrincipalRequest().setId(id));
  }

  /** Delete a single service principal in the Databricks account. */
  public void delete(DeleteAccountServicePrincipalRequest request) {
    impl.delete(request);
  }

  public AccountServicePrincipal get(String id) {
    return get(new GetAccountServicePrincipalRequest().setId(id));
  }

  /** Gets the details for a single service principal define in the Databricks account. */
  public AccountServicePrincipal get(GetAccountServicePrincipalRequest request) {
    return impl.get(request);
  }

  /** Gets the set of service principals associated with a Databricks account. */
  public Iterable<AccountServicePrincipal> list(ListAccountServicePrincipalsRequest request) {
    request.setStartIndex(1L);
    if (request.getCount() == null) {
      request.setCount(10000L);
    }
    return new Paginator<>(
        request,
        impl::list,
        ListAccountServicePrincipalsResponse::getResources,
        response -> {
          Long offset = request.getStartIndex();
          if (offset == null) {
            offset = 0L;
          }
          offset += response.getResources().size();
          return request.setStartIndex(offset);
        });
  }

  /** Partially updates the details of a single service principal in the Databricks account. */
  public void patch(PatchAccountServicePrincipalRequest request) {
    impl.patch(request);
  }

  /**
   * Updates the details of a single service principal.
   *
   * <p>This action replaces the existing service principal with the same name.
   */
  public void update(UpdateAccountServicePrincipalRequest request) {
    impl.update(request);
  }

  public AccountServicePrincipalsV2Service impl() {
    return impl;
  }
}
