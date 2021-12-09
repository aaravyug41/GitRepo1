@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario1
    Given I want to write a step with precondition
    And some other precondition
    
     @tag2
  Scenario: Title of your scenario2
    Given I want to write a step with preconditio
    And some other preconditio
    
    
 # simple parameter passing   
 @tag3
  Scenario: Title of your scenario3
    Given I want to write a step 10 precondition1
    And some other  precondition1
    
# Datatable with list 
@tag4
  Scenario: Title of your scenario4
    Given I want to write a step precondition2
    |pramod|
    |parveen|
    And some other  precondition2
    
 # Datatable with map
@tag5
  Scenario: Title of your scenario5
    Given I want to write a step precondition3
    |name|rollno|
    |pramod|456|
    |parveen|123|
    And some other  precondition2
    
    # scenario outline 
@tag6
  Scenario Outline: Title of your scenario6
    Given I want to write a step "<name>" precondition4 "<rollno>"
    And some other  precondition2
    
    Examples:
    |name|rollno|
    |parveen|123|
    |pramod|456|
    
   

