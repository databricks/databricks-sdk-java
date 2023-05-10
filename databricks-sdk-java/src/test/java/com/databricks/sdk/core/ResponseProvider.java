package com.databricks.sdk.core;

import com.databricks.sdk.core.http.Response;
import java.io.IOException;

interface ResponseProvider {
  Response getResponse() throws IOException;
}
