package com.databricks.sdk.core.oauth;

/**
 * An OAuth TokenSource which can be refreshed.
 *
 * <p>This class supports both synchronous and asynchronous token refresh. When async is enabled,
 * stale tokens will trigger a background refresh, while expired tokens will block until a new token
 * is fetched.
 */
public abstract class RefreshableTokenSource implements TokenSource {}
