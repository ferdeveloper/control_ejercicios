UpdateController.$inject = ["$scope", "ejercicioService", "$routeParams", '$http'];
function UpdateController($scope, ejercicioService, $routeParams, $http) {
    //$scope.ejercicio = {};
    //$scope.ejercicio.idEjercicio = $routeParams.idEjercicio;
    //$scope.ejercicio.nombreEjercicio = $routeParams.nombreEjercicio;

    $http({
        method: 'GET',
        url: '/russafa/api/Ejercicio/' + $routeParams.idEjercicio
    }).success(function (data, status, headers, config) {
        $scope.ejercicio = data;
    }).error(function (data, status, headers, config) {
        alert("Ha fallado la petición. Estado HTTP:" + status);
    });

//    $scope.actualizar = function () {
//        var response = ejercicioService.update($scope.ejercicio);
//
//        response.success(function (data, status, headers, config) {
//            alert("OK");
//
//        }).error(function (data, status, headers, config) {
//            if (status === 400) {
//                $scope.errores = data;
//            } else {
//                alert("Ha fallado la petición HTTP. Estado HTTP: " + status);
//
//            }
//
//        });
//    };
    
       $scope.actualizar = function () {
        ejercicioService.update($scope.ejercicio).then(function (result) {
            alert("Actualizado con Éxito el ejercicio: " + $scope.ejercicio.nombreEjercicio) + "\n Recargando...";
            $location.url("/admin")
        }, function (result) {
            if (result.status === 500) {
                alert("Ha fallado la petición. Estado HTTP:" + result.status);
            } else {
                $scope.businessMessages = result.data;
            }
        });
    };
}
app.controller("UpdateController", UpdateController);