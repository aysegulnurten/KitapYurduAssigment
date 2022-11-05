package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }
    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-email"),"aysegul.nurten@testinium.com");
        methods.waitBySeconds(5);
        methods.sendKeys(By. cssSelector("ky-from-group>#login-password")," password unutma123");
        methods.waitBySeconds(5);
        methods.click(By. cssSelector(".ky-login-btn"));
        methods.waitBySeconds(15);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".common-sprite>b")));
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("input[name='search_keyword']")).sendKeys("Oyuncak");



    }
}
