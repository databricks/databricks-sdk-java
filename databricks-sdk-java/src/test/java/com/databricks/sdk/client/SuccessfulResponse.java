package com.databricks.sdk.client;

import com.databricks.sdk.client.http.Response;

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
