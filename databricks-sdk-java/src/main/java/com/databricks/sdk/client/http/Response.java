package com.databricks.sdk.client.http;

public class Response {
  private Request request;
  private int statusCode;
  private String status;
  private String body;

  public Response(Request request, int statusCode, String status, String body) {
    this.request = request;
    this.statusCode = statusCode;
    this.status = status;
    this.body = body;
  }

  public Response(String body) {
    this(new Request("GET", "/"), 200, "OK", body);
  }

  public Request getRequest() {
    return request;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public String getStatus() {
    return status;
  }

  public String getBody() {
    return body;
  }

  @Override
  public String toString() {
    return String.format("%d %s", statusCode, status);
  }
}
