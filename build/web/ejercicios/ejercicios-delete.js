DeleteController.$inject = ["$scope", "ejercicioService", "$routeParams", '$http', '$location'];
function DeleteController($scope, ejercicioService, $routeParams, $http, $location) {

    $http({
        method: 'GET',
        url: '/russafa/api/Ejercicio/' + $routeParams.idEjercicio
    }).success(function (data, status, headers, config) {
        $scope.ejercicio = data;
    }).error(function (data, status, headers, config) {
        alert("Ha fallado la petición. Estado HTTP:" + status);
    });

    $scope.borrar = function () {
        ejercicioService.delete($scope.ejercicio.idEjercicio).then(function (result) {
            alert("Borrado con éxito el ejercicio: " + $scope.ejercicio.nombreEjercicio) + "\n Recargando...";
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
app.controller("DeleteController", DeleteController);