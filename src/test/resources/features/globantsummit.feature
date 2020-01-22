Feature: Guest registration
    Scenario: Register a guest
        When I fill out the form
        | name | email | address   | city | state |
        | liliana | liliana@globant.com | call 12 | Bogota | Cundinamarca |
        And I submit
        Then I should see the record on list page
