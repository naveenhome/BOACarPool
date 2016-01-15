Feature: Post a Ride
  As a employee I want to share my car So that anyone can travel with me

  Scenario: Correct data posting
    Given employee enter all data correctly
    When click on Submit
    Then System display message "Posting successful."

@myTag
  Scenario: C
  orrect data posting with details
    Given employee enter Name as "Naveen", email as "naveen.singh@leanpitch.com", Phone no is "9810547500" and orgin is "Gurgaon" and Destination is "Delhi" and Time will be "5:30pm"
    When click on "Submit"
    Then System display message "Posting successful."

  Scenario: Name can't be blank
    Given employee enter Name as " ", email as "naveen.singh@leanpitch.com", Phone no is "9810547500" and orgin is "Gurgaon" and Destination is "Delhi" and Time will be "5:30pm"
    When click on "Submit"
    Then System display message "Posting successful."

  Scenario: Correct data posting
    Given employee is logged In on portal
    And employee enter all data correctly
    When click on Submit
    Then System display message "Posting successful."
    And data should on top on next page
