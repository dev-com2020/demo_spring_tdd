package com.example.demo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStepsTest {

    @Autowired
    private UserService userService;

    private String username;

    @Given("system jest gotowy do rejestracji użytkowników")
    public void givenSystemIsReady(){
//        inicjializacja systemu
    }
    @When("nowy użytkownik \"$username\" jest dodany")
    public void whenNewUserIsAdded(String username){
        this.username = username;
        userService.addUser(username);
    }
    @Then("lista użytkowników zawiera \"$username\"")
    public void thenUserListContains(String username){
        assertTrue(userService.containsUser(username),"Użytkownika brak :(");
    }
}
