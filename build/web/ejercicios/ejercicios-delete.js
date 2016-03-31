//DeleteController.$inject = ["$scope", "ejercicioDAO", "$routeParams"];
//function DeleteController($scope, ejercicioDAO, $routeParams) {
//
//    ejercicioDAO.get($routeParams.idEjercicio).success(function (data, status, headers, config) {
//        $scope.ejercicio = data;
//    }).error(function (data, status, headers, config) {
//        alert("Ha fallado la petición. Estado HTTP:" + status);
//    });
//
//    $scope.delete = function () {
//        var response;
//        response = ejercicioDAO.delete($routeParams.idEjercicio);
//
//        response.success(function (data, status, headers, config) {
//            //$scope.mensaje = "Borrado OK";
//            alert("Ok");
//        }).error(function (data, status, headers, config) {
//            alert("Ha fallado la petición. Estado HTTP:" + status);
//        });
//    };
//
//}
//app.controller("DeleteController", DeleteController);


//Delete Controller
app.controller("DeleteController", ['$scope', '$log', '$http', '$routeParams', '$location', function ($scope, $log, $http, $routeParams, $location) {

        $http({
            method: 'DELETE',
            url: '/control_ejercicios_api/api/ejercicio/' + $routeParams.idEjercicio
        }).success(function (data, status, headers, config) {
            $scope.ejercicio = data;
            alert("Borrado");
            $location.url("/admin")
        }).error(function (data, status, headers, config) {
            alert("Ha fallado la petición. Estado HTTP:" + status);
        });
        

    }]);