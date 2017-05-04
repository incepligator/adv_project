angular.module("amazon").controller("navCtrl",["$scope","checkIdService",function($scope,cis){

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

    $scope.checkid=cis.checkid;

    $scope.updateId=function (id){

        cis.updateId(id);
        console.log($scope.checkid+'from the control nav');
    }

    $scope.$watch(function(){
        return cis.checkid;
    }, function(newVal, oldVal){
           console.log("value have changed");
           if(newVal != oldVal) {
               $scope.checkid = newVal;
           }
    });






}]);