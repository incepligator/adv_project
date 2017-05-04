"use strict";
angular.module("amazon").controller("productCtrl",

["$scope","$http","productService","checkIdService",function($scope,$http,productService,cis){






    $scope.productListModel=
    {
        "activeDate": "",
        "category": "",
        "createDate": "",
        "desc": "",
        "manufac": "",
        "pname": "",
        "porderQuantity": "",
        "pquantity": "",
        "price": "",
        "pthreshold": "",
        "upc": "",
        "pnumber":"",
        "pk":"",
        "version": "",
        "inactiveDate": ""

    }






        $scope.postProduct=function (){

        alert("postProduct");


            productService.postProductList($scope.productListModel).then(function(response){

            alert("success data write in server")});

    };

    $scope.putProductUpdate=function (){

        alert("putProduct");


        productService.putProductList($scope.productListModel).then(function(response){

            alert("success updated")});

    };






        $scope.$watch(function(){
            return cis.productModelService;
        }, function(newVal, oldVal){
                $scope.productListModel = newVal;
        })
        console.log($scope.productListModel);
        console.log(cis.productModelService);

    }]);