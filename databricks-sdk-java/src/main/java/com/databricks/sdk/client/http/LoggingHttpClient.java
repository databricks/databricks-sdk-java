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

  private String makeLogRecord(Request in, Response out) {
    StringBuilder sb = new StringBuilder();
    sb.append(in.toDebugString(bodyLogger, showDebugHeaders));
    sb.append(out.toDebugString(bodyLogger));
    return sb.toString();
  }

  @Override
  public Response execute(Request in) throws IOException {
    Response out = underlying.execute(in);
    if (LOG.isDebugEnabled()) {
      LOG.debug(makeLogRecord(in, out));
    }
    return out;
  }
}
