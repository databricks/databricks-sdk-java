package com.databricks.sdk.core.http;

import java.util.function.Function;

/** A class that allows modifying HTTP requests by applying transformation functions. */
public class RequestOptions {
  private Function<Request, Request> authenticateFunc;
  private Function<Request, Request> urlFunc;
  private Function<Request, Request> userAgentFunc;

  public RequestOptions() {
    // Default to identity functions
    this.authenticateFunc = request -> request;
    this.urlFunc = request -> request;
    this.userAgentFunc = request -> request;
  }

  public RequestOptions withAuthorization(String authorization) {
    this.authenticateFunc = request -> request.withHeader("Authorization", authorization);
    return this;
  }

  public RequestOptions withUrl(String url) {
    this.urlFunc = request -> request.withUrl(url);
    return this;
  }

  public RequestOptions withUserAgent(String userAgent) {
    this.userAgentFunc = request -> request.withHeader("User-Agent", userAgent);
    return this;
  }

  public Request applyOptions(Request request) {
    // Apply all transformation functions in sequence
    return userAgentFunc.apply(urlFunc.apply(authenticateFunc.apply(request)));
  }
}
