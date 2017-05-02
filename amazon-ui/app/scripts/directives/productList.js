"use strict";
angular.module("amazon").directive("productList",[function(){

    return{

        restrict:"EA",
        templateUrl:"/app/views/productList.html",
        controller:"productCtrl"
    }

}]);