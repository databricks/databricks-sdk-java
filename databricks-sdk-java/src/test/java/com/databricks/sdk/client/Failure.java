package com.databricks.sdk.client;

import com.databricks.sdk.client.http.Response;
import java.io.IOException;

class Failure implements ResponseProvider {
  final IOException exception;

  public Failure(IOException exception) {
    this.exception = exception;
  }

  @Override
  public Response getResponse() throws IOException {
    throw exception;
  }
}
