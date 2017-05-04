"use strict";
// alert("new crtl outside");
angular.module("amazon").controller("productPutCtrl", function($scope, checkIdService, productService){
    // alert("new crtl inside");
    $scope.productList=[];

    var productListPromise=productService.getProductList();


    productListPromise.then(function(response){

        $scope.productList=response.products;

 //       console.log($scope.productList);


    });


    $scope.putProduct=function(product){
        // console.log($scope.productListModel);
        checkIdService.productModelService = angular.copy(product);
        console.log(checkIdService.productModelService);
        checkIdService.checkid=2;
    }
});