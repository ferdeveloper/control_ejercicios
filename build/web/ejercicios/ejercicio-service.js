function EjercicioService($http, $routeParams) {

    this.list = function () {
        var response = $http(config = {
            method: 'GET',
            url: '/russafa/api/Ejercicios'
        });
        return response;
    };

    this.get = function (idEntidadBancaria) {
        var response = $http(config = {
            method: 'GET',
            url: '/russafa/api/Ejercicio/' + idEntidadBancaria

        });
        return response;
    };

    this.insert = function (ejercicio) {
        var response = $http({
            method: 'POST',
            url: '/russafa/api/Ejercicio',
            data: ejercicio

        });
        return response;
    };

    this.update = function (ejercicio) {
        var response = $http({
            method: 'PUT',
            url: '/russafa/api/Ejercicio',
            data: ejercicio

        });
        return response;
    };


//    this.delete = function (idEntidadBancaria) {
//        var response = $http(config = {
//            method: 'DELETE',
//            url: '/banco_api/api/entidadBancaria/' + idEntidadBancaria
//
//        });
//        return response;
//    };

}
EjercicioService.$inject = ['$http', '$routeParams'];
app.service("ejercicioService", EjercicioService);