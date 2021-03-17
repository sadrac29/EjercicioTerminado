# Author: Erick Martinez
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with automation course
    @scenario1
    Scenario: Search for a automation course
      Given than brandon want to learn automation at the academy Choucair
      | strUser  | strPassword   |
      | 88702430 | Choucair2021* |
      When he search for the course  on the choucair academy plataform
      | strCourse               |
      | Metodología Bancolombia |
      Then he finds the course called resources
      | strCourse               |
      | Metodología Bancolombia |

