package com.cydeo.step_definitions;


import io.cucumber.java.*;

//In the class  we will  be able to pass pre- post conditions to each scenario and  each step
public class Hooks {


    // import  from  io.cucumber.java not from junit
    @Before(order = 0)
    public void setupScenario() {
        System.out.println("---Setting up browser using cucumber  @Before");

    }

    @Before(value = "@login",order = 1)
    public void setupScenarioForLogins() {
        System.out.println("---this will only apply to scenarios with @login tag");

    }

    @Before(value = "@db",order = -1)
    public  void setupScenarioDatabaseScenarios(){
        System.out.println("---this will only apply to scenarios with @db tag");

    }

    @After
    public void teardownScenario() {

        System.out.println("---Closing  browser using  cucumber @After");
        System.out.println("---Scenario ended / Take screen shot if failed!");
    }

    @BeforeStep
    public void setupStep() {
        System.out.println("------applying setup @BeforeStep");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("-------->> applying teardown using  @AfterStep");
    }

}
