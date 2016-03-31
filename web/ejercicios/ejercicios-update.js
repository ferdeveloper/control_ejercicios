//app.controller("UpdateController", UpdateController);
//
//function UpdateController($scope, ejercicioService, $routeParams) {
//
//
//    $scope.ejercicio = {};
//    $scope.ejercicio.idEjercicio = $routeParams.idEjercicio;
//
//    $scope.actualizar = function () {
//        var response = ejercicioService.update($scope.ejercicio);
//        response.success(function (data, status, headers, config) {
//            alert("OK");
//        }).error(function (data, status, headers, config) {
//            alert("Ha fallado la petición. Estado HTTP:" + status);
//            console.log(data);
//        });
//    }
//}
//
//UpdateController.$inject = ["$scope", "ejercicioService", "$routeParams"];


UpdateController.$inject = ["$scope", "ejercicioService", "$routeParams"];
function UpdateController($scope, ejercicioService, $routeParams) {
    $scope.ejercicio = {};
    $scope.ejercicio.idEjercicio = $routeParams.idEjercicio;
    //$scope.ejercicio.nombreEjercicio = $routeParams.nombreEjercicio;

    $scope.actualizar = function () {
        var response = ejercicioService.update($scope.ejercicio);

        response.success(function (data, status, headers, config) {
            alert("OK");

        }).error(function (data, status, headers, config) {
                if(status === 400){
                    $scope.errores = data;
                }else{
                    alert("Ha fallado la petición HTTP. Estado HTTP: "+status);
                    
                }
            
        });
    };
}
app.controller("UpdateController", UpdateController);