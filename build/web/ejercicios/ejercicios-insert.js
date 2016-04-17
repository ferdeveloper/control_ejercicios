InsertController.$inject = ["$scope", "ejercicioService", "$routeParams", '$http', '$location'];
function InsertController($scope, ejercicioService, $routeParams, $http, $location) {

    $scope.insertar = function () {
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
//
////InsertController.$inject = ["$scope", "ejercicioService", "$location"];
//function InsertController($scope, ejercicioService, $location) {
//
//    $scope.ejercicio = {};
//    $scope.date = new Date();
//    $scope.fechaActual = $scope.date.toJSON();
//
//    $scope.insertar = function () {
//        response = ejercicioService.insert($scope.ejercicio);
//
//        response.success(function (data, status, headers, config) {
//            alert("Insertado.");
//            if ($scope.formularioInsert.$valid) {
//                alert("Los datos aqui se habrían enviado al servidor  y estarían validados en la parte cliente");
//            } else {
//                alert("Hay datos inválidos");
//            }
//            //$location.url("/admin")
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
//}

