$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shefali.singh.GROUPINFRA/eclipse-workspace/FacebookBDDFramework/src/test/java/features/hookAndTags.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks Demo in definition file",
  "description": "",
  "id": "hooks-demo-in-definition-file",
  "keyword": "Feature"
});
formatter.before({
  "duration": 738095,
  "status": "passed"
});
formatter.before({
  "duration": 161542,
  "status": "passed"
});
formatter.before({
  "duration": 459190,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Hooks Demo in definition file",
  "description": "",
  "id": "hooks-demo-in-definition-file;hooks-demo-in-definition-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@MyTag"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "dummy step",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksAndTagsStepDefinition.dummy_step()"
});
formatter.result({
  "duration": 280401445,
  "status": "passed"
});
formatter.after({
  "duration": 209737,
  "status": "passed"
});
formatter.after({
  "duration": 99960,
  "status": "passed"
});
formatter.after({
  "duration": 137890,
  "status": "passed"
});
});