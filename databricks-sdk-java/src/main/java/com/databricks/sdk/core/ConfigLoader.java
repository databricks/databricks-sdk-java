package com.databricks.sdk.core;

import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.support.InternalApi;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;
import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.SubnodeConfiguration;
import org.apache.commons.configuration2.ex.ConfigurationException;

@InternalApi
public class ConfigLoader {
  private static final Logger LOG = LoggerFactory.getLogger(ConfigLoader.class);
  private static final String SETTINGS_SECTION = "__settings__";

  private static final List<ConfigAttributeAccessor> accessors = attributeAccessors();

  static List<ConfigAttributeAccessor> attributeAccessors() {
    ArrayList<ConfigAttributeAccessor> attrs = new ArrayList<>();
    for (Field field : DatabricksConfig.class.getDeclaredFields()) {
      ConfigAttribute attribute = field.getAnnotation(ConfigAttribute.class);
      if (attribute != null) {
        attrs.add(new ConfigAttributeAccessor(attribute, field));
      }
    }
    return attrs;
  }

  public static DatabricksConfig resolve(DatabricksConfig cfg) throws DatabricksException {
    try {
      loadFromEnvironmentVariables(cfg);
      loadFromConfig(cfg); // TODO: just return new config?..
      return cfg;
    } catch (IllegalAccessException e) {
      throw new DatabricksException("Cannot create default config", e);
    }
  }

  static void loadFromEnvironmentVariables(DatabricksConfig cfg) {
    if (cfg.getEnv() == null) {
      return;
    }
    try {
      for (ConfigAttributeAccessor accessor : accessors) {
        String env = cfg.getEnv().get(accessor.getEnvVariable());
        if (isNullOrEmpty(env)) {
          continue;
        }
        // value already set in config then skip
        Object value = accessor.getValueFromConfig(cfg);
        if (!isNullOrEmpty(value)) {
          continue;
        }
        accessor.setValueOnConfig(cfg, env);
      }
    } catch (DatabricksException | IllegalAccessException e) {
      String msg =
          String.format("%s auth: %s", cfg.getCredentialsProvider().authType(), e.getMessage());
      throw new DatabricksException(msg, e);
    }
  }

  static void loadFromConfig(DatabricksConfig cfg) throws IllegalAccessException {
    if (isNullOrEmpty(cfg.getProfile())
        && (isAnyAuthConfigured(cfg)
            || !isNullOrEmpty(cfg.getHost())
            || !isNullOrEmpty(cfg.getAzureWorkspaceResourceId()))) {
      return;
    }

    String userHome = cfg.getEnv().get("HOME");
    if (isNullOrEmpty(userHome)) {
      userHome = System.getProperty("user.home");
    }

    String configFile = cfg.getConfigFile();
    boolean isDefaultConfig = false;
    if (isNullOrEmpty(configFile)) {
      configFile = Paths.get(userHome, ".databrickscfg").toString();
      isDefaultConfig = true;
    } else {
      configFile = configFile.replaceFirst("^~", userHome);
    }

    INIConfiguration ini = parseDatabricksCfg(configFile, isDefaultConfig);
    if (ini == null) return;

    ResolvedProfile resolved = resolveProfile(cfg.getProfile(), ini, configFile.toString());
    String profile = resolved.name;
    boolean isFallback = resolved.isFallback;

    SubnodeConfiguration section = ini.getSection(profile);
    boolean sectionNotPresent = section == null || section.isEmpty();
    if (sectionNotPresent) {
      if (isFallback) {
        LOG.info("{} has no {} profile configured", configFile, profile);
        return;
      }
      String msg = String.format("resolve: %s has no %s profile configured", configFile, profile);
      throw new DatabricksException(msg);
    }

    if (!isFallback) {
      cfg.setProfile(profile);
    }

    for (ConfigAttributeAccessor accessor : accessors) {
      String value = section.getString(accessor.getName());
      if (!isNullOrEmpty(accessor.getValueFromConfig(cfg))) {
        continue;
      }
      accessor.setValueOnConfig(cfg, value);
    }
  }

  static class ResolvedProfile {
    final String name;
    final boolean isFallback;

    ResolvedProfile(String name, boolean isFallback) {
      this.name = name;
      this.isFallback = isFallback;
    }
  }

  /**
   * Resolves which profile to use from the config file.
   *
   * <p>Resolution order:
   *
   * <ol>
   *   <li>Explicit profile (flag, env var, or programmatic config) with isFallback=false
   *   <li>{@code [__settings__].default_profile} with isFallback=false
   *   <li>{@code "DEFAULT"} with isFallback=true
   * </ol>
   *
   * @throws DatabricksException if the resolved profile is the reserved __settings__ section
   */
  static ResolvedProfile resolveProfile(
      String requestedProfile, INIConfiguration ini, String configFile) {
    if (!isNullOrEmpty(requestedProfile)) {
      if (SETTINGS_SECTION.equals(requestedProfile)) {
        throw new DatabricksException(
            String.format(
                "%s: %s is a reserved section name and cannot be used as a profile",
                configFile, SETTINGS_SECTION));
      }
      return new ResolvedProfile(requestedProfile, false);
    }

    SubnodeConfiguration settings = ini.getSection(SETTINGS_SECTION);
    if (settings != null && !settings.isEmpty()) {
      String defaultProfile = settings.getString("default_profile");
      if (defaultProfile != null) {
        defaultProfile = defaultProfile.trim();
      }
      if (!isNullOrEmpty(defaultProfile)) {
        if (SETTINGS_SECTION.equals(defaultProfile)) {
          throw new DatabricksException(
              String.format(
                  "%s: %s is a reserved section name and cannot be used as a profile",
                  configFile, SETTINGS_SECTION));
        }
        return new ResolvedProfile(defaultProfile, false);
      }
    }

    return new ResolvedProfile("DEFAULT", true);
  }

