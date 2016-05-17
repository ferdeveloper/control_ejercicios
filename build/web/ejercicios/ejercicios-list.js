app.controller("ListController", ['$scope', '$log', '$http', function ($scope, $log, $http) {

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
            url: '/russafa/api/Ejercicios/'
        }).success(function (data, status, headers, config) {
            $scope.ejercicios = data;

        }).error(function (data, status, headers, config) {
            console.log('Falla');
            alert("Ha fallado la petición list. Estado HTTP:" + status);
        });

    }]);