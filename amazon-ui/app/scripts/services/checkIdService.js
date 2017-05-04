angular.module("amazon").service("checkIdService",[function(){


    this.productModelService = {};
   this.checkid=4;

    this.updateId=function(id){

        this.checkid=id;


        console.log(this.checkid);
    }


}]);


