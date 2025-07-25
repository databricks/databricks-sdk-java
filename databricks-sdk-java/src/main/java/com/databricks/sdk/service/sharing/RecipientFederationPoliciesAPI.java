// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Recipient Federation Policies APIs are only applicable in the open sharing model where the
 * recipient object has the authentication type of `OIDC_RECIPIENT`, enabling data sharing from
 * Databricks to non-Databricks recipients. OIDC Token Federation enables secure, secret-less
 * authentication for accessing Delta Sharing servers. Users and applications authenticate using
 * short-lived OIDC tokens issued by their own Identity Provider (IdP), such as Azure Entra ID or
 * Okta, without the need for managing static credentials or client secrets. A federation policy
 * defines how non-Databricks recipients authenticate using OIDC tokens. It validates the OIDC
 * claims in federated tokens and is set at the recipient level. The caller must be the owner of the
 * recipient to create or manage a federation policy. Federation policies support the following
 * scenarios: - User-to-Machine (U2M) flow: A user accesses Delta Shares using their own identity,
 * such as connecting through PowerBI Delta Sharing Client. - Machine-to-Machine (M2M) flow: An
 * application accesses Delta Shares using its own identity, typically for automation tasks like
 * nightly jobs through Python Delta Sharing Client. OIDC Token Federation enables fine-grained
 * access control, supports Multi-Factor Authentication (MFA), and enhances security by minimizing
 * the risk of credential leakage through the use of short-lived, expiring tokens. It is designed
 * for strong identity governance, secure cross-platform data sharing, and reduced operational
 * overhead for credential management.
 *
 * <p>For more information, see
 * https://www.databricks.com/blog/announcing-oidc-token-federation-enhanced-delta-sharing-security
 * and https://docs.databricks.com/en/delta-sharing/create-recipient-oidc-fed
 */
@Generated
public class RecipientFederationPoliciesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RecipientFederationPoliciesAPI.class);

  private final RecipientFederationPoliciesService impl;

  /** Regular-use constructor */
  public RecipientFederationPoliciesAPI(ApiClient apiClient) {
    impl = new RecipientFederationPoliciesImpl(apiClient);
  }

  /** Constructor for mocks */
  public RecipientFederationPoliciesAPI(RecipientFederationPoliciesService mock) {
    impl = mock;
  }

  /**
   * Create a federation policy for an OIDC_FEDERATION recipient for sharing data from Databricks to
   * non-Databricks recipients. The caller must be the owner of the recipient. When sharing data
   * from Databricks to non-Databricks clients, you can define a federation policy to authenticate
   * non-Databricks recipients. The federation policy validates OIDC claims in federated tokens and
   * is defined at the recipient level. This enables secretless sharing clients to authenticate
   * using OIDC tokens.
   *
   * <p>Supported scenarios for federation policies: 1. **User-to-Machine (U2M) flow** (e.g.,
   * PowerBI): A user accesses a resource using their own identity. 2. **Machine-to-Machine (M2M)
   * flow** (e.g., OAuth App): An OAuth App accesses a resource using its own identity, typically
   * for tasks like running nightly jobs.
   *
   * <p>For an overview, refer to: - Blog post: Overview of feature:
   * https://www.databricks.com/blog/announcing-oidc-token-federation-enhanced-delta-sharing-security
   *
   * <p>For detailed configuration guides based on your use case: - Creating a Federation Policy as
   * a provider: https://docs.databricks.com/en/delta-sharing/create-recipient-oidc-fed -
   * Configuration and usage for Machine-to-Machine (M2M) applications (e.g., Python Delta Sharing
   * Client): https://docs.databricks.com/aws/en/delta-sharing/sharing-over-oidc-m2m - Configuration
   * and usage for User-to-Machine (U2M) applications (e.g., PowerBI):
   * https://docs.databricks.com/aws/en/delta-sharing/sharing-over-oidc-u2m
   */
  public FederationPolicy create(CreateFederationPolicyRequest request) {
    return impl.create(request);
  }

  public void delete(String recipientName, String name) {
    delete(new DeleteFederationPolicyRequest().setRecipientName(recipientName).setName(name));
  }

  /**
   * Deletes an existing federation policy for an OIDC_FEDERATION recipient. The caller must be the
   * owner of the recipient.
   */
  public void delete(DeleteFederationPolicyRequest request) {
    impl.delete(request);
  }

  public FederationPolicy getFederationPolicy(String recipientName, String name) {
    return getFederationPolicy(
        new GetFederationPolicyRequest().setRecipientName(recipientName).setName(name));
  }

  /**
   * Reads an existing federation policy for an OIDC_FEDERATION recipient for sharing data from
   * Databricks to non-Databricks recipients. The caller must have read access to the recipient.
   */
  public FederationPolicy getFederationPolicy(GetFederationPolicyRequest request) {
    return impl.getFederationPolicy(request);
  }

  public Iterable<FederationPolicy> list(String recipientName) {
    return list(new ListFederationPoliciesRequest().setRecipientName(recipientName));
  }

  /**
   * Lists federation policies for an OIDC_FEDERATION recipient for sharing data from Databricks to
   * non-Databricks recipients. The caller must have read access to the recipient.
   */
  public Iterable<FederationPolicy> list(ListFederationPoliciesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListFederationPoliciesResponse::getPolicies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates an existing federation policy for an OIDC_RECIPIENT. The caller must be the owner of
   * the recipient.
   */
  public FederationPolicy update(UpdateFederationPolicyRequest request) {
    return impl.update(request);
  }

  public RecipientFederationPoliciesService impl() {
    return impl;
  }
}
