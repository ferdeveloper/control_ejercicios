UpdateController.$inject = ["$scope", "ejercicioService", "$routeParams", '$http', '$location', '$filter'];
function UpdateController($scope, ejercicioService, $routeParams, $http, $location, $filter) {
    
    var fechaFormateada;

    $http({
        method: 'GET',
        url: '/russafa/api/Ejercicio/' + $routeParams.idEjercicio
    }).success(function (data) {
    }).success(function (data, status, headers, config) {
        $scope.ejercicio = data;
        var formatoFechaRecibida = new Date($scope.ejercicio.fechaEjercicio);
        $scope.ejercicio.fechaEjercicio = formatoFechaRecibida.format("russafaDate");
    }).error(function (data, status, headers, config) {
        alert("Ha fallado la petición. Estado HTTP:" + status);
    });
    
    $scope.changeDatepickerDate = function () {
       fechaFormateada = new Date($scope.ejercicio.fechaEjercicio);
       $scope.ejercicio.fechaEjercicio = fechaFormateada.format("russafaDate"); 
    };

    $scope.actualizar = function () {
        $scope.ejercicio.fechaEjercicio = fechaFormateada.format("isoDate");
        
        ejercicioService.update($scope.ejercicio).then(function (result) {
            alert("Actualizado con Éxito el ejercicio: " + $scope.ejercicio.nombreEjercicio) + "\n Recargando...";
            $location.url("/admin");
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
