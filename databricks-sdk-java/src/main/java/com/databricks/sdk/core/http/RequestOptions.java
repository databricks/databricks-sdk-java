package com.databricks.sdk.core.http;

import java.util.function.Function;

/**
 * A builder class for configuring HTTP request transformations including authentication, URL, and
 * user agent headers.
 *
 * <p>Experimental: this class is experimental and subject to change in backward incompatible ways.
 */
public class RequestOptions {
  private Function<Request, Request> authenticateFunc;
  private Function<Request, Request> urlFunc;
  private Function<Request, Request> userAgentFunc;

  /**
   * Constructs a new RequestOptions instance with default identity functions. Initially, all
   * transformations are set to pass through the request unchanged.
   */
  public RequestOptions() {
    // Default to identity functions
    this.authenticateFunc = request -> request;
    this.urlFunc = request -> request;
    this.userAgentFunc = request -> request;
  }

  /**
   * Sets the authorization header for the request.
   *
   * @param authorization The authorization value to be set in the header
   * @return This RequestOptions instance for method chaining
   */
  public RequestOptions withAuthorization(String authorization) {
    this.authenticateFunc = request -> request.withHeader("Authorization", authorization);
    return this;
  }

  /**
   * Sets the URL for the request.
   *
   * @param url The URL to be set for the request
   * @return This RequestOptions instance for method chaining
   */
  public RequestOptions withUrl(String url) {
    this.urlFunc = request -> request.withUrl(url);
    return this;
  }

  /**
   * Sets the User-Agent header for the request.
   *
   * @param userAgent The user agent string to be set in the header
   * @return This RequestOptions instance for method chaining
   */
  public RequestOptions withUserAgent(String userAgent) {
    this.userAgentFunc = request -> request.withHeader("User-Agent", userAgent);
    return this;
  }

  /**
   * Applies all configured transformations to the given request. The transformations are applied in
   * the following order: 1. Authentication 2. URL 3. User-Agent
   *
   * @param request The original request to be transformed
   * @return A new Request instance with all transformations applied
   */
  public Request applyOptions(Request request) {
    // Apply all transformation functions in sequence
    return userAgentFunc.apply(urlFunc.apply(authenticateFunc.apply(request)));
  }
}
