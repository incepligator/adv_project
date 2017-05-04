"use strict";

angular.module("amazon").controller("productPutCtrl", function($scope, checkIdService, productService){




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



    $scope.removeProduct=function (product){

        var answer = confirm("Are you Sure ?")

        if (answer) {

            productService.removeProduct(product).then(function(response){

                alert("success deleted ")});
        }
        else {

        }




    };

});