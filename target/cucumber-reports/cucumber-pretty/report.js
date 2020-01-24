$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/registerPage.feature");
formatter.feature({
  "name": "Register Page Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@registerPage"
    }
  ]
});
formatter.scenario({
  "name": "Verify new User created",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@registerPage"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Register page",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterPage_STEPS.user_navigates_to_Register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Creates new User",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterPage_STEPS.creates_new_User()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies title is My Account",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterPage_STEPS.verifies_title_is_My_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});