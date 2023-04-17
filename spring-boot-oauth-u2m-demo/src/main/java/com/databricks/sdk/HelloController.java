package com.databricks.sdk;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.oauth.Consent;
import com.databricks.sdk.client.oauth.OAuthClient;
import com.databricks.sdk.client.oauth.RefreshableCredentials;
import com.databricks.sdk.service.oauth2.CreateCustomAppIntegration;
import com.databricks.sdk.service.oauth2.CreateCustomAppIntegrationOutput;
import com.databricks.sdk.service.oauth2.CreateOAuthEnrollment;
import com.databricks.sdk.service.oauth2.OAuthEnrollmentStatus;
import com.databricks.sdk.service.sql.AccessControl;
import com.databricks.sdk.support.QueryParam;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class HelloController {
  @Autowired
  private HttpClient hc;
  private OAuthClient client;

  @Autowired
  private AppConfig config;

  @GetMapping("/setup")
  public String setupOAuthApplication(Model model) {
    return "setup";
  }

  @PostMapping("/initialize-app")
  public String initializeApp(
      @RequestParam(name="client_id") String clientId,
      @RequestParam(name="client_secret") String clientSecret,
      @RequestParam(name="hostname") String hostname) throws IOException {
    client = new OAuthClient.Builder()
        .withClientId(clientId)
        .withClientSecret(clientSecret)
        .withHost(hostname)
        .withRedirectUrl("http://localhost:" + config.getServerPort() + "/callback")
        .withHttpClient(hc)
        .build();
    return "redirect:/";
  }

  @PostMapping("/make-new-app")
  public String makeNewApp(
      @RequestParam String username,
      @RequestParam String password,
      @RequestParam String hostname) throws IOException {
    DatabricksConfig c = new DatabricksConfig();
    c.setUsername(username);
    c.setPassword(password);
    c.setHost("https://accounts.cloud.databricks.com");
    c.setAccountId("4d9d3bc8-66c3-4e5a-8a0a-551f564257f0");
    c.setDebugHeaders(true);
    c.resolve();
    DatabricksAccount account = new DatabricksAccount(c);
    account.oAuthEnrollment().create(new CreateOAuthEnrollment().setEnableAllPublishedApps(true));
    OAuthEnrollmentStatus status = account.oAuthEnrollment().get();
    CreateCustomAppIntegrationOutput result = account.customAppIntegration().create("java-sdk-demo", Collections.singletonList("https://localhost:8080/callback"));

    return initializeApp(result.getClientId(), result.getClientSecret(), hostname);
  }

  @GetMapping("/authenticate")
  public String authenticate(HttpSession session, Model model) {
    if (client == null) {
      model.addAttribute("authError", "Client is not yet initialized. Please login first.");
      return index(session, model);
    }
    Consent consent = client.initiateConsent();
    session.setAttribute("consent", consent);
    return "redirect:" + client.getAuthUrl().toString();
  }

  @GetMapping("/callback")
  public String callback(HttpSession session, @RequestParam Map<String, List<String>> allParams) throws IOException {
    Consent consent = (Consent) session.getAttribute("consent");
    RefreshableCredentials creds = consent.exchangeCallbackParameters(allParams.entrySet()
        .stream()
        .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().get(0))));
    session.setAttribute("sessionCreds", creds);
    return "redirect:/";
  }

  @GetMapping("/")
  public String index(HttpSession session, Model model) {
    if (client != null) {
      model.addAttribute("clientId", client.getClientId());
      model.addAttribute("clientSecret", client.getClientSecret());
      model.addAttribute("hostname", client.getHost());
    }
    String sessionCreds = (String) session.getAttribute("creds");
    if (sessionCreds != null) {
      model.addAttribute("sessionCreds", sessionCreds);
    }
    return "index";
  }
}
