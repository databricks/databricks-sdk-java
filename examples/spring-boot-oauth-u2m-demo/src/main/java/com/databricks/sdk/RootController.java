package com.databricks.sdk;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.oauth.Consent;
import com.databricks.sdk.core.oauth.OAuthClient;
import com.databricks.sdk.core.oauth.RefreshableCredentials;
import com.databricks.sdk.service.compute.ClusterInfo;
import com.databricks.sdk.service.compute.ListClustersRequest;
import com.databricks.sdk.service.oauth2.CreateCustomAppIntegrationOutput;
import com.databricks.sdk.service.oauth2.CreateOAuthEnrollment;
import com.databricks.sdk.service.oauth2.OAuthEnrollmentStatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class RootController {
  @Autowired
  private HttpClient hc;

  @Autowired
  private ObjectMapper mapper;

  // Initialized by initializeApp(). This should be initialized in a more Spring-friendly way.
  private OAuthClient client;
  // Initialized by callback(). This should be initialized in a more Spring-friendly way.
  private WorkspaceClient workspace;

  @Value("${server.port}")
  private int serverPort;

  private String getRedirectUrl() {
    return "http://localhost:" + serverPort + "/callback";
  }

  @GetMapping("/")
  public String index(HttpSession session, Model model) throws JsonProcessingException {
    if (client != null) {
      model.addAttribute("clientId", client.getClientId());
      model.addAttribute("clientSecret", client.getClientSecret());
      model.addAttribute("hostname", client.getHost());
    }
    RefreshableCredentials sessionCreds = (RefreshableCredentials) session.getAttribute("sessionCreds");
    if (sessionCreds != null) {
      model.addAttribute("sessionCreds", mapper.writeValueAsString(sessionCreds.getToken()));
    }
    return "index";
  }

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
        .withRedirectUrl(getRedirectUrl())
        .withHttpClient(hc)
        .build();
    return "redirect:/";
  }

  private String getAccountsHost(String cloud) {
    switch (cloud) {
      case "aws": return "https://accounts.cloud.databricks.com";
      case "azure": return "https://accounts.azuredatabricks.net";
      case "gcp": return "https://accounts.gcp.databricks.com";
    }
    throw new RuntimeException("Unexpected cloud: " + cloud);
  }

  @PostMapping("/make-new-app")
  public String makeNewApp(
      @RequestParam String username,
      @RequestParam String password,
      @RequestParam String cloud,
      @RequestParam("account_id") String accountId,
      @RequestParam String hostname) throws IOException {
    DatabricksConfig c = new DatabricksConfig()
        .setUsername(username)
        .setPassword(password)
        .setHost(getAccountsHost(cloud))
        .setAccountId(accountId)
        .setHttpClient(hc);
    AccountClient account = new AccountClient(c);
    account.oAuthEnrollment().create(new CreateOAuthEnrollment().setEnableAllPublishedApps(true));
    OAuthEnrollmentStatus status = account.oAuthEnrollment().get();
    CreateCustomAppIntegrationOutput result = account.customAppIntegration().create(
        "java-sdk-demo", Collections.singletonList(getRedirectUrl()));

    return initializeApp(result.getClientId(), result.getClientSecret(), hostname);
  }

  @GetMapping("/authenticate")
  public String authenticate(HttpSession session, Model model) throws MalformedURLException, JsonProcessingException {
    if (client == null) {
      model.addAttribute("authError", "Client is not yet initialized. Please login first.");
      return index(session, model);
    }

    Consent consent = client.initiateConsent();
    session.setAttribute("consent", consent);
    return "redirect:" + consent.getAuthUrl();
  }

  @GetMapping("/callback")
  public String callback(HttpSession session, @RequestParam Map<String, String> allParams) throws IOException {
    Consent consent = (Consent) session.getAttribute("consent");
    consent.setHttpClient(hc);
    RefreshableCredentials creds = consent.exchangeCallbackParameters(allParams);
    session.setAttribute("sessionCreds", creds);
    DatabricksConfig conf = new DatabricksConfig();
    conf.setCredentialsProvider(creds);
    conf.setHost(client.getHost());
    workspace = new WorkspaceClient(conf);
    return "redirect:/";
  }

  @GetMapping("/list-clusters")
  public String listClusters(Model model) {
    Iterable<ClusterInfo> clustersIterable = workspace.clusters().list(new ListClustersRequest());
    List<String> clusterNames = new ArrayList<>();
    clustersIterable.forEach(c -> clusterNames.add(c.getClusterName()));
    model.addAttribute("clusterNames", clusterNames);
    return "list-clusters";
  }
}
