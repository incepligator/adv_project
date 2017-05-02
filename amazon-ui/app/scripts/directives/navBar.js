"use strict";
angular.module("amazon").directive("navBar",[function(){

    return{

        restrict:"EA",
        templateUrl:"/app/views/navBar.html",
        controller:"navCtrl"
    }


}]);