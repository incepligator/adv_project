angular.module("amazon").controller("navCtrl",["$scope",function($scope){

    $scope.navList=[{
        "title":"Product List",
        "id":1
    },
        {
            "title":"Product Post",
            "id":2
        },
        {
            "title":"Product Update",
            "id":3
        },
        {
            "title":"Product Remove",
            "id":4
        },
        {
            "title":"Product Contacts",
            "id":5
        }
    ];



    $scope.checkid=4  ;

    $scope.updateId=function (id){

        $scope.checkid=id;
    }




}]);