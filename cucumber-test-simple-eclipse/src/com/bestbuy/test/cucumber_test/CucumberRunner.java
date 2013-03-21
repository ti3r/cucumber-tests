package com.bestbuy.test.cucumber_test;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;
import cucumber.junit.Cucumber.Options;


@RunWith(Cucumber.class)
@Options(features="features",strict=true,
tags="@all")
public class CucumberRunner {


}
