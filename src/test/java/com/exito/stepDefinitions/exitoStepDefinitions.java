package com.exito.stepDefinitions;

import com.exito.steps.HomePageSteps;
import com.exito.steps.ProductsPageSteps;
import com.exito.steps.ShoppingCartPageSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class exitoStepDefinitions {

    @Steps
    HomePageSteps homePageSteps;
    @Steps
    ProductsPageSteps productsPageSteps;
    @Steps
    ShoppingCartPageSteps shoppingCartPageSteps;

    @Given("User clicks on the category dropdown menu")
    public void userClicksOnTheCategoryDropdownMenu(){
        homePageSteps.openPage();
        homePageSteps.closeAdd();
        homePageSteps.categorieSelect();
    }
    @Given("select any subcategory of the product")
    public void selectAnySubcategoryOfTheProduct() {
        homePageSteps.subcategorieSelect();
    }
    @When("User adds any product to cart")
    public void userAddsAnyProductToCart() {
        productsPageSteps.engraveProductName();
        productsPageSteps.addProdctCart();
    }
    @When("click the my cart button")
    public void clickTheMyCartButton() {
        productsPageSteps.clickCartPage();
    }
    @Then("User will be able to view the product in the shopping cart")
    public void userWillBeAbleToViewTheProductInTheShoppingCart() {
        shoppingCartPageSteps.validateProductoInShoppingCart();
    }
}
