InsertController.$inject = ["$scope", "ejercicioService", "$routeParams", '$http', '$location'];
function InsertController($scope, ejercicioService, $routeParams, $http, $location) {

    var fechaFormateada;
    
    $scope.changeDatepickerDate = function () {
       fechaFormateada = new Date($scope.ejercicio.fechaEjercicio);
       $scope.ejercicio.fechaEjercicio = fechaFormateada.format("russafaDate"); 
    };

    $scope.insertar = function () {
        $scope.ejercicio.fechaEjercicio = fechaFormateada.format("isoDate");
        
        if ($scope.formularioInsert.$valid) {
            ejercicioService.insert($scope.ejercicio).then(function (result) {
                alert("Insertado con éxito el ejercicio: " + $scope.ejercicio.nombreEjercicio) + "\n Recargando...";
                $location.url("/admin");
            }, function (result) {
                if (result.status === 500) {
                    alert("Ha fallado la petición. Estado HTTP:" + result.status);
                } else {
                    $scope.businessMessages = result.data;
                }
            });
        } else {
            alert("Hay datos inválidos");
        }
    };
    
}
app.controller("InsertController", InsertController);
