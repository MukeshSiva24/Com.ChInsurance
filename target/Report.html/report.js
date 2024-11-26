$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Task.feature");
formatter.feature({
  "name": "ChInsurance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Give Review and View Company Location in Map",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User click the service Module",
  "keyword": "When "
});
formatter.step({
  "name": "Validate dropdown data",
  "keyword": "Then "
});
formatter.step({
  "name": "user Click The personal Insurance",
  "keyword": "When "
});
formatter.step({
  "name": "Validate The Personal Insurance Page is Navigated",
  "keyword": "Then "
});
formatter.step({
  "name": "user Click Policy Review",
  "keyword": "When "
});
formatter.step({
  "name": "Validate Lets Talk Popup is Visible",
  "keyword": "Then "
});
formatter.step({
  "name": "Validate The Address is Visible in popup",
  "keyword": "And "
});
formatter.step({
  "name": "User Click the Map and Satellite",
  "keyword": "When "
});
formatter.step({
  "name": "User Click Full Screen, Zoom in and Zoom Out in Map",
  "keyword": "And "
});
formatter.step({
  "name": "User Enter the Name, Email, Subject and Message \"\u003cName\u003e\" \"\u003cEmailID\u003e\" \"\u003cSubject\u003e\" \"\u003cMessage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Click The Submit",
  "keyword": "And "
});
formatter.step({
  "name": "Validate The Message is Visible after Submit \"\u003cSubmit Message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "EmailID",
        "Subject",
        "Message",
        "Submit Message"
      ]
    },
    {
      "cells": [
        "Mani",
        "ma3@gmail.com",
        "Best Point",
        "Good",
        "Thanks for submitting!"
      ]
    }
  ]
});
formatter.background({
  "name": "Launch The Application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch The CHInsurance Application \"https://www.chinsurance.cc/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CHStepDefinition.Steps.launch_the_ch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Give Review and View Company Location in Map",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User click the service Module",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.user_click_the_service_module()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate dropdown data",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_dropdown_data()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user Click The personal Insurance",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.user_click_the_personal_insurance()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate The Personal Insurance Page is Navigated",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_the_personal_insurance_page_is_navigated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user Click Policy Review",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.user_click_policy_review()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Lets Talk Popup is Visible",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_lets_talk_popup_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate The Address is Visible in popup",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_the_address_is_visible_in_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Click the Map and Satellite",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.user_click_the_map_and_satellite()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Click Full Screen, Zoom in and Zoom Out in Map",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.user_click_full_screen_zoom_in_and_zoom_out_in_map()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Enter the Name, Email, Subject and Message \"Mani\" \"ma3@gmail.com\" \"Best Point\" \"Good\"",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.user_enter_the_name_email_subject_and_message(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded10.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Click The Submit",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.user_click_the_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded11.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate The Message is Visible after Submit \"Thanks for submitting!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_the_message_is_visible_after_submit(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded12.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.write("this is Pass");
formatter.embedding("image/png", "embedded13.png", "Pass");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Veriy The Post in Personal Insurance and give Comments",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Click HI-V Blog Module",
  "keyword": "When "
});
formatter.step({
  "name": "Click Personal Insurance",
  "keyword": "And "
});
formatter.step({
  "name": "Validate Latest Post is Visible in Top",
  "keyword": "Then "
});
formatter.step({
  "name": "Click The First Post in Top",
  "keyword": "When "
});
formatter.step({
  "name": "Validate The Latest Post is Navigated",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Like button",
  "keyword": "When "
});
formatter.step({
  "name": "Validate Number of Like is Visible",
  "keyword": "Then "
});
formatter.step({
  "name": "Click The Comment and Enter the Comments \"\u003cComment\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click and Enter The Emoji and GIFI in Comment \"\u003cGIFI Search\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Size in GIFI and Adjust it Compact mode",
  "keyword": "And "
});
formatter.step({
  "name": "Click Aligment and Adjust it left",
  "keyword": "And "
});
formatter.step({
  "name": "Click The Cancel button in Comment",
  "keyword": "And "
});
formatter.step({
  "name": "Click the Discard button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Comment",
        "GIFI Search"
      ]
    },
    {
      "cells": [
        "Hi",
        "Happy"
      ]
    }
  ]
});
formatter.background({
  "name": "Launch The Application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch The CHInsurance Application \"https://www.chinsurance.cc/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CHStepDefinition.Steps.launch_the_ch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded14.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Veriy The Post in Personal Insurance and give Comments",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Click HI-V Blog Module",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_hi_v_blog_module()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded15.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Personal Insurance",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_Personal_Insurance()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded16.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Latest Post is Visible in Top",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_latest_post_is_visible_in_top()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded17.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click The First Post in Top",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_the_first_post_in_top()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded18.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate The Latest Post is Navigated",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_the_latest_post_is_navigated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded19.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Like button",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_like_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded20.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Number of Like is Visible",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_number_of_like_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded21.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click The Comment and Enter the Comments \"Hi\"",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_The_Comment_and_Enter_the_Comments(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded22.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click and Enter The Emoji and GIFI in Comment \"Happy\"",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_and_Enter_The_Emoji_and_GIFI_in_Comment(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded23.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Size in GIFI and Adjust it Compact mode",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_Size_in_GIFI_and_Adjust_it_Compact_mode()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded24.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Aligment and Adjust it left",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_Aligment_and_Adjust_it_left()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded25.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click The Cancel button in Comment",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_The_Cancel_button_in_Comment()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded26.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click the Discard button",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_the_Discard_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded27.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.write("this is Pass");
formatter.embedding("image/png", "embedded28.png", "Pass");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch The Application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch The CHInsurance Application \"https://www.chinsurance.cc/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CHStepDefinition.Steps.launch_the_ch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded29.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Office Location",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Click The Contact Moduke",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_the_contact_moduke()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded30.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Dropdown Data in Contact Module",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_dropdown_data_in_contact_module()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded31.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click CGinsurance Syracus,Ny",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_c_ginsurance_syracus_ny()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded32.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Company Information Page is Navigated",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_company_information_page_is_navigated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded33.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Map and Satellite",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_map_and_satellite()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded34.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Zoom in and Zoom Out",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_zoom_in_and_zoom_out()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded35.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Road View",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_road_view()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded36.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Full Screen Mode and Click Exit Full Screen",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_full_screen_mode_and_click_exit_full_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded37.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.write("this is Pass");
formatter.embedding("image/png", "embedded38.png", "Pass");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Click Client Access Module",
  "keyword": "When "
});
formatter.step({
  "name": "Click Csr24 Login Portal",
  "keyword": "And "
});
formatter.step({
  "name": "Validate Login Page Navigate to new Tab",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter The UserName \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter The Password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click The Login button",
  "keyword": "And "
});
formatter.step({
  "name": "Validate Invalide Message is Visible after login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "Mukesh",
        "Mukeshsinsn@24"
      ]
    }
  ]
});
formatter.background({
  "name": "Launch The Application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch The CHInsurance Application \"https://www.chinsurance.cc/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CHStepDefinition.Steps.launch_the_ch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded39.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Click Client Access Module",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_client_access_module()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded40.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Csr24 Login Portal",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_csr24_login_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded41.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Login Page Navigate to new Tab",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_login_page_navigate_to_new_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded42.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter The UserName \"Mukesh\"",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.enter_the_user_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded43.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter The Password \"Mukeshsinsn@24\"",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.enter_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded44.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click The Login button",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded45.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Invalide Message is Visible after login",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_invalide_message_is_visible_after_login()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded46.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.write("this is Pass");
formatter.embedding("image/png", "embedded47.png", "Pass");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create New Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Click Client Access Module",
  "keyword": "When "
});
formatter.step({
  "name": "Click Csr24 Login Portal",
  "keyword": "And "
});
formatter.step({
  "name": "Validate Login Page Navigate to new Tab",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Create New Account",
  "keyword": "When "
});
formatter.step({
  "name": "Enter The EmailID \"\u003cEmailID\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter The PhoneNo \"\u003cPhoneNo\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter The Policy Number \"\u003cPolicyNo\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Create Account",
  "keyword": "And "
});
formatter.step({
  "name": "Validate Invalide Message is Visible after CreateAccount",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "EmailID",
        "PhoneNo",
        "PolicyNo"
      ]
    },
    {
      "cells": [
        "mukeshser24@gmail.com",
        "8755848845",
        "875222222222"
      ]
    }
  ]
});
formatter.background({
  "name": "Launch The Application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch The CHInsurance Application \"https://www.chinsurance.cc/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CHStepDefinition.Steps.launch_the_ch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded48.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Click Client Access Module",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_client_access_module()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded49.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Csr24 Login Portal",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_csr24_login_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded50.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Login Page Navigate to new Tab",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_login_page_navigate_to_new_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded51.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Create New Account",
  "keyword": "When "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded52.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter The EmailID \"mukeshser24@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.enter_the_email_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded53.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter The PhoneNo \"8755848845\"",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.enter_the_phone_no(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded54.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter The Policy Number \"875222222222\"",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.enter_the_policy_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded55.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Create Account",
  "keyword": "And "
});
formatter.match({
  "location": "CHStepDefinition.Steps.click_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded56.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate Invalide Message is Visible after CreateAccount",
  "keyword": "Then "
});
formatter.match({
  "location": "CHStepDefinition.Steps.validate_invalide_message_is_visible_after_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded57.png", " ");
formatter.afterstep({
  "status": "passed"
});
formatter.write("this is Pass");
formatter.embedding("image/png", "embedded58.png", "Pass");
formatter.after({
  "status": "passed"
});
});