  private static INIConfiguration parseDatabricksCfg(String configFile, boolean isDefaultConfig) {
    INIConfiguration iniConfig = new INIConfiguration();
    try (FileReader reader = new FileReader(configFile)) {
      iniConfig.read(reader);
    } catch (FileNotFoundException e) {
      if (isDefaultConfig) {
        return null;
      }
    } catch (IOException | ConfigurationException e) {
      throw new DatabricksException("Cannot load " + configFile, e);
    }
    return iniConfig;
  }

  public static void fixHostIfNeeded(DatabricksConfig cfg) {
    if (isNullOrEmpty(cfg.getHost())) {
      return;
    }

    URL url;
    String host = cfg.getHost();
    try {
      url = new URL(host);
    } catch (MalformedURLException e) {
      // only hostname is specified
      cfg.setHost("https://" + host);
      return;
    }
    cfg.setHost(url.getProtocol() + "://" + url.getAuthority());
  }

  static void validate(DatabricksConfig cfg) throws DatabricksException {
    try {
      if (!isNullOrEmpty(cfg.getAuthType())) {
        return;
      }
      Set<String> authSet = new TreeSet<>();
      for (ConfigAttributeAccessor accessor : accessors) {
        Object value = accessor.getValueFromConfig(cfg);
        if (isNullOrEmpty(value)) {
          continue;
        }

        String authType = accessor.getAuthType();
        if (isNullOrEmpty(authType)) {
          continue;
        }
        authSet.add(authType);
      }
      if (authSet.size() <= 1) return;
      String names = String.join(" and ", authSet);
      throw new DatabricksException(
          String.format("validate: more than one authorization method configured: %s", names));
    } catch (IllegalAccessException e) {
      throw new DatabricksException("Cannot create default config", e);
    }
  }

  public static DatabricksException makeNicerError(
      String message, Exception e, DatabricksConfig cfg) {
    return makeNicerError(message, e, 200, cfg);
  }

  public static DatabricksException makeNicerError(
      String message, Exception e, Integer statusCode, DatabricksConfig cfg) {
    boolean isHttpUnauthorizedOrForbidden =
        true; // TODO - pass status code with exception, default this to false
    if (statusCode == 401 || statusCode == 402) isHttpUnauthorizedOrForbidden = true;
    String debugString = "";
    if (cfg.getEnv() != null) {
      debugString = debugString(cfg);
    }
    if (!debugString.isEmpty() && isHttpUnauthorizedOrForbidden) {
      message = String.format("%s. %s", message, debugString);
    }
    return new DatabricksException(message, e);
  }

  public static String debugString(DatabricksConfig cfg) {
    try {
      List<String> envsUsed = new ArrayList<>();
      List<String> attrsUsed = new ArrayList<>();
      List<String> buf = new ArrayList<>();

      Environment env = cfg.getEnv();
      Map<String, String> getEnvAllEnv;
      if (env != null) {
        getEnvAllEnv = env.getEnv();
      } else {
        getEnvAllEnv = new HashMap<>();
      }

      for (ConfigAttributeAccessor accessor : accessors) {
        String envVariable = accessor.getEnvVariable();
        String envValue = accessor.getEnv(getEnvAllEnv);

        if (!isNullOrEmpty(envValue) && !isNullOrEmpty(envVariable)) {
          envsUsed.add(String.format("%s", envVariable));
        }

        Object value = accessor.getValueFromConfig(cfg);
        if (isNullOrEmpty(value)) {
          continue;
        }

        String valueAsString = accessor.getAsString(value);
        if (accessor.isSensitive()) {
          valueAsString = "***";
        }

        String name = accessor.getName();
        attrsUsed.add(String.format("%s=%s", name, valueAsString));
      }
      if (!attrsUsed.isEmpty()) {
        buf.add(String.format("Config: %s", String.join(", ", attrsUsed)));
      } else {
        buf.add("Config: <empty>");
      }
      if (!envsUsed.isEmpty()) {
        buf.add(String.format("Env: %s", String.join(", ", envsUsed)));
      } else {
        buf.add("Env: <none>");
      }
      return String.join(". ", buf);
    } catch (IllegalAccessException e) {
      throw new DatabricksException(e.getMessage());
    }
  }

  public static DatabricksConfig getDefault() {
    DatabricksConfig cfg = new DatabricksConfig();
    return cfg.resolve();
  }

  public static boolean isNullOrEmpty(Object target) {
    return target == null || target.toString().isEmpty();
  }

  public static boolean isAnyAuthConfigured(DatabricksConfig cfg) throws IllegalAccessException {
    for (ConfigAttributeAccessor accessor : accessors) {
      if (isNullOrEmpty(accessor.getAuthType())) {
        continue;
      }
      Object value = accessor.getValueFromConfig(cfg);
      if (!isNullOrEmpty(value)) {
        return true;
      }
    }
    return false;
  }
}
