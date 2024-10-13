Feature: Template Resource is created with name and date

  Scenario Outline: Template Resource creation
    Given an empty list of resources
    When adding a new Resource
    Then the list contains <expectedResources> resource

    Examples:
      | expectedResources |
      | 1                 |
