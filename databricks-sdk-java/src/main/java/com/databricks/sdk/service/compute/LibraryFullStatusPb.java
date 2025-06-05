// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The status of the library on a specific cluster. */
@Generated
class LibraryFullStatusPb {
  @JsonProperty("is_library_for_all_clusters")
  private Boolean isLibraryForAllClusters;

  @JsonProperty("library")
  private Library library;

  @JsonProperty("messages")
  private Collection<String> messages;

  @JsonProperty("status")
  private LibraryInstallStatus status;

  public LibraryFullStatusPb setIsLibraryForAllClusters(Boolean isLibraryForAllClusters) {
    this.isLibraryForAllClusters = isLibraryForAllClusters;
    return this;
  }

  public Boolean getIsLibraryForAllClusters() {
    return isLibraryForAllClusters;
  }

  public LibraryFullStatusPb setLibrary(Library library) {
    this.library = library;
    return this;
  }

  public Library getLibrary() {
    return library;
  }

  public LibraryFullStatusPb setMessages(Collection<String> messages) {
    this.messages = messages;
    return this;
  }

  public Collection<String> getMessages() {
    return messages;
  }

  public LibraryFullStatusPb setStatus(LibraryInstallStatus status) {
    this.status = status;
    return this;
  }

  public LibraryInstallStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LibraryFullStatusPb that = (LibraryFullStatusPb) o;
    return Objects.equals(isLibraryForAllClusters, that.isLibraryForAllClusters)
        && Objects.equals(library, that.library)
        && Objects.equals(messages, that.messages)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLibraryForAllClusters, library, messages, status);
  }

  @Override
  public String toString() {
    return new ToStringer(LibraryFullStatusPb.class)
        .add("isLibraryForAllClusters", isLibraryForAllClusters)
        .add("library", library)
        .add("messages", messages)
        .add("status", status)
        .toString();
  }
}
