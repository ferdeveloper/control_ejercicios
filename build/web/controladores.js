//Get Controller
app.controller("GetController", ['$scope', '$log', '$http', '$routeParams', function ($scope, $log, $http, $routeParams) {

        $http({
            method: 'GET',
            url: '/russafa/api/Ejercicio/' + $routeParams.idEjercicio
        }).success(function (data, status, headers, config) {
            $scope.ejercicio = data;
        }).error(function (data, status, headers, config) {
            alert("Ha fallado la petición. Estado HTTP:" + status);
        });

    }]);

//Update Controller
//app.controller("UpdateController", ['$scope', '$log', '$http', '$routeParams', function ($scope, $log, $http, $routeParams) {
//
//        $http({
//            method: 'PUT',
//            url: '/control_ejercicios_api/api/ejercicio/' + $routeParams.idEjercicio
//        }).success(function (data, status, headers, config) {
//                                                alert("asdf");
//            $scope.ejercicio = data;
//        }).error(function (data, status, headers, config) {
//            alert("Ha fallado la petición. Estado HTTP:" + status);
//        });
//
//    }]);