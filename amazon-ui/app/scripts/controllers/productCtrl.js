"use strict";
angular.module("amazon").controller("productCtrl",

["$scope","$http","productService",function($scope,$http,productService){


        $scope.productList=[];

        var productListPromise=productService.getProductList();


            productListPromise.then(function(response){

            $scope.productList=response.products;

            console.log($scope.productList);


        });


    }]);