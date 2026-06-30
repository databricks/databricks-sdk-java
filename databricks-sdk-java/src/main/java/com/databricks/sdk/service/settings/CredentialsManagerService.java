// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Credentials manager interacts with with Identity Providers to to perform token exchanges using
 * stored credentials and refresh tokens.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CredentialsManagerService {
  /**
   * Exchange tokens with an Identity Provider to get a new access token. It allows specifying
   * scopes to determine token permissions.
   *
   * <p>POST /exchange-tokens/token is the documented public form, expressed via `google.api.http`
   * below. GET /exchange-tokens/$exchange is a legacy alias used by the Spark driver's OAuth
   * refresh path (DBHttpClient#get sends a body via HttpGetWithEntity) and stays on the legacy
   * `option (rpc).endpoints` annotation: its path contains a literal `$`, which `google.api.http`'s
   * LITERAL grammar does not allow, and `HttpPathParser` does not percent-decode template segments
   * (so encoding as `%24exchange` would not match the literal `$exchange` path the Spark driver
   * sends). Per-endpoint `visibility: PUBLIC_UNDOCUMENTED` preserves the DECO-7732 intent of
   * suppressing the GET alias from the public API spec.
   */
  ExchangeTokenResponse exchangeToken(ExchangeTokenRequest exchangeTokenRequest);
}
