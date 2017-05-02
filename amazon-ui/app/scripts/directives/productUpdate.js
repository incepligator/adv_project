"use strict";
angular.module("amazon").directive("productUpdate",[function(){

    return{

        restrict:"EA",
        templateUrl:"/app/views/productUpdate.html",
        controller:"productCtrl"
    }

}]);