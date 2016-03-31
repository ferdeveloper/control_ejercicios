InsertController.$inject = ["$scope", "ejercicioService", "$location"];
function InsertController($scope, ejercicioService, $location) {

    $scope.ejercicio = {};
    $scope.date = new Date();
    $scope.fechaActual = $scope.date.toJSON();

    $scope.insertar = function () {
        response = ejercicioService.insert($scope.ejercicio);

        response.success(function (data, status, headers, config) {
            alert("Insertado.");
            if ($scope.formularioInsert.$valid) {
                alert("Los datos aqui se habrían enviado al servidor  y estarían validados en la parte cliente");
            } else {
                alert("Hay datos inválidos");
            }
            //$location.url("/admin")

        }).error(function (data, status, headers, config) {
            if (status === 400) {
                $scope.errores = data;
            } else {
                alert("Ha fallado la petición HTTP. Estado HTTP: " + status);

            }

        });
    };
}

