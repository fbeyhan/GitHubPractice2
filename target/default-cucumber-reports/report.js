$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\login\\Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a user I want to login under different types of accounts",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User logs in for auto policy",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@autopolicy"
    }
  ]
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user selects Auto as account type",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user logs in with valid credentials",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user verifies \"Dashboard\" name is displayed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});