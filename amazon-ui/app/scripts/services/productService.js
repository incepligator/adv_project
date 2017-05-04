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
       // console.log(getProductList());

    };


    this.postProductList = function(dataParam){

            return $http({

                method:"POST",
                url:"http://localhost:9898/amazon-app/amazon",
                data:dataParam




            }).then(function(result){
                return result.status;
            });
    };
        this.putProductList = function(dataParam){

            return $http({

                method:"PUT",
                url:"http://localhost:9898/amazon-app/amazon",
                data:dataParam




            }).then(function(result){
                return result.status;
            });
        };

    this.removeProduct = function(pk){

        return $http({

            method:"DELETE",
            url:"http://localhost:9898/amazon-app/amazon/"+pk





        }).then(function(result){
            return result.status;
        });
    };

        }] );



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


