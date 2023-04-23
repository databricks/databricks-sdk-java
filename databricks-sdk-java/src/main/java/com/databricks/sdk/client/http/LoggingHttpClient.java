package com.databricks.sdk.client.http;

import com.databricks.sdk.client.BodyLogger;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingHttpClient implements HttpClient {
  private final HttpClient underlying;
  private final Logger LOG = LoggerFactory.getLogger(getClass());
  private final BodyLogger bodyLogger;
  private final boolean showDebugHeaders;

  public LoggingHttpClient(HttpClient underlying) {
    this(underlying, new BodyLogger(new ObjectMapper(), 1024, 96), true);
  }

  public LoggingHttpClient(HttpClient underlying, BodyLogger bodyLogger, boolean showDebugHeaders) {
    this.underlying = underlying;
    this.bodyLogger = bodyLogger;
    this.showDebugHeaders = showDebugHeaders;
  }

  @Override
  public Response execute(Request in) throws IOException {
    LOG.debug(in.toDebugString(bodyLogger, showDebugHeaders));
    Response out = underlying.execute(in);
    LOG.debug(out.toDebugString(bodyLogger));
    return out;
  }
}
