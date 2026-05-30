package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;
import java.util.Objects;

/**
 * Semver version triple of the Databricks CLI used for capability gating.
 *
 * <p>Three sentinel states in the (major, minor, patch) tuple:
 *
 * <ul>
 *   <li>{@code (-1, -1, -1)} — the {@link #UNKNOWN} sentinel, meaning version detection failed. It
 *       compares less than every real release so every feature gate fails.
 *   <li>{@code (0, 0, 0)} — the CLI's default dev build, emitted when the binary was built without
 *       version metadata. See {@link #isDefaultDevBuild()}.
 *   <li>anything else — a real CLI version.
 * </ul>
 *
 * <p>Prerelease tags are deliberately ignored: feature gates are release-based, so a prerelease of
 * a version with a flag is assumed to have the flag too.
 */
@InternalApi
public final class DatabricksCliVersion implements Comparable<DatabricksCliVersion> {
  public static final DatabricksCliVersion UNKNOWN = new DatabricksCliVersion(-1, -1, -1);

  /** Default dev build sentinel — emitted when the CLI was built without version metadata. */
  public static final DatabricksCliVersion DEFAULT_DEV_BUILD = new DatabricksCliVersion(0, 0, 0);

  private final int major;
  private final int minor;
  private final int patch;

  // Package-private so tests and the credentials provider can construct concrete versions, but
  // external callers cannot manufacture another instance that .equals(UNKNOWN) but isn't the
  // singleton.
  DatabricksCliVersion(int major, int minor, int patch) {
    this.major = major;
    this.minor = minor;
    this.patch = patch;
  }

  public int getMajor() {
    return major;
  }

  public int getMinor() {
    return minor;
  }

  public int getPatch() {
    return patch;
  }

  /** Returns true when {@code this} is greater than or equal to {@code other}. */
  public boolean atLeast(DatabricksCliVersion other) {
    return compareTo(other) >= 0;
  }

  /**
   * Returns true when the version is the CLI's {@link #DEFAULT_DEV_BUILD} sentinel. A CLI built
   * without version metadata leaves these fields at their zero defaults.
   */
  public boolean isDefaultDevBuild() {
    return equals(DEFAULT_DEV_BUILD);
  }

  @Override
  public int compareTo(DatabricksCliVersion o) {
    int c = Integer.compare(major, o.major);
    if (c != 0) return c;
    c = Integer.compare(minor, o.minor);
    if (c != 0) return c;
    return Integer.compare(patch, o.patch);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DatabricksCliVersion)) return false;
    DatabricksCliVersion that = (DatabricksCliVersion) o;
    return major == that.major && minor == that.minor && patch == that.patch;
  }

  @Override
  public int hashCode() {
    return Objects.hash(major, minor, patch);
  }

  @Override
  public String toString() {
    if (equals(UNKNOWN)) {
      return "unknown";
    }
    if (isDefaultDevBuild()) {
      return "v0.0.0-dev";
    }
    return "v" + major + "." + minor + "." + patch;
  }
}
