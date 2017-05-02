angular.module("amazon").service("productService",['$http',function($http){


    this.productList = [];

    var that = this;


    this.getProductList= function(){
        return $http({

            method:"GET",
            url:"http://localhost:9898/amazon-app/amazon?searchStr="
        }).then(function(result){

            that.productList = result.data;
            return result.data
        });
        console.log(getProductList());

    };


    this.getProductListByName= function(name){
        return $http({

            method:"GET",
            url:"http://localhost:9898/amazon-app/amazon?searchStr="+name
        }).then(function(result){

            that.productList = result.data;
            return result.data
        });
        console.log(getProductListByName());

    };




/*
    this.postStudentData = function(dataParam){

        return $http({

            method:"POST",
            url:"/service/studentlist",
            data:dataParam




        }).then(function(result){
            return result.status;
        });
    };


    this.putStudentData = function(dataParam){

        console.log(dataParam.id);


        var idx=dataParam.id;


        return $http({

            method:"PUT",
            url:"/service/studentlist/"+idx,
            data:dataParam




        }).then(function(result){
            return result.status;
        });
    };

    this.deleteStudentData = function(dataParam){

        return $http({

            method:"delete",
            url:"/service/studentlist/"+dataParam





        }).then(function(result){
            return result.status;
        });
    };*/

}]);