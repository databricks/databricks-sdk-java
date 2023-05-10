package com.databricks.sdk.core;

import com.databricks.sdk.core.http.Response;

class SuccessfulResponse implements ResponseProvider {
  final Response response;

  public SuccessfulResponse(Response response) {
    this.response = response;
  }

  @Override
  public Response getResponse() {
    return response;
  }
}
