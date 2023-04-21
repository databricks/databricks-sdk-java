package com.databricks.sdk.client;

import com.databricks.sdk.client.http.Response;
import java.io.IOException;

interface ResponseProvider {
  Response getResponse() throws IOException;
}
