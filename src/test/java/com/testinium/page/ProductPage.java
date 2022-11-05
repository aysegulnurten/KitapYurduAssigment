package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger;
    public ProductPage(){
        methods = new Methods();
        logger = LogManager. getLogger(ProductPage.class);
    }
    public void scrollAndSelect(By by){
        @Before
        methods.click(By.cssSelector("common-sprite.button-search"));
        methods.waitBySeconds(3);

        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".emre ve tahta oyuncak"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".Oyuncak Büyük Bultak Küp (01953)"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("span.personal-lists__text"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("common-sprite.Listelerim"));
        methods.waitBySeconds(3);
        //favorilere ekleyemedim


        methods.click(By.cssSelector("alt=alt=\"kitapyurdu.com\""));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("common-sprite.puan-katalogu"));
        methods.waitBySeconds(3);


        methods.click(By.xpath("landing-button //[@id=\"landing-point\"]/div[4]/a[2]/img");
        methods.waitBySeconds(3);

        methods.selectByText(By.cssSelector("select#review-sort-selection"), "Oylama (Yüksek > Düşük)");
        methods.waitBySeconds(5);

        methods.selectByText(By.xpath("//[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span", ));
        methods.waitBySeconds(3);
        //hobi kısmını yapamadım

        //random ürün seçemedim

        @Before
        methods.scrollWithAction(By.id("value=\"1\""));
        @After
        methods.scrollWithAction(By.id("value=\"2\""));

        methods.click(By.cssSelector("class=button red", document.querySelector("#cart_module > div.buttons > div.right > a")));
        methods.waitBySeconds(3);


        methods.click(By.id("id=address-firstname-companyname"), "Şirket");
        methods.click(By.id("id=address-lastname-title"),"Çalışan");
        methods.click(By.id("id=address-country-id"),"Turkey");
        methods.click(By.id("id=address-zone-id"),"İstanbul");
        methods.click(By.id("id=district",);
        methods.click(By.id("id=address-address-text"), "Soğanlık Yeni, No:, Pamukkale Sk. No:39,");
        methods.waitBySeconds(3);


        methods.click(By.id("id=credit-card-owner"), "Aysegul Nurten");
        methods.click(By.id("credit_card_number_1"), "9238");
        methods.click(By.id("credit_card_number_2"), "2343");
        methods.click(By.id("credit_card_number_3"), "4657");
        methods.click(By.id("credit_card_number_4"), "8475");
        methods.click(By.id("id=credit-card-expire-date-month"), "10");
        methods.click(By.id("id=credit-card-expire-date-year"),"2023");
        methods.click(By.id("credit-card-security-code"), "123");





        methods.click(By.cssSelector(".pr-img-link"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("review-reply-button"));
        methods.waitBySeconds(3);
        logger.info("scroll edildi");



    }

    public void  randomElement(){
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.randomElement(By.cssSelector(".pr-img-link"));
        methods.waitBySeconds(5);
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"), "title");
        System.out.println("Alınan text" + attribute);
        logger.info("Alınan text: " + attribute);
        methods.waitBySeconds(3);
    }

    public void textControl(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text" + text);
        logger.info("Alınan text:" + text);
        methods.waitBySeconds(3);
    }

    public void valueControl(){
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text" + value);
        Assert.assertEquals("Oyuncak", value);
        methods.waitBySeconds(5);
    }

driver.quit("https://www.kitapyurdu.com/index.php?route=checkout/checkout#PaymentMethod");

}


//ilk driver.findElement ile gittim daha sonra yaptığımız örnekte farklı gittiğimizi gördüm örnek üzerinden ilerlemeye
//gittim. Locators ile sıkıntı yaşadım. Ide ve Selenium kullanımında büyük eksiklerim var ancak incele tuşu ile ne yapmak
//istediğimizi anladım