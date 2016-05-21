UpdateController.$inject = ["$scope", "ejercicioService", "$routeParams", '$http', '$location'];
function UpdateController($scope, ejercicioService, $routeParams, $http, $location) {

    var fechaFormateada;
    var isDate = false;

    $scope.categoria = {
        categoriasDisponibles: [
            {id: '1', name: 'Solfeo'},
            {id: '2', name: 'Percusión'},
            {id: '3', name: 'Dolçaina'},
            {id: '4', name: 'Conjunto percusión'},
            {id: '5', name: 'Conjunto dolçaina'},
            {id: '6', name: 'Conjunto intrumental'}
        ]
    };

    $scope.curso = {
        cursosDisponibles: [
            {id: '1', name: 'Infantil'},
            {id: '2', name: 'Primero'},
            {id: '3', name: 'Segundo'},
            {id: '4', name: 'Tercero'},
            {id: '5', name: 'Cuarto'},
            {id: '6', name: 'Adulto'}
        ]
    };

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
        getDate();
        isDate = false;
    };


    $scope.actualizar = function () {
        if (!isDate)
        {
            getDate();
        }
        
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

    function getDate() {
        fechaFormateada = new Date($scope.ejercicio.fechaEjercicio);
        $scope.ejercicio.fechaEjercicio = fechaFormateada.format("russafaDate");
    };
}
app.controller("UpdateController", UpdateController);
