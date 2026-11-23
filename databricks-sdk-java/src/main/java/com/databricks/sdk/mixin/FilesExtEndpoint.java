package com.databricks.sdk.mixin;

import java.util.Objects;

/** One entry of the ordered endpoint list a file transfer walks, best first. */
final class FilesExtEndpoint {

  /**
   * A file transfer protocol this SDK can speak, identified by the {@code (api, api_version)} pair
   * the endpoints API returns.
   */
  enum Kind {
    IO_OFFLOAD,
    FILES_API_V2,
    FILES_API_V3
  }

  private final Kind kind;
  private final String baseUrl;
  private final boolean multipartUploadSupported;

  FilesExtEndpoint(Kind kind, String baseUrl, boolean multipartUploadSupported) {
    this.kind = Objects.requireNonNull(kind, "kind");
    this.baseUrl = Objects.requireNonNull(baseUrl, "baseUrl");
    this.multipartUploadSupported = multipartUploadSupported;
  }

  Kind kind() {
    return kind;
  }

  /** Scheme and hostname as returned by the server, e.g. https://example.cloud.databricks.com. */
  String baseUrl() {
    return baseUrl;
  }

  boolean multipartUploadSupported() {
    return multipartUploadSupported;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FilesExtEndpoint)) {
      return false;
    }
    FilesExtEndpoint that = (FilesExtEndpoint) o;
    return kind == that.kind
        && baseUrl.equals(that.baseUrl)
        && multipartUploadSupported == that.multipartUploadSupported;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, baseUrl, multipartUploadSupported);
  }

  @Override
  public String toString() {
    return "FilesExtEndpoint{"
        + kind
        + ", "
        + baseUrl
        + ", multipartUploadSupported="
        + multipartUploadSupported
        + "}";
  }
}